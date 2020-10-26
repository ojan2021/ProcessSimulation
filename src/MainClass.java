import java.util.concurrent.locks.ReentrantLock;

public class MainClass {
	public static int thread_mode = 0;
	public static int flag = 1;


	public static void main(String[] args) {

		ReentrantLock lock = new ReentrantLock();
		
		UbicompThread ubicompThread = new UbicompThread(lock);
		NasaThread nasaThread = new NasaThread(lock);
		ArsThread arsThread = new ArsThread(lock);
		VisitgreeceThread visitgreeceThread = new VisitgreeceThread(lock);
		SingleThreadDownload sequentialDownload = new SingleThreadDownload();

		if (thread_mode == 1) {
			System.out.println("Mode: Multi-threaded");
			
			ubicompThread.start();
			
			nasaThread.start();
			
			arsThread.start();
			
			visitgreeceThread.start();
		}
		else
			sequentialDownload.start();
			

	}
}
