package SortAlgorithms.BubbleSort;

import SortAlgorithms.Sort;

public abstract class Bubble implements Sort {

    long time;

    @Override
    public void doSort(int[] array) {

        boolean done;

        long start = System.nanoTime();
        do {
            done = true;
            for (Integer i=0; i<array.length -1;i++) {
                if (condition(array[i],array[i+1])) {
                    int aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                    done = false;
                }
            }

        }while (!done);

        long end = System.nanoTime();

        setTime((end-start)/1_000_000_000);     // return in seconds
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
