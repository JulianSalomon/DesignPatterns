package proxy;

import java.util.List;

public class CachedYoutube implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeLib service;
    private List<Video> listCache;
    private VideoInfo videoCache;
    private boolean needReset;

    public CachedYoutube(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    @Override
    public List<Video> listVideos() {
        if (this.listCache == null || needReset) {
            this.listCache = this.service.listVideos();
        }
        return listCache;
    }

    @Override
    public VideoInfo getVideoInfo(int id) {
        if (this.videoCache == null || needReset) {
            this.videoCache = this.service.getVideoInfo(id);
        }
        return this.videoCache;
    }

    @Override
    public void downloadVideo(int id) {
        if (needReset) {
            this.service.downloadVideo(id);
        }
    }
}
