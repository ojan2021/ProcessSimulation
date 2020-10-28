import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;


public class UbicompThread extends Thread {

    @Override
    public void run() {

        long startTime = System.currentTimeMillis();
        long endTime;

        URL url;
        try {
//				url = new URL("http://www.ubicomp.org/ubicomp2003/adjunct_proceedings/proceedings.pdf");
//				File target = new File("proceedings.pdf");
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

        System.out.println("File1 Downloaded in " + endTime + " seconds");

    }
}
