import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class SingleThreadDownload extends Thread {
	@Override
	public void run() {
		long endTime = 0;
		URL url;
//------------------------------------------------------------------------------------------------------------

		System.out.println("File1 started");

		long startTime = System.currentTimeMillis();

		try {
			url = new URL("http://www.ubicomp.org/ubicomp2003/adjunct_proceedings/proceedings.pdf");
			File target = new File("proceedings.pdf");
//			url = new URL("http://25.io/toau/audio/sample.txt");
//			File target = new File("proceedings.txt");

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

		System.out.println("Flag became: " + MainClass.flag);
		System.out.println("Downloaded in " + endTime + " seconds");
		System.out.println("------------------------------");
		endTime = 0;
		startTime = 0;
//------------------------------------------------------------------------------------------------------------
		System.out.println("File2 started");

		startTime = System.currentTimeMillis();

		try {
			url = new URL("http://www.ubicomp.org/ubicomp2003/adjunct_proceedings/proceedings.pdf");
			File target = new File("proceedings.pdf");
//			url = new URL("http://25.io/toau/audio/sample.txt");
//			File target = new File("proceedings.txt");

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

		System.out.println("Flag became: " + MainClass.flag);
		System.out.println("Downloaded in " + endTime + " seconds");
		System.out.println("------------------------------");
		endTime = 0;
//------------------------------------------------------------------------------------------------------------
				System.out.println("File3 started");

				startTime = System.currentTimeMillis();

				try {
					url = new URL("http://www.ubicomp.org/ubicomp2003/adjunct_proceedings/proceedings.pdf");
					File target = new File("proceedings.pdf");
//					url = new URL("http://25.io/toau/audio/sample.txt");
//					File target = new File("proceedings.txt");

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

				System.out.println("Downloaded in " + endTime + " seconds");
				System.out.println("------------------------------");
				endTime = 0;
//------------------------------------------------------------------------------------------------------------
				System.out.println("File1 started");

				startTime = System.currentTimeMillis();

				try {
					url = new URL("http://www.ubicomp.org/ubicomp2003/adjunct_proceedings/proceedings.pdf");
					File target = new File("proceedings.pdf");
//					url = new URL("http://25.io/toau/audio/sample.txt");
//					File target = new File("proceedings.txt");

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

				System.out.println("Downloaded in " + endTime + " seconds");
				System.out.println("------------------------------");
				endTime = 0;
		//------------------------------------------------------------------------------------------------------------
				
		
	}
}
