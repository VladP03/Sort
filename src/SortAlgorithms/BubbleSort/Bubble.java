package SortAlgorithms.BubbleSort;

import SortAlgorithms.Sort;

public abstract class Bubble implements Sort {
    private long time;

    @Override
    public void doSort(Comparable[] array) {
        boolean done;

        long start = System.nanoTime();
        do {
            done = true;
            for (int i = 0; i<array.length -1; i++) {
                if (condition(array[i],array[i+1])) {
                    swap(array, i, i+1);
                    done = false;
                }
            }

        }while (!done);

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
    public long getTime() {
        return time;
    }

    @Override
    public void setTime(long time) {
        this.time = time;
    }

}
