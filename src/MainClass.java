import java.util.Scanner;

public class MainClass {
    public static int thread_mode;
    public static int flag = 0;

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        UbicompThread ubicompThread = new UbicompThread();
        NasaThread nasaThread = new NasaThread();
        ArsThread arsThread = new ArsThread();
        VisitgreeceThread visitgreeceThread = new VisitgreeceThread();
        SingleThreadDownload sequentialDownload = new SingleThreadDownload();
        TwoCoreDownload_1 twoCoreDownload_1 = new TwoCoreDownload_1();
        TwoCoreDownload_2 twoCoreDownload_2 = new TwoCoreDownload_2();

        try {
            thread_mode = Integer.parseInt(args[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            Scanner sc = new Scanner(System.in);
            System.out.print("Please choose a thread mode (0 for single-threaded, 1 for multi-threaded: ");
            thread_mode = sc.nextInt();
        }
        // get the number of processors available to the Java virtual machine
        int numberOfProcessors = runtime.availableProcessors();
//        numberOfProcessors = 2;   //Test case for checking 2 cores

        System.out.println("Number of the cores: " + numberOfProcessors);

        if (thread_mode == 1) {
            if (numberOfProcessors == 1) {
                sequentialDownload.start();
            } else if (numberOfProcessors == 2) {
                twoCoreDownload_1.start();
                twoCoreDownload_2.start();

            } else if (numberOfProcessors > 2) {
                System.out.println("Mode: Multi-threaded");

                ubicompThread.start();

                nasaThread.start();

                arsThread.start();

                visitgreeceThread.start();
            }

        } else if (thread_mode == 0) {
            System.out.println("Mode: Single threaded");

            sequentialDownload.start();
        }
    }
}
