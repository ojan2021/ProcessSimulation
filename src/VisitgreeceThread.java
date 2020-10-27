import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;



public class VisitgreeceThread extends Thread {



	@Override
	public void run() {

		

			System.out.println("File4 started");

			long startTime = System.currentTimeMillis();
			long endTime;

			URL url;


		try {

//			url = new URL("http://www.visitgreece.gr/deployedFiles/StaticFiles/maps/Peloponnese_map.pdf");
//			File file = new File("Peloponnese_map.pdf");
			url = new URL("http://25.io/toau/audio/sample.txt");
			File file = new File("Peloponnese_map.txt");

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

			

			System.out.println("File4 Downloaded in " + endTime + " seconds");
			System.out.println("------------------------------");

		

	}

}
