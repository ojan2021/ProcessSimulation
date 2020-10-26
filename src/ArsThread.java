import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class ArsThread extends Thread {


	@Override
	public void run() {

		System.out.println("File3 started");

		long startTime = System.currentTimeMillis();
		long endTime;

		URL url;
		try {
//				url = new URL("https://ars.els-cdn.com/content/image/1-s2.0-S0140673617321293-mmc1.pdf");
//				File file = new File("1-s2.0-S0140673617321293-mmc1.pdf");
			url = new URL("http://25.io/toau/audio/sample.txt");
			File file = new File("1-s2.0-S0140673617321293-mmc1.txt");

			file.createNewFile();
			FileUtils.copyURLToFile(url, new File(file.getPath()));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		endTime = (System.currentTimeMillis() - startTime) / 1000;

		System.out.println("File3 Downloaded in " + endTime + " seconds");
		System.out.println("------------------------------");

	}
}
