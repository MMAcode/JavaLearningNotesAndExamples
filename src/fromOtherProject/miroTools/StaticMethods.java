package fromOtherProject.miroTools;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StaticMethods {

    public static int[] arrayOfRandomIntegers(int numberOfElements, int min, int max) {
        return ThreadLocalRandom.current().ints(numberOfElements,min,max+1).toArray();

        //return new Random().ints(100,-1000,1001).toArray();

    }

    public static int randomInteger(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max+1);
        //(int) Math.random()*9; //0 to 9
        //new Random().nextInt(100); // 0 to 99
    }
}
