package Endava_tasks;

public class Task4 {

    public static void main(String[] args) {
        int[] bubble = {10, 9, 1, 22, 2, 16, 140, 3, 0, 89, 7, 5, -15, 15};

        for (int i = 0; i < bubble.length; i++) {
            for (int j = 1; j < bubble.length - i; j++)
                if (bubble[j - 1] > bubble[j]) {
                    int temp = bubble[j-1];
                    bubble[j-1] = bubble[j];
                    bubble[j] = temp;
                }
        }
        for (int n = 0; n < bubble.length; n++) {
            System.out.print(bubble[n] + " ");
        }
    }
}
