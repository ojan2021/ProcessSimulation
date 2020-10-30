import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;


public class ArsThread extends Thread {

    @Override
    public void run() {

        URL url;

        try {
            //Small file for testing
//            url = new URL("http://25.io/toau/audio/sample.txt");
//            File file = new File("1-s2.0-S0140673617321293-mmc1.txt");

            url = new URL("https://ars.els-cdn.com/content/image/1-s2.0-S0140673617321293-mmc1.pdf");
            File file = new File("1-s2.0-S0140673617321293-mmc1.pdf");

            try (BufferedInputStream bis = new BufferedInputStream(url.openStream())) {
                try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))) {
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = bis.read(buffer)) != -1) {
                        bos.write(buffer, 0, bytesRead);
                    }
                    bos.flush();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }

        System.out.print("file3 -> done ");
    }
}
