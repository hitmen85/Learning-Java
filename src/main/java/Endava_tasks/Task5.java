package Endava_tasks;

//Given an array of integers, determine the sum of odd numbers and the amount of even numbers

public class Task5 {
    public static void main(String[] args) {
        int [] ar = {8, 9, 12, 2, -5, 0, 16, 20, 2, 7, 5};
        int n, sum = 0, count = 0;

        for (int i=0; i > ar.length; i++) {
            if (ar[i] % 2 == 1) {
                sum = sum + ar[i];
            }
            else {
                count++;
            }
        }
        System.out.println("Sum of odd numbers is: " + sum);
        System.out.println("Count of even numbers is: " + count);
    }
}
