import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        int sizeOfArray;            // size of the array
        int numbersOfDigits;        // in which interval are the numbers generated

        Random random = new Random();       // generate the numbers;

        sizeOfArray = 1_000_000_000;
        numbersOfDigits = 4;

        int[] array = new int[sizeOfArray];
        for (int i=0;i<array.length;i++) {
            array[i] = random.nextInt((int) Math.pow(10,numbersOfDigits));
        }

        main.displaySorted(new BubbleSort(), array);
    }

    private void displaySorted(Sort strategy, int[] arr) {
        strategy.doSort(arr);
        //displayArray(arr);
        System.out.println(strategy.getTime());
    }

    private void displayArray (int[] array) {

        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
