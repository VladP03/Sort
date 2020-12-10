import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] arr = new Integer[(int) (Math.random()*100+1)];
        for (int i=0; i<arr.length;i++) {
            arr[i] = (int)(Math.random()*100);
        }

        displaySorted(new BubbleSort(), arr);
    }

    public static void displaySorted(Sort strategy, Integer[] arr) {
        strategy.doSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
