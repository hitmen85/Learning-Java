package Endava_tasks;

public class Task3 {
    public static void main(String[] args) {
        float numbers [] = {16.5f, 1.25f, 168.12f, 1300.72f, 12f, 14.58f, 1.32f};
        int j = numbers.length-1;
        float temp = 0;

        for (int i = 0; i <= j; i++) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            j--;
        }
        for (int n = 0; n < numbers.length; n++) {
            System.out.print(numbers[n] + ", ");
        }
    }
}
