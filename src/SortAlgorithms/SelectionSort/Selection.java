package SortAlgorithms.SelectionSort;

import SortAlgorithms.Sort;

public abstract class Selection implements Sort {

    private long time;

    @Override
    public void doSort(Comparable[] array) {

        for (int k=1;k<array.length;k++) {
            int i = k-1;
            Comparable temp =array[k];
            while ( i>=0 && condition(temp,array[i])) {
                array[i+1] = array[i];
                i--;
            }
            if (i!=k-1) {
                array[i+1] = temp;
            }
        }

    }

    public abstract boolean condition(Comparable a, Comparable b);

    @Override
    public long getTime() {
        return time;
    }

    @Override
    public void setTime(long time) {
        this.time = time;
    }
}
