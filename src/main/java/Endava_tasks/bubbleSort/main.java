package Endava_tasks.bubbleSort;
class Main {

    public static void main(String[] args) {
        int[] array = {10, 9, 1, 22, 2, 16, 140, 3, 0, 89, 7, 5, -15, 15};
        printArray(array);
        Algorithms.bubbleSort(array);
        printArray(array);
        }

        private static void printArray(int[] array) {
            for(int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
        }
            System.out.println();
    }

}
