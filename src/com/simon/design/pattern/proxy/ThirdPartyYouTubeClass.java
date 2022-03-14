package com.simon.design.pattern.proxy;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {
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

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private void connectToServer(String server) {
        System.out.println("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.println("Connected!\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading populars...");
        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<>();
        hmap.put("caatzzzzzz", new Video("aj;dfa9", "Catzzzz.avi"));
        hmap.put("adfafafdafa", new Video("2rk24l9", "Dog play with ball.mp4"));
        hmap.put("bbbbbbbadfa", new Video("czvzcv", "Dance.avi"));
        hmap.put("148905702189xcj", new Video("adfdf", "Programming.avi"));
        hmap.put("adfdhla2379", new Video("k548675", "Barcelona.mov"));

        System.out.println("Done!\n");
        return hmap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Downloading video...");
        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");
        System.out.println("Done!\n");
        return video;
    }
}
