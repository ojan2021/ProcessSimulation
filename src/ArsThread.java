import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.locks.ReentrantLock;

//import org.apache.commons.io.FileUtils;

public class ArsThread extends Thread {

	ReentrantLock lock = new ReentrantLock();
	public static long endTime;


	public ArsThread(ReentrantLock lock) {
		this.lock = lock;

	}

	@Override
	public void run() {

		synchronized (lock) {

			while (MainClass.flag != 3) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println("File3 started");

			long startTime = System.currentTimeMillis();

			URL url;
			try {
				url = new URL("https://ars.els-cdn.com/content/image/1-s2.0-S0140673617321293-mmc1.pdf");
				File target = new File("1-s2.0-S0140673617321293-mmc1.pdf");
//				url = new URL("http://25.io/toau/audio/sample.txt");
//				File target = new File("proceedings.txt");

				try (BufferedInputStream bis = new BufferedInputStream(url.openStream())) {
					try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target))) {
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

			MainClass.flag = 4;
			System.out.println("Flag became: " + MainClass.flag);
			System.out.println("Downloaded in " + endTime + " seconds");
			System.out.println("------------------------------");
			lock.notifyAll();

		}

	}
}