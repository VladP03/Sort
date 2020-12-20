package SortAlgorithms.ShellSort;

public class ShellSortAsc extends Shell {
    @Override
    public boolean condition(Comparable a, Comparable b) {
        if (a.compareTo(b) == 1) {
            return true;
        }

        return false;
    }
}
