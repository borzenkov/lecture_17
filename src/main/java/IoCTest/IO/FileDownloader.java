package IoCTest.IO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by vic on 24.11.16.
 */
@Component
public class FileDownloader implements Downloader {
    @Autowired
    public String download(String path) {
        System.out.println(new StringBuilder("Resource from path ")
                .append(path)
                .append(" was downloaded!")
                .toString());

        return "CoNtEnT";
    }
}