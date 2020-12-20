import java.util.Random;

public class Initialize {

    private int sizeOfArray;
    private int numbersOfDigits;
    private Random random = new Random();

    public Initialize(int sizeOfArray, int numbersOfDigits) {
        this.sizeOfArray = sizeOfArray;
        this.numbersOfDigits = numbersOfDigits;
    }

    public Integer[] getArray(Integer param) {
        Integer[] array = new Integer[this.sizeOfArray];

        for (int i=0;i<sizeOfArray;i++) {
            array[i] = random.nextInt((int) Math.pow(10,numbersOfDigits));
        }

        return array;
    }

    public Double[] getArray(Double param) {
        Double[] array = new Double[this.sizeOfArray];

        for (int i=0;i<sizeOfArray;i++) {
            array[i] = Math.pow(10,numbersOfDigits)*random.nextDouble();
        }

        return array;
    }
}
