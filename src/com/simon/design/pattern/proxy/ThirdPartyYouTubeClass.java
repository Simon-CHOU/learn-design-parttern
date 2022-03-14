package com.simon.design.pattern.proxy;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youbute.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youbute.com/" + videoId);
        return getSomeVideo(videoId);
    }

    private int random(int min, int max){
        return min + (int) (Math.random() * ((max - min) + 1));
    }
    private Video getSomeVideo(String videoId) {


    }

    private void connectToServer(String s) {

    }

    private HashMap<String, Video> getRandomVideos() {
        return null;
    }
}
