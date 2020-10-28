
public class MainClass {
    public static int thread_mode = 1;
    public static int flag = 0;

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        UbicompThread ubicompThread = new UbicompThread();
        NasaThread nasaThread = new NasaThread();
        ArsThread arsThread = new ArsThread();
        VisitgreeceThread visitgreeceThread = new VisitgreeceThread();
        SingleThreadDownload sequentialDownload = new SingleThreadDownload();

//		thread_mode = Integer.parseInt(args[0]);
        // get the runtime object associated with the current Java application

        // get the number of processors available to the Java virtual machine
        int numberOfProcessors = runtime.availableProcessors();

        System.out.println("Number of the cores: " + numberOfProcessors);

        if (thread_mode == 1) {
            if (numberOfProcessors == 1) {
                sequentialDownload.start();
            } else if (numberOfProcessors == 2) {

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
