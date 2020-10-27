
public class MainClass {
	public static int thread_mode = 1;
	public static int flag = 0;

	public static void main(String[] args) {


		
		UbicompThread ubicompThread = new UbicompThread();
		NasaThread nasaThread = new NasaThread();
		ArsThread arsThread = new ArsThread();
		VisitgreeceThread visitgreeceThread = new VisitgreeceThread();
		SingleThreadDownload sequentialDownload = new SingleThreadDownload();

		if (thread_mode == 1) {
			System.out.println("Mode: Multi-threaded");

			ubicompThread.start();

			nasaThread.start();

			arsThread.start();

			visitgreeceThread.start();

		} 	else if (thread_mode == 0) {
			System.out.println("Mode: Single threaded");

			sequentialDownload.start();
		}
	}
}
