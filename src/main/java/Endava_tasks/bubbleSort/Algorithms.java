package Endava_tasks.bubbleSort;

public class Algorithms {
    public static void bubbleSort(int[] array) {
        int whileCount = 0;
        int forCount = 0;
        while (!isSorted(array)) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                forCount++;
            }
            whileCount++;
        }
        System.out.println("While count:" + whileCount);
        System.out.println("For count:" + forCount);
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
