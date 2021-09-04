package fromOtherProject.SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_Integers_Using_Merge {
    List<Integer> unSortedList;
    List<Integer> sortedList;

    public Sort_Integers_Using_Merge(int... numbers) {
        unSortedList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        sortedList = mergeSortUsingRecursion(unSortedList);
        // sortedList = mergeSortUsingLoops(unSortedList);
    }

    private List<Integer> mergeSortUsingLoops(List<Integer> numbers) {
        //populate lists
        List<List<Integer>> lists = new ArrayList<>();
        List<List<Integer>> finalLists = lists;
        numbers.forEach(n-> {
            List<Integer> l =new ArrayList<>();
            l.add(n);
            finalLists.add(l);
        });

        //keep merging and sorting lists
        while (lists.size()>1){
            //merge lists of current levels one up
            List<List<Integer>> lists2 = new ArrayList<>();
            int index = 0;
            //merge pairs of lists
            while (index+1< lists.size()){
                List<Integer> lA = lists.get(index);
                List<Integer> lB = lists.get(index+1);
                lists2.add(mergeSortedLists(lA,lB));
                index+=2;
            }
            //add in leftover list if there was one list left over
            if (index+1==lists.size()){lists2.add(lists.get(index));}
            lists = lists2;
        }

        return lists.get(0);
    }

    private List<Integer> mergeSortUsingRecursion(List<Integer> numbers) {
        if (numbers.size() <= 1) return numbers;

        int indexOfFirstElementOfSecondList = (int) (numbers.size() / 2);   //eg if 4 elements ->index=2; if 3 elements ->index=1
        List<Integer> sortedSublistA = mergeSortUsingRecursion(new ArrayList<>(numbers.subList(0, indexOfFirstElementOfSecondList)));
        List<Integer> sortedSublistB = mergeSortUsingRecursion(new ArrayList<>(numbers.subList(indexOfFirstElementOfSecondList, numbers.size())));
        //...goes into the rabbit hole... returns sorted lists

        return mergeSortedLists(sortedSublistA, sortedSublistB);
    }


    private List<Integer> mergeSortedLists(List<Integer> numbersASorted, List<Integer> numbersBSorted) {
        List<Integer> finalSortedList = new ArrayList<>();
        while (numbersASorted.size() > 0 && numbersBSorted.size() > 0) {
            moveNumberFromTo(numbersASorted.get(0) < numbersBSorted.get(0) ? numbersASorted : numbersBSorted, finalSortedList);
        }
        finalSortedList.addAll(numbersASorted.size() > 0 ? numbersASorted :
                numbersBSorted.size() > 0 ? numbersBSorted : null);
        return finalSortedList;
    }

    private void moveNumberFromTo(List<Integer> from, List<Integer> to) {
        to.add(from.get(0));
        from.remove(0);
    }

    public void print() {
        System.out.println("Sort_Merge unsorted:   " + unSortedList);
        System.out.println("Sort_Merge   sorted:   " + sortedList);
    }

}
