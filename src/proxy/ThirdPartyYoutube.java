package proxy;

import java.util.LinkedList;
import java.util.List;

public class ThirdPartyYoutube implements ThirdPartyYoutubeLib {

    @Override
    public List<Video> listVideos() {
        // Send API request to YouTube and return videos
        return new LinkedList<Video>();
    }

    @Override
    public VideoInfo getVideoInfo(int id) {
        // Get a meta information about some video.
        return new VideoInfo();
    }

    @Override
    public void downloadVideo(int id) {
        // Download video file from Youtube.
    }

}
