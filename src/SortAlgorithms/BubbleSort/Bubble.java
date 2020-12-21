package SortAlgorithms.BubbleSort;

import SortAlgorithms.Sort;

public abstract class Bubble implements Sort<Comparable<Number>> {
    private long time;

    @Override
    public void doSort(Comparable<Number>[] array) {
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

    public abstract boolean condition(Comparable<Number> a, Comparable<Number> b);

    public void swap(Comparable<Number>[] array, int i, int j) {
        Comparable<Number> aux = array[i];
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
