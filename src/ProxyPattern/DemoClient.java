package ProxyPattern;

import ProxyPattern.Proxy.YouTubeCacheProxy;
import ProxyPattern.VideoDownloader.YouTubeVideoDownloader;
import ProxyPattern.VideoMediaLib.ThirdPartyYoutubeClass;


public class DemoClient {
    public static void main( String[] args ){
        YouTubeVideoDownloader naiveDownloader = new YouTubeVideoDownloader( new ThirdPartyYoutubeClass() );
        YouTubeVideoDownloader smartDownloader = new YouTubeVideoDownloader( new YouTubeCacheProxy() );

        long naive = test( naiveDownloader );
        System.out.print("Time elapsed: " + naive + "ms\n");

        System.out.print("\nUSING SMART DOWNLOADER");
        long smart = test( smartDownloader );
        System.out.print("Time elapsed: " + smart + "ms\n");
        System.out.print("\n===========================================");
        System.out.println( "Time saved by having proxy class : " + (naive - smart) + "ms" );
    }

    private static long test( YouTubeVideoDownloader downloader ){
        long startTime = System.currentTimeMillis();

        // perform some operations on downloader
        downloader.renderPopularVideos();
        downloader.renderVideoPage( "catzzzzzzzzz" );
        downloader.renderPopularVideos();
        downloader.renderVideoPage( "dancesvideoo" );
        // User might want to visit again
        downloader.renderVideoPage( "catzzzzzzzzz" );

        long currentTime = System.currentTimeMillis();
        long estimatedTimeTaken = currentTime - startTime;

        return estimatedTimeTaken;
    }
}
