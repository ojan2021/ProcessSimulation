import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;


public class VisitgreeceThread extends Thread {



	@Override
	public void run() {

		

			System.out.println("File4 started");

			long startTime = System.currentTimeMillis();
			long endTime;

			URL url;
			try {
//				url = new URL("http://www.visitgreece.gr/deployedFiles/StaticFiles/maps/Peloponnese_map.pdf");
//				File file = new File("Peloponnese_map.pdf");
				url = new URL("http://25.io/toau/audio/sample.txt");
				File file = new File("Peloponnese_map.txt");

				file.createNewFile();
				FileUtils.copyURLToFile(url, new File(file.getPath()));
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			endTime = (System.currentTimeMillis() - startTime) / 1000;

			

			System.out.println("File4 Downloaded in " + endTime + " seconds");
			System.out.println("------------------------------");

		

	}

}
