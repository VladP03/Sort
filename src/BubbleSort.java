import java.lang.reflect.Array;

public class BubbleSort implements Sort{

    @Override
    public void doSort(Integer[] array) {

        boolean done;

        do {
            done = true;
            for (Integer i=0; i<array.length -1;i++) {
                if (array[i] > array[i+1]) {
                    int aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                    done = false;
                }
            }

        }while (!done);
    }
}
