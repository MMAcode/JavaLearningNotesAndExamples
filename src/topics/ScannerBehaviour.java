package topics;

import java.util.Scanner;


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


////        Scanner s4 = new Scanner("1,2,3,\n1,4,5").useDelimiter(",");
//        Scanner s4 = new Scanner("1,2,3,4,5\n").useDelimiter(",");
//
////        deafult delimiter is empty space



//        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" LIne"+s4.nextLine()+s4.hasNext()+"liNE");else System.out.print(" DONE"+s4.hasNext());
//        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" LIne"+s4.nextLine()+s4.hasNext()+"liNE");else System.out.print(" DONE"+s4.hasNext());
//        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" LIne"+s4.nextLine()+s4.hasNext()+"liNE");else System.out.print(" DONE"+s4.hasNext());
//        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" LIne"+s4.nextLine()+s4.hasNext()+"liNE");else System.out.print(" DONE"+s4.hasNext());
//        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" LIne"+s4.nextLine()+s4.hasNext()+"liNE");else System.out.print(" DONE"+s4.hasNext());
//        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" LIne"+s4.nextLine()+s4.hasNext()+"liNE");else System.out.print(" DONE"+s4.hasNext());
//        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" LIne"+s4.nextLine()+s4.hasNext()+"liNE");else System.out.print(" DONE"+s4.hasNext());
//        if(s4.hasNextInt())System.out.print(" NEXT:"+s4.nextInt());else if (s4.hasNextLine())System.out.print(" LIne"+s4.nextLine()+s4.hasNext()+"liNE");else System.out.print(" DONE"+s4.hasNext());

        /**
         * nextInt() etc works only on current line, 'next line symbol' will be taken as sth else=not matching nextInt, and therefore nextLine() needs to be used.
         * integer on the end of the line -3- (eg 1,2,3\n) is NOT recognised as it is not surrounded by comma delimiter;
         * integer on the end of the line -3- (eg 1,2,3,\n) IS recognised as it is not surrounded by comma delimiter;
         * integer on the end of the line -3- (eg 1,2,3) IS recognised as it is not surrounded by comma delimiter;
         *
         *
         */

//        Scanner s5 = new Scanner("1 2 3\n1 4 5\n");
////        deafult delimiter is empty space
////        System.out.println(s1.nextInt());
//        if(s5.hasNextInt())System.out.print(" NEXT:"+s5.nextInt());else if (s5.hasNextLine())System.out.print(" line"+s5.nextLine());else System.out.print(" DONE");
//        if(s5.hasNextInt())System.out.print(" NEXT:"+s5.nextInt());else if (s5.hasNextLine())System.out.print(" line"+s5.nextLine());else System.out.print(" DONE");
//        if(s5.hasNextInt())System.out.print(" NEXT:"+s5.nextInt());else if (s5.hasNextLine())System.out.print(" line"+s5.nextLine());else System.out.print(" DONE");
//        if(s5.hasNextInt())System.out.print(" NEXT:"+s5.nextInt());else if (s5.hasNextLine())System.out.print(" line"+s5.nextLine());else System.out.print(" DONE");
//        if(s5.hasNextInt())System.out.print(" NEXT:"+s5.nextInt());else if (s5.hasNextLine())System.out.print(" line"+s5.nextLine());else System.out.print(" DONE");
//        if(s5.hasNextInt())System.out.print(" NEXT:"+s5.nextInt());else if (s5.hasNextLine())System.out.print(" line"+s5.nextLine());else System.out.print(" DONE");
//        if(s5.hasNextInt())System.out.print(" NEXT:"+s5.nextInt());else if (s5.hasNextLine())System.out.print(" line"+s5.nextLine());else System.out.print(" DONE");
/**
 *          * integer on the end of the line -3- (eg 1 2 3\n) IS recognised by default space delimiter;
 *          --> in default delimiter, also enter (=new line) is considered as a delimiter
 *          * integer on the end of the line -3- (eg 1,2,3) IS recognised as it is not surrounded by comma delimiter;
 *
 *          reading from the scanner is triggered when enter is hit and at least one delimiter is present, eg 1,2,3\nn->
 *          1 2\n
 *          3\n
 *          4,\n->
 *          ,->
 *
 *
 *
 *          next() will be trigerred (returns a value) only when delimiter is within string submitted by enter.
 *
 *          hasNext() will stop the program only if scanner is empty
 *          hasNext() will be submitted from command line by enter regardess the presence of the delimiter.
 *
 */
int i=(int)(7 + 23.3d);
        System.out.println(i);
////        System.out.println(s1.nextInt());
        Scanner s4 =new Scanner(System.in).useDelimiter(",");
//                Scanner s4 =new Scanner(System.in);
        System.out.println(s4.hasNext());
        System.out.println(s4.hasNext());
        System.out.println(s4.next());//processes input when submited string contains delimiter, else many enters can be pressed
        System.out.println(s4.next());
        System.out.println(s4.nextLine()); //jumps to next lin -> scanner is empty
        System.out.println(s4.hasNext()); //waits for empty scanner to fill
        System.out.println(s4.hasNext());



//        Scanner s5 =new Scanner(System.in).useDelimiter(",");
//        if(s5.hasNextInt())System.out.print(" NEXT:"+s5.nextInt());else if (s5.hasNextLine())System.out.print(" line"+s5.nextLine());else System.out.print(" DONE");
//        System.out.println("the end");
    }
}
