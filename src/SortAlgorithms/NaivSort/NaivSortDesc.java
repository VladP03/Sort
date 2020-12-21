package SortAlgorithms.NaivSort;

public class NaivSortDesc extends Naiv {

    @Override
    public boolean condition(Comparable<Number> a, Comparable<Number> b) {
        return a.compareTo((Number) b) < 0;
    }
}
