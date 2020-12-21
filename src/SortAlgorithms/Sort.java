package SortAlgorithms;

public interface Sort<T extends Comparable<Number>> {

    void doSort(T[] array);
    void setTime(long setTime);
    long getTime();
}
