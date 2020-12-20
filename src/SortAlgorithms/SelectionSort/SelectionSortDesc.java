package SortAlgorithms.SelectionSort;

public class SelectionSortDesc extends Selection {

    @Override
    public boolean condition(Comparable a, Comparable b) {
        if (a.compareTo(b) == 1) {
            return true;
        }

        return false;
    }
}
