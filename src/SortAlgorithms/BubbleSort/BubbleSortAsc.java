package SortAlgorithms.BubbleSort;

public class BubbleSortAsc extends Bubble {
    @Override
    public boolean condition(Comparable<Number> a, Comparable<Number> b) {
        return a.compareTo((Number) b) > 0;
    }
}
