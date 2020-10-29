import java.util.Scanner;

public class MainClass {
    public static int thread_mode;

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
        } catch (ArrayIndexOutOfBoundsException e) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please choose a thread mode (0 for single-threaded, 1 for multi-threaded: ");
            thread_mode = sc.nextInt();
        }
        // get the number of processors available to the Java virtual machine
        int numberOfProcessors = runtime.availableProcessors();
//        numberOfProcessors = 2;   //Test case for checking 2 cores

        System.out.println("Number of the cores: " + numberOfProcessors);

        if (thread_mode == 1) {
            System.out.println("Mode: Multi-threaded");
            System.out.println("Files: ");

            if (numberOfProcessors == 1) {
                sequentialDownload.start();

            } else if (numberOfProcessors == 2) {
                twoCoreDownload_1.start();
                twoCoreDownload_2.start();
                totalTimeFor2Cores(twoCoreDownload_1,twoCoreDownload_2);



            } else if (numberOfProcessors > 2) {

                ubicompThread.start();

                nasaThread.start();

                arsThread.start();

                visitgreeceThread.start();

                totalTimeForMoreCores(ubicompThread,nasaThread,arsThread,visitgreeceThread);

            }

        } else if (thread_mode == 0) {
            System.out.println("Mode: Single threaded");
            System.out.println("Files: ");

            sequentialDownload.start();
        }
    }

    public static void totalTimeFor2Cores(TwoCoreDownload_1 t1, TwoCoreDownload_2 t2)
    {
        while (true)
            if(!t1.isAlive() && !t2.isAlive()) {
                long res = TwoCoreDownload_1.totalTime + TwoCoreDownload_2.totalTime;
                System.out.println("Total time: " + res + " seconds");
                break;
            }
    }

    public static void totalTimeForMoreCores(UbicompThread t1, NasaThread t2, ArsThread t3, VisitgreeceThread t4)
    {
        while (true)
            if(!t1.isAlive() && !t2.isAlive() && !t3.isAlive() && !t4.isAlive()) {
                long res = UbicompThread.endTime + NasaThread.endTime + ArsThread.endTime + VisitgreeceThread.endTime;
                System.out.println("Total time: " + res + " seconds");
                break;
            }
    }
}
