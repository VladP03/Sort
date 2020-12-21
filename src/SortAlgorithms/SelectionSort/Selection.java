package SortAlgorithms.SelectionSort;

import SortAlgorithms.Sort;

public abstract class Selection implements Sort<Comparable<Number>> {
    private long time;

    @Override
    public void doSort(Comparable<Number>[] array) {

        long start = System.nanoTime();                         // start the timer
        for (int k=1;k<array.length;k++) {
            int i = k-1;
            Comparable<Number> temp =array[k];
            while ( i>=0 && condition(temp,array[i])) {
                array[i+1] = array[i];
                i--;
            }
            if (i!=k-1) {
                array[i+1] = temp;
            }
        }
        long end = System.nanoTime();                           // stop the timer

        setTime((end-start)/1_000_000_000);     // return in seconds
    }

    public abstract boolean condition(Comparable<Number> a, Comparable<Number> b);

    @Override
    public long getTime() {
        return time;
    }

    @Override
    public void setTime(long time) {
        this.time = time;
    }
}
