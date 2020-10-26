import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class NasaThread extends Thread {


	@Override
	public void run() {

		System.out.println("File2 started");

		long startTime = System.currentTimeMillis();
		long endTime;

		URL url;
		try {
//				url = new URL("https://www.hq.nasa.gov/alsj/a17/A17_FlightPlan.pdf");
//				File file = new File("A17_FlightPlan.pdf");
			url = new URL("http://25.io/toau/audio/sample.txt");
			File file = new File("A17_FlightPlan.txt");

			file.createNewFile();
			FileUtils.copyURLToFile(url, new File(file.getPath()));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		endTime = (System.currentTimeMillis() - startTime) / 1000;

		System.out.println("File2 Downloaded in " + endTime + " seconds");
		System.out.println("------------------------------");

	}
}
