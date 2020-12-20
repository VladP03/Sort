import SortAlgorithms.Sort;

public class Display {

    public void sort(Sort strategy, Comparable[] arr) {

        strategy.doSort(arr);
        displayArray(arr);
        System.out.println("\n" + strategy.getClass().getSimpleName() + " -> Time spent to sort: " + strategy.getTime() + " seconds\n");
    }

    public void displayArray (Comparable[] array) {

        for (Comparable value : array) {
            System.out.print(value + " ");
        }
    }
}
