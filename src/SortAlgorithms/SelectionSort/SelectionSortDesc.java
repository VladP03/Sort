package SortAlgorithms.SelectionSort;

public class SelectionSortDesc extends Selection {

    @Override
    public boolean condition(Comparable<Number> a, Comparable<Number> b) {
        return a.compareTo((Number) b) > 0;
    }
}
