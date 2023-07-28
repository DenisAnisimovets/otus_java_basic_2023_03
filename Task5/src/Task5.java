import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int size = 100000;
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        boolean isEqual = true;
        Random random = new Random(10000);
        for (int i = 0; i < size; i++) {
            array1.add(random.nextInt());
            array2.add(array1.get(i));
        }


        long startTimePrimitives = System.currentTimeMillis();
        bubbleSort(array1);
        long endTimePrimitives = System.currentTimeMillis();
        System.out.println("Bubble sort: " + (endTimePrimitives - startTimePrimitives) + " milliseconds");

        startTimePrimitives = System.currentTimeMillis();
        Collections.sort(array2);
        endTimePrimitives = System.currentTimeMillis();
        System.out.println("Collection sort: " + (endTimePrimitives - startTimePrimitives) + " milliseconds");

        for (int i = 0; i < size; i++) {
            if(!array1.get(i).equals(array2.get(i))) {
                isEqual = false;
                System.out.println(i + " " + array1.get(i) + " " + array2.get(i));
            }
        }

        if(isEqual) {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(list.get(j) > list.get(j + 1)) {
                    // Меняем местами элементы
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
