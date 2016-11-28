package IoCTest.IO;

/**
 * Created by vic on 24.11.16.
 */
public class DBDownloader implements Downloader {
    public String download(String path) {
        System.out.println(new StringBuilder("Resource from DB path ")
                .append(path)
                .append(" was downloaded!")
                .toString());

        return "I am DB Content!!!";
    }
}