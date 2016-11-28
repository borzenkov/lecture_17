package IoCTest.IO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by vic on 24.11.16.
 */
@Component
public class FileUploader implements Uploader {
    @Autowired

    public boolean upload(String path, Object content) {
        System.out.println(new StringBuilder("Content")
        .append(content.toString())
        .append(" was uploaded to path ")
        .append(path));
        return true;
    }
}
