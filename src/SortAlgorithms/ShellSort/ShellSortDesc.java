package SortAlgorithms.ShellSort;

public class ShellSortDesc extends Shell {
    @Override
    public boolean condition(Comparable<Number> a, Comparable<Number> b) {
        return a.compareTo((Number) b) > 0;
    }
}
