import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int size = 10000;
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        boolean isEqual = true;
        Random random = new Random(10000);
        for (int i = 0; i < size; i++) {
            array1[i] = random.nextInt();
            array2[i] = array1[i];
        }

        long startTimePrimitives = System.currentTimeMillis();
        bubbleSort(array1);
        long endTimePrimitives = System.currentTimeMillis();
        System.out.println("Bubble sort: " + (endTimePrimitives - startTimePrimitives) + " milliseconds");

        startTimePrimitives = System.currentTimeMillis();
        bubbleSort(array2);
        endTimePrimitives = System.currentTimeMillis();
        System.out.println("Collection sort: " + (endTimePrimitives - startTimePrimitives) + " milliseconds");

        for (int i = 0; i < size; i++) {
            if(array1[i] != array2[i]) {
                isEqual = false;
                System.out.println(i + " " + array1[i] + " " + array2[i]);
            }
        }

        if(isEqual) {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
