package Endava_tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome: ");
        String p = in.nextLine();
        int l = p.length()-1;
        String result = "Palindrome";

        for (int i = 0; i <= l; i++) {
            if (p.charAt(i) == p.charAt(l))
                l--;
            else result = "NOT Palindrome";
            }
        System.out.printf("\'%s\' is %s \n", p, result);
    }
}

