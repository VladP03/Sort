package SortAlgorithms.NaivSort;

import SortAlgorithms.Sort;

public abstract class Naiv implements Sort {

    private long time;

    @Override
    public void doSort(Comparable[] array) {

        long start = System.nanoTime();

        for (int i=0;i<array.length-1;i++) {
            for (int j=i+1;j<array.length;j++) {
                if (condition(array[i],array[j])) {
                    swap(array, i, j);
                }
            }
        }

        long end = System.nanoTime();

        setTime((end-start)/1_000_000_000);     // return in seconds
    }

    public abstract boolean condition(Comparable a, Comparable b);

    public void swap(Comparable[] array, int i, int j) {
        Comparable aux = array[i];
        array[i] = array[j];
        array[j]=aux;
    }

    @Override
    public void setTime(long setTime) {
        this.time = setTime;
    }

    @Override
    public long getTime() {
        return time;
    }
}
