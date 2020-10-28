import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;


public class TwoCoreDownload_1 extends Thread {
    @Override
    public void run() {
        long endTime = 0;
        long startTime = System.currentTimeMillis();
        URL url;
//------------------------------------------------------------------------------------------------------------


        try {
//			url = new URL("http://www.ubicomp.org/ubicomp2003/adjunct_proceedings/proceedings.pdf");
//			File target = new File("proceedings.pdf");
            url = new URL("http://25.io/toau/audio/sample.txt");
            File file = new File("proceedings.txt");

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

        endTime = (System.currentTimeMillis() - startTime) / 1000;

        System.out.println("File1 downloaded in " + endTime + " seconds");
        endTime = 0;
        startTime = 0;
//------------------------------------------------------------------------------------------------------------

        startTime = System.currentTimeMillis();

        try {
//			url = new URL("https://www.hq.nasa.gov/alsj/a17/A17_FlightPlan.pdf");
//			File file = new File("A17_FlightPlan.pdf");
            url = new URL("http://25.io/toau/audio/sample.txt");
            File file = new File("A17_FlightPlan.txt");

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

        endTime = (System.currentTimeMillis() - startTime) / 1000;

        System.out.println("File2 Downloaded in " + endTime + " seconds");
        endTime = 0;


    }
}