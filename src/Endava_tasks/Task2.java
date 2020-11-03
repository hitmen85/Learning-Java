package Endava_tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Insert the hight ot the staircase: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String j = "#";

       for (int i = 0; i < n; i++) {
           System.out.println(j);
           j = j + "#";
       }
    }
}

