package main;

import java.io.IOException;
import java.util.Date;

import static helpers.StaticHelpers.p;
import static helpers.StaticHelpers.pf;


public class Main {

    public static void main(String[] args) {
//        gco="!Invoke_Item 'C:\ProgramData/Git/config'"
        System.out.printf("%s\n","12345678"); // %s  string
        System.out.printf("%5s\n","hi"); // %s  string    %5s of min length 3 - fills gaps with spaces
        System.out.printf("%5s\n","hi"); // %s  string    %5s of min length 3 - fills gaps with spaces
        System.out.printf("ahoj %s %s\n","1",22,33); // %s %s pass multiple values
        System.out.printf("ahoj %s%s\n","1",22,33); // %s %s pass multiple values
        System.out.printf("ahoj %3$s %2$s\n","1",22,33); //2$ with specific position
        System.out.printf("ahoj %1$s %1$S %1$10s\n","bye"); //use 1 value multiple times

        String str = String.format("ahoj %1$s %1$S %1$10s\n","bye"); //use 1 value multiple times
        p("Formated string: "+str);

        System.out.printf("%10d\n",732832); // d whole digits (numbers)
        System.out.printf("%3d\n",732832);

        System.out.printf("%13.2f\n",732.832d); //f decimals .3 decimal precision
        System.out.printf("%10.2f\n",7328320f);
//        System.out.printf("%10.2f\n",7328320); // this doesn't compile as java is expecting decimal number
        System.out.printf("%10.2f\n",7328320/3); // this doesn't compile as java is expecting decimal number, but this devision results in int value without reminder
        System.out.printf("%013.2f\n",732.832d); //fill with zeroes before

        pf("|%10d|", 101);  // Specifying length of integer
        pf("|%-10d|", 101); // Left-justifying within the specified width

//        System.out.printf("%13s\n",732.832d);
        System.out.printf("%10s\n","12345678");
        System.out.printf("%3s\n","12345678");

        System.out.printf("ahoj      %s %s %s \n","1",522,533);
        System.out.printf("I say: %S\n","ahoj!"); //upper case

        Date date = new Date();
        System.out.println(date);
        System.out.printf("%tT \n", date);
        System.out.printf("%tD \n", date);
        System.out.printf("%tD %tT \n", date,date);
        System.out.printf("%1$tD %1$tT \n", date);


        try{throw new IOException();
        }
        catch(Exception e){
            System.out.printf("MIRO error: %s",e);
        }

    }
}
