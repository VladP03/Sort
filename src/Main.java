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

        int[] array = new int[sizeOfArray];
        for (int i=0;i<array.length;i++) {
            array[i] = random.nextInt((int) Math.pow(10,numbersOfDigits));
        }

        int[] copy01OfArray = array.clone();
        int[] copy02OfArray = array.clone();
        int[] copy03OfArray = array.clone();
        int[] copy04OfArray = array.clone();
        int[] copy05OfArray = array.clone();
        int[] copy06OfArray = array.clone();
        int[] copy07OfArray = array.clone();
        int[] copy08OfArray = array.clone();

        display.sort(new BubbleSortAsc(), copy01OfArray);
        display.sort(new BubbleSortDesc(), copy02OfArray);
        display.sort(new NaivSortAsc(), copy03OfArray);
        display.sort(new NaivSortDesc(), copy04OfArray);
        display.sort(new ShellSortAsc(), copy05OfArray);
        display.sort(new ShellSortDesc(), copy06OfArray);
        display.sort(new SelectionSortAsc(), copy07OfArray);
        display.sort(new SelectionSortDesc(), copy08OfArray);
    }
}
