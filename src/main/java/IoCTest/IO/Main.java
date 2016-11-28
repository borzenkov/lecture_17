package IoCTest.IO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vic on 24.11.16.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"appContext.xml"});

        DataHandler dataHandler = (DataHandler) applicationContext.getBean("dataHandler");
        DataHandler dataHandler2 = (DataHandler) applicationContext.getBean("dataHandler");
        DataHandler dataHandler3 = new DataHandler();
        DataHandler dataHandler4 = (DataHandler) new ClassPathXmlApplicationContext(new String[]{"appContext.xml"}).getBean("dataHandler");
        System.out.println(dataHandler == dataHandler2);
        System.out.println(dataHandler == dataHandler3);
        System.out.println(dataHandler == dataHandler4);

        /*DataHandler dataHandler = new DataHandler();
        dataHandler.setDownloader(new FileDownloader());
        dataHandler.setUploader(new FileUploader());*/
        dataHandler.handleData("someSrcPath", "someDestPath");
    }
}
