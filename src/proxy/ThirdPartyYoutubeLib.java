package proxy;

import java.util.List;

interface ThirdPartyYoutubeLib {

    public List<Video> listVideos();

    public VideoInfo getVideoInfo(int id);

    public void downloadVideo(int id);

}
