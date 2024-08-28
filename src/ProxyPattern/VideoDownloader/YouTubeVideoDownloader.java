package ProxyPattern.VideoDownloader;

import ProxyPattern.VideoMediaLib.ThirdPartyYoutubeLib;
import ProxyPattern.VideoMediaLib.Video;

import java.util.HashMap;

public class YouTubeVideoDownloader {
    private ThirdPartyYoutubeLib helper;

    public YouTubeVideoDownloader( ThirdPartyYoutubeLib helper ){
        this.helper = helper;
    }

    public void renderVideoPage( String videoId ){
        Video video = helper.getVideo( videoId );
        System.out.println( "\n======================================" );
        System.out.println( "Video ID : " + video.id );
        System.out.println( "Video Title : " + video.title );
        System.out.println( "Video : " + video.data );
        System.out.println( "\n======================================" );
    }

    public void renderPopularVideos(){
        HashMap<String,Video> list = helper.popularVideos();
        System.out.println( "Most popular videos on YouTube" );
        for ( Video video : list.values() ) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}
