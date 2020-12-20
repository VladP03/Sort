package SortAlgorithms.NaivSort;

public class NaivSortDesc extends Naiv {

    @Override
    public boolean condition(Comparable a, Comparable b) {
        if (a.compareTo(b) == -1) {
            return true;
        }

        return false;
    }
}
