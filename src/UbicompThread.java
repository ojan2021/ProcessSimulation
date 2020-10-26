import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class UbicompThread extends Thread {

	@Override
	public void run() {

		System.out.println("File1 started");

		long startTime = System.currentTimeMillis();
		long endTime;

		URL url;
		try {
//				url = new URL("http://www.ubicomp.org/ubicomp2003/adjunct_proceedings/proceedings.pdf");
//				File file = new File("proceedings.pdf");
			url = new URL("http://25.io/toau/audio/sample.txt");
			File file = new File("proceedings.txt");

			file.createNewFile();
			FileUtils.copyURLToFile(url, new File(file.getPath()));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		endTime = (System.currentTimeMillis() - startTime) / 1000;

		System.out.println("File1 Downloaded in " + endTime + " seconds");
		System.out.println("------------------------------");

	}
}
