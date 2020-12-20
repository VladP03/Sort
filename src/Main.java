import SortAlgorithms.BubbleSort.BubbleSortAsc;
import SortAlgorithms.BubbleSort.BubbleSortDesc;
import SortAlgorithms.NaivSort.NaivSortAsc;
import SortAlgorithms.NaivSort.NaivSortDesc;
import SortAlgorithms.SelectionSort.SelectionSortAsc;
import SortAlgorithms.SelectionSort.SelectionSortDesc;
import SortAlgorithms.ShellSort.ShellSortAsc;
import SortAlgorithms.ShellSort.ShellSortDesc;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Display display = new Display();

        int sizeOfArray;            // size of the array
        int numbersOfDigits;        // in which interval are the numbers generated

        Random random = new Random();       // generate the numbers;

        sizeOfArray = 5_000_0;
        numbersOfDigits = 4;

        Integer[] array = new Integer[sizeOfArray];
        for (int i=0;i<array.length;i++) {
            array[i] = random.nextInt((int) Math.pow(10,numbersOfDigits));
        }

        display.sort(new BubbleSortAsc(), array.clone());
        display.sort(new BubbleSortDesc(), array.clone());
        display.sort(new NaivSortAsc(), array.clone());
        display.sort(new NaivSortDesc(), array.clone());
        display.sort(new ShellSortAsc(), array.clone());
        display.sort(new ShellSortDesc(), array.clone());
        display.sort(new SelectionSortAsc(), array.clone());
        display.sort(new SelectionSortDesc(), array.clone());
    }
}
