package proxy;

import java.util.List;

public class YoutubeManager {

    protected ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public void renderVideo() {
        VideoInfo info = service.getVideoInfo(0);
        // Render of the video in page
    }

    public void renderListPanel() {
        List<Video> list = service.listVideos();
        // Render list of videos
    }

    public void reactOnUserInput() {
        this.renderVideo();
        this.renderListPanel();
    }

}
