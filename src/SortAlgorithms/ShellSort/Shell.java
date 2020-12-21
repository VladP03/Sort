package SortAlgorithms.ShellSort;

import SortAlgorithms.Sort;

public abstract class Shell implements Sort<Comparable<Number>> {

    private long time;

    @Override
    public void doSort(Comparable<Number>[] array) {
        long start = System.nanoTime();

        int nrIncr = 4;
        int h = nrIncr + 1;

        for (int k = 0; k < nrIncr; k++) {
            h--;
            for (int i = 0; i < array.length; i = i + h) {
                Comparable<Number> temp = array[i];
                int j = i - h;
                while (j >= 0 && condition(temp, array[j])) {
                    array[j + h] = array[j];
                    j = j - h;
                }
                if (j + h != i) {
                    array[j + h] = temp;
                }
            }
        }

        long end = System.nanoTime();

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
