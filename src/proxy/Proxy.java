package proxy;

public class Proxy {

    public static void main(String[] args) {
        ThirdPartyYoutube service = new ThirdPartyYoutube();
        CachedYoutube youtubeProxy = new CachedYoutube(service);
        YoutubeManager manager = new YoutubeManager(youtubeProxy);
        manager.reactOnUserInput();
    }
}
