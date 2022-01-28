package topics.streams;

import fromOtherProject.miroTools.Timer;

import java.util.ArrayList;
import java.util.List;

public class speedOfFilters {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            allIn();
        }

    }

    //conclusion: speed is the same
    private static void allIn() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }


        Timer.start();
        Long c2 = list.stream()
            .filter(number -> number % 7 == 0
                && number % 5 == 0
                && number % 3 == 0
                && number % 2 == 0)
            .count();

        Timer.stopAndShow(c2 + "all in one: ");

        Timer.start();
        Long c1 = list.stream()
            .filter(number -> number % 7 == 0)
            .filter(number -> number % 5 == 0)
            .filter(number -> number % 3 == 0)
            .filter(number -> number % 2 == 0)
            .count();
        Timer.stopAndShow(c1 + " multiple streams: ");

    }
}
