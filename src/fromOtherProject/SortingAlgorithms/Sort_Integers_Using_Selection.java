package fromOtherProject.SortingAlgorithms;

import java.util.Arrays;

public class Sort_Integers_Using_Selection {
    int[] numbers;

    public Sort_Integers_Using_Selection(int... numbers) {
        this.numbers = sort(numbers);
    }

    private int[] sort (int[] numbers){
        //System.out.println("original list: "+ Arrays.toString(numbers));

        //find smallest number many times...
        for (int lastSortedNrIndex = -1; lastSortedNrIndex<numbers.length-2; lastSortedNrIndex++){
            int numberToReplace = numbers[lastSortedNrIndex+1];
            int newSmallestNrIndex = lastSortedNrIndex+1;
            //System.out.println("search nr " + (lastSortedNrIndex+2) +": numberToReplace="+numberToReplace +"; smallest now: "+numbers[newSmallestNrIndex] );
            //System.out.println(" - starting search for smallest... (currently "+numbers[newSmallestNrIndex]+" )");
            for (int i = lastSortedNrIndex+2; i<numbers.length; i++) {  //at least 2 values has to be passed for function not to error out
                if (numbers[i]< numbers[newSmallestNrIndex]) { //array length max of int size
                    newSmallestNrIndex = i;
                    //System.out.println(numbers[newSmallestNrIndex]);
                }
            }

            //swap values
            //System.out.println(" - smallest nr found: "+ numbers[newSmallestNrIndex]);
            //System.out.println(" - numberToReplace "+ numbers[lastSortedNrIndex+1]);
            //System.out.println("new array " + Arrays.toString(numbers) );
            numbers[lastSortedNrIndex+1]=numbers[newSmallestNrIndex];
            numbers[newSmallestNrIndex] = numberToReplace;

        }
        //System.out.println(Arrays.toString(numbers));


        return numbers;
    }

    public void print (){
        System.out.println("Sort_Selection result:   " + Arrays.toString(numbers));
    }

}
