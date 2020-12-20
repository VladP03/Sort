import SortAlgorithms.BubbleSort.BubbleSortAsc;
import SortAlgorithms.BubbleSort.BubbleSortDesc;
import SortAlgorithms.NaivSort.NaivSortAsc;
import SortAlgorithms.NaivSort.NaivSortDesc;
import SortAlgorithms.SelectionSort.SelectionSortAsc;
import SortAlgorithms.SelectionSort.SelectionSortDesc;
import SortAlgorithms.ShellSort.ShellSortAsc;
import SortAlgorithms.ShellSort.ShellSortDesc;


public class Main {

    public static void main(String[] args) {

        Initialize initialize = new Initialize(50_000, 7);
        Display display = new Display();

        Integer[] integerArray = initialize.getArray(0);
        Double[] doubleArray = initialize.getArray(0.0d);

        display.sort(new BubbleSortAsc(), integerArray);

        /*
        display.sort(new BubbleSortAsc(), array.clone());
        display.sort(new BubbleSortDesc(), array.clone());
        display.sort(new NaivSortAsc(), array.clone());
        display.sort(new NaivSortDesc(), array.clone());
        display.sort(new ShellSortAsc(), array.clone());
        display.sort(new ShellSortDesc(), array.clone());
        display.sort(new SelectionSortAsc(), array.clone());
        display.sort(new SelectionSortDesc(), array.clone());
         */
    }
}
