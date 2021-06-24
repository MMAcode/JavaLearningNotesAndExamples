package topics;

import java.util.Scanner;

import static helpers.StaticHelpers.p;

public class ScannerBehaviour {
    public static void main(String[] args) {
        Scanner s1 = new Scanner("String 1 to test.");
        // String line1 = s1.nextLine();
//        System.out.println(s1.nextLine());
        // System.out.println(line1);
        // p("\n\n\n");

//        Scanner s2 = new Scanner("String 2 to test.\n Some more");
//        System.out.println(s2.nextLine());
//        System.out.println(s2.hasNextLine());
//        String line2 = s2.nextLine();
//        System.out.println(line2);
//        System.out.println(s2.hasNextLine());

//        Scanner s3 = new Scanner("Strin,g two.\nSo,me more\n").useDelimiter(",");
//        System.out.print(s3.next());
//        System.out.print(s3.next());
//        System.out.print("TEST");
////        System.out.print(s3.next());
//        System.out.print(s3.nextLine());
//        if(s3.hasNext())System.out.println("NEXT:"+s3.next());else System.out.println("DONE");

/**
        notes:
        next()
        new line is part of next() and works as a delimiter in the same time also.
        so last 'next' of the first line will be printed, new line will be printed, and there it waits

        nextln()
        reads the rest of the string including the 'next line symbol',
        but that 'next line symbol' is ommited from the returned string. On the end, if there as another line, position is on the beginning of that line.
        (delimiter is still part of a string an as such will be returned too
 */


        Scanner s4 = new Scanner("1,2,3,\n1,4,5\n").useDelimiter(",");
//        deafult delimiter is empty space
//        System.out.println(s1.nextInt());
        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" line"+s4.nextLine());else System.out.print(" DONE");
        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" line"+s4.nextLine());else System.out.print(" DONE");
        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" line"+s4.nextLine());else System.out.print(" DONE");
        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" line"+s4.nextLine());else System.out.print(" DONE");
        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" line"+s4.nextLine());else System.out.print(" DONE");
        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" line"+s4.nextLine());else System.out.print(" DONE");
        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" line"+s4.nextLine());else System.out.print(" DONE");
        /**
         * nextInt() etc works only on current line, 'next line symbol' will be taken as sth else=not matching nextInt, and therefore nextLine() needs to be used.
         */
    }
}
