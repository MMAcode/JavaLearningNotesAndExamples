package main;

import java.util.Scanner;

import static helpers.StaticHelpers.p;

public class ScannerTesting {
    public static void main(String[] args) {
        Scanner s1 = new Scanner("String 1 to test.");
        // String line1 = s1.nextLine();
        System.out.println(s1.nextLine());
        // System.out.println(line1);
        // p("\n\n\n");
        Scanner s2 = new Scanner("String 2 to test.\n Some more");
        System.out.println(s2.nextLine());
        String line2 = s2.nextLine();
        System.out.println(line2);
    }
}
