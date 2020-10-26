import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class SingleThreadDownload extends Thread {
	@Override
	public void run() {
		long endTime = 0;
		URL url;
//------------------------------------------------------------------------------------------------------------

		System.out.println("File1 started");

		long startTime = System.currentTimeMillis();

		try {
//			url = new URL("http://www.ubicomp.org/ubicomp2003/adjunct_proceedings/proceedings.pdf");
//			File file = new File("proceedings.pdf");
			url = new URL("http://25.io/toau/audio/sample.txt");
			File file = new File("proceedings.txt");

			file.createNewFile();
			FileUtils.copyURLToFile(url, new File(file.getPath()));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		endTime = (System.currentTimeMillis() - startTime) / 1000;

		System.out.println("Downloaded in " + endTime + " seconds");
		System.out.println("------------------------------");
		endTime = 0;
		startTime = 0;
//------------------------------------------------------------------------------------------------------------
		System.out.println("File2 started");

		startTime = System.currentTimeMillis();

		try {
//			url = new URL("https://www.hq.nasa.gov/alsj/a17/A17_FlightPlan.pdf");
//			File file = new File("A17_FlightPlan.pdf");
			url = new URL("http://25.io/toau/audio/sample.txt");
			File file = new File("A17_FlightPlan.txt");

			file.createNewFile();
			FileUtils.copyURLToFile(url, new File(file.getPath()));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		endTime = (System.currentTimeMillis() - startTime) / 1000;

		System.out.println("Downloaded in " + endTime + " seconds");
		System.out.println("------------------------------");
		endTime = 0;
//------------------------------------------------------------------------------------------------------------
		System.out.println("File3 started");

		startTime = System.currentTimeMillis();

		try {
//			url = new URL("https://ars.els-cdn.com/content/image/1-s2.0-S0140673617321293-mmc1.pdf");
//			File file = new File("1-s2.0-S0140673617321293-mmc1.pdf");
			url = new URL("http://25.io/toau/audio/sample.txt");
			File file = new File("1-s2.0-S0140673617321293-mmc1.txt");

			file.createNewFile();
			FileUtils.copyURLToFile(url, new File(file.getPath()));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		endTime = (System.currentTimeMillis() - startTime) / 1000;

		System.out.println("Downloaded in " + endTime + " seconds");
		System.out.println("------------------------------");
		endTime = 0;
//------------------------------------------------------------------------------------------------------------
		System.out.println("File4 started");

		startTime = System.currentTimeMillis();

		try {
//			url = new URL("http://www.visitgreece.gr/deployedFiles/StaticFiles/maps/Peloponnese_map.pdf");
//			File file = new File("Peloponnese_map.pdf");
			url = new URL("http://25.io/toau/audio/sample.txt");
			File file = new File("Peloponnese_map.txt");

			file.createNewFile();
			FileUtils.copyURLToFile(url, new File(file.getPath()));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		endTime = (System.currentTimeMillis() - startTime) / 1000;

		System.out.println("Downloaded in " + endTime + " seconds");
		System.out.println("------------------------------");
		endTime = 0;
//------------------------------------------------------------------------------------------------------------

	}
}
