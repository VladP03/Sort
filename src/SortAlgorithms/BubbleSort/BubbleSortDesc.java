package SortAlgorithms.BubbleSort;

public class BubbleSortDesc extends Bubble {
    @Override
    public boolean condition(Comparable<Number> a, Comparable<Number> b) {
        return a.compareTo((Number) b) < 0;
    }
}
