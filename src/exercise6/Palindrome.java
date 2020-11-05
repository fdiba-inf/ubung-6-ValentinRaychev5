package exercise6;


import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        assert number >= 0 : "error";

        int numberTemp = number;
        //number = Math.abs(number);
        int length = String.valueOf(number).length();
        int[] numArray = new int[length];

        for (int i = 0; i < length; i++)  {
            int digit = numberTemp % 10;
            numberTemp = numberTemp / 10;
            numArray[i] = digit;
        }

        int reversedNum = 0;
        for (int i = 0; i < length; i++)    {
            int currentNum = numArray[i];
            int add = currentNum * (int)Math.pow(10, (length - (i + 1)));
            reversedNum = reversedNum + add;
        }

        boolean palindrome;
        if (reversedNum == number)  {
            palindrome = true;
        }
        else {
            palindrome = false;
        }

        System.out.println("Palindrome: " + palindrome);
    }
}
