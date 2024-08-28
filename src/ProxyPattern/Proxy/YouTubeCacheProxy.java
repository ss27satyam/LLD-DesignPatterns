package ProxyPattern.Proxy;

import ProxyPattern.VideoMediaLib.ThirdPartyYoutubeClass;
import ProxyPattern.VideoMediaLib.ThirdPartyYoutubeLib;
import ProxyPattern.VideoMediaLib.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeLib ytService;
    private HashMap<String,Video> cachePopular = new HashMap<String,Video>();
    private HashMap<String,Video> cacheAll = new HashMap<String,Video>();

    public YouTubeCacheProxy(){
        this.ytService = new ThirdPartyYoutubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if( cachePopular.isEmpty() ){
            cachePopular = ytService.popularVideos();
        } else {
            System.out.println( "Retrieved list from the cache" );
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video requestedVideo;
        if( cacheAll.containsKey( videoId ) ){
            requestedVideo = cacheAll.get( videoId );
            System.out.println( "Retrived video  " +  videoId + " from the cache." );
        } else{
            requestedVideo = ytService.getVideo( videoId );
            cacheAll.put( videoId, requestedVideo );
        }

        return requestedVideo;
    }
}
