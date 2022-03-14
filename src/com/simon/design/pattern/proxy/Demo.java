package com.simon.design.pattern.proxy;

/**
 * https://refactoringguru.cn/design-patterns/proxy/java/example
 */
public class Demo {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved by caching proxy: " + (naive - smart) +"ms");
    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("caatzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("148905702189xcj");
        // User might visit the same page quite often.
        downloader.renderVideoPage("caatzzzzzz");
        downloader.renderVideoPage("adfafafdafa");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
