package Endava_tasks;

import javafx.beans.binding.When;

public class Palindrome {
    private String str = "Ana";

    public static boolean isPalindrome(String expected){
        StringBuilder actualResult = new StringBuilder(expected);
        actualResult = actualResult.reverse();
        return expected.equalsIgnoreCase(actualResult.toString());
    }

    public static boolean isPalindromeNewMethod(String expected){
        String actualResult = "";
        for(int i = expected.length() - 1; i >= 0; i--){
            actualResult += expected.charAt(i);
        }
        return expected.equalsIgnoreCase(actualResult);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Ana"));
        System.out.println(isPalindrome("Andrei"));
        System.out.println(isPalindromeNewMethod("Ana bob ana"));
    }
}
