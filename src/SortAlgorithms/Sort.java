package SortAlgorithms;

public interface Sort<T extends Comparable> {

    void doSort(T[] array);
    void setTime(long setTime);
    long getTime();
}
