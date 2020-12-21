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

        Integer[] integerArray = initialize.getIntegerArray();
        Double[] doubleArray = initialize.getDoubleArray();

        display.sort(new BubbleSortAsc(), integerArray.clone());
        display.sort(new BubbleSortDesc(), integerArray.clone());
        display.sort(new NaivSortAsc(), integerArray.clone());
        display.sort(new NaivSortDesc(), integerArray.clone());
        display.sort(new ShellSortAsc(), integerArray.clone());
        display.sort(new ShellSortDesc(), integerArray.clone());
        display.sort(new SelectionSortAsc(), integerArray.clone());
        display.sort(new SelectionSortDesc(), integerArray.clone());
    }
}
