package SortAlgorithms.ShellSort;

import SortAlgorithms.Sort;

public abstract class Shell implements Sort {

    private long time;

    @Override
    public void doSort(Comparable[] array) {

        int nrIncr = 4;
        int h = nrIncr + 1;

        for (int k = 0; k < nrIncr; k++) {
            h--;
            for (int i = 0; i < array.length; i = i + h) {
                Comparable temp = array[i];
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
