package SortAlgorithms.BubbleSort;

public class BubbleSortDesc extends Bubble {
    @Override
    public boolean condition(Comparable a, Comparable b) {
        if (a.compareTo(b) == -1) {
            return true;
        }

        return false;
    }
}
