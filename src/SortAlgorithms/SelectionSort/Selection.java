package SortAlgorithms.SelectionSort;

import SortAlgorithms.Sort;

public abstract class Selection implements Sort {

    private long time;

    @Override
    public void doSort(int[] array) {

        for (int k=1;k<array.length;k++) {
            int i = k-1;
            int temp =array[k];
            while ( i>=0 && condition(temp,array[i])) {
                array[i+1] = array[i];
                i--;
            }
            if (i!=k-1) {
                array[i+1] = temp;
            }
        }

    }

    public abstract boolean condition(int a, int b);

    @Override
    public long getTime() {
        return time;
    }

    @Override
    public void setTime(long time) {
        this.time = time;
    }
}
