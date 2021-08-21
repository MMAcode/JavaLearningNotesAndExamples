package fromOtherProject.miroTools;

public class Timer {
    private static long start;
    private static double duration;

    public static void  start(){
        start = System.nanoTime();
    }

    public static void stopAndShow(){
        duration = (double) (System.nanoTime() - start)/1_000_000;
        System.out.println("Duration: " + duration + "ms");
    }

    public static void stopAndShow(String label){
        duration = (double) (System.nanoTime() - start)/1_000_000;
        System.out.println("Duration of '"+label+"': " + duration + "ms");
    }
}
