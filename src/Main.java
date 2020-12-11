import SortAlgorithms.BubbleSort.BubbleSortAsc;
import SortAlgorithms.BubbleSort.BubbleSortDesc;
import SortAlgorithms.Sort;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int sizeOfArray;            // size of the array
        int numbersOfDigits;        // in which interval are the numbers generated

        Random random = new Random();       // generate the numbers;

        sizeOfArray = 1_000;
        numbersOfDigits = 4;

        int[] array = new int[sizeOfArray];
        for (int i=0;i<array.length;i++) {
            array[i] = random.nextInt((int) Math.pow(10,numbersOfDigits));
        }

        //displaySorted(new BubbleSortAsc(), array);
        displaySorted(new BubbleSortDesc(), array);
    }

    private static void displaySorted(Sort strategy, int[] arr) {
        strategy.doSort(arr);
        displayArray(arr);
        System.out.println("\n" + strategy.getTime());
    }

    private static void displayArray (int[] array) {

        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
