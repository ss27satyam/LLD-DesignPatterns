package ProxyPattern.VideoMediaLib;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo( videoId );
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com" );
        return getRandomVideos();
    }
    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.

    private HashMap<String, Video> getRandomVideos() {
        HashMap<String, Video> hmap = new HashMap<String,Video>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.print("Done!" + "\n");
        return hmap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.print( "Downloading video... " );
        Video video = new Video( videoId, "Some video title" );

        System.out.print( "Done!\n" );
        return video;
    }

    private void connectToServer(String s) {
        System.out.println( "Connecting to server : " + s + "..." );
        injectNetworkLatency();
        System.out.println( "Connected. \n");
    }

    private void injectNetworkLatency() {
        int latency = (int) Math.random() * 5;
        for( int i=0; i < latency; ++i ){
            try{
                Thread.sleep(100 );
            } catch ( InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
