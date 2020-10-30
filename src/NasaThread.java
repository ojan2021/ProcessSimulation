import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;


public class NasaThread extends Thread {
    
    @Override
    public void run() {

        URL url;

        try {
            //Small file for testing
//            url = new URL("http://25.io/toau/audio/sample.txt");
//            File file = new File("A17_FlightPlan.txt");

            url = new URL("https://www.hq.nasa.gov/alsj/a17/A17_FlightPlan.pdf");
            File file = new File("A17_FlightPlan.pdf");

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

        System.out.print("file2 -> done ");
    }
}
