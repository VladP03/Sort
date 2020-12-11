import SortAlgorithms.BubbleSort.BubbleSortAsc;
import SortAlgorithms.BubbleSort.BubbleSortDesc;
import SortAlgorithms.NaivSort.NaivSortAsc;
import SortAlgorithms.NaivSort.NaivSortDesc;
import SortAlgorithms.Sort;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int sizeOfArray;            // size of the array
        int numbersOfDigits;        // in which interval are the numbers generated

        Random random = new Random();       // generate the numbers;

        sizeOfArray = 5_000_0;
        numbersOfDigits = 4;

        int[] array = new int[sizeOfArray];
        for (int i=0;i<array.length;i++) {
            array[i] = random.nextInt((int) Math.pow(10,numbersOfDigits));
        }

        int[] copy01OfArray = array.clone();
        int[] copy02OfArray = array.clone();
        int[] copy03OfArray = array.clone();
        int[] copy04OfArray = array.clone();

        //displaySorted(new BubbleSortAsc(), copy01OfArray);
        //displaySorted(new BubbleSortDesc(), copy02OfArray);
        displaySorted(new NaivSortAsc(), copy03OfArray);
        displaySorted(new NaivSortDesc(), copy04OfArray);


    }

    private static void displaySorted(Sort strategy, int[] arr) {
        strategy.doSort(arr);
        displayArray(arr);
        System.out.println("\n" + strategy.getClass().getSimpleName() + " -> Time spent to sort: " + strategy.getTime() + " seconds\n");
    }

    private static void displayArray (int[] array) {

        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
