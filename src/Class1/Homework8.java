package Class1;

import java.util.Locale;

public class Homework8 {
    public static void main(String[] args) {
        // Due March 22

        /**
         * task 1:
         * Add all the numbers from given array,
         * and store final result in "total" variable
         */
        double[] doubleArray = {11.23, 43.3, 34, 65.76, 87};
        double total = 0;

        for (double num : doubleArray) {
            total = total + num;
        }
        System.out.println("The sum of array is: " + total);


        /**
         * task 2:
         * Find out if the value stored in word variable is palindrome.
         * And, store the result in "isPalindrome" variable
         * palindrome: string which reads the same in reverse
         * eg:
         * level --> level  (palindrome)
         * eye  --> eye     (palindrome)
         * head --> daeh    (not palindrome)
         */
        String word = "lEVel";
        String wordLowerCase = word.toLowerCase(Locale.ROOT);
        String wordReversed = "";
        String[] wordArray = wordLowerCase.split("");
        boolean isPalindrome;


        for (int i = wordArray.length - 1; i >= 0; i--) {
            wordReversed = wordReversed + wordArray[i];
        }

        if (wordLowerCase.equals(wordReversed)) {
            isPalindrome = true;
            System.out.println("String " + word + " is a palindrome.");
        }
        else {
            isPalindrome = false;
            System.out.println("String " + word + " is not a palindrome.");
        }



        /**
         * task3:
         * Find if the value stored in num variable is a prime number or not.
         * And, store the final result in "isPrime" variable
         * prime number -> number which is ONLY divisible by 1 and itself.
         * eg:
         * 5 -> prime
         * 7 -> prime
         * 10 -> not a prime
         */
        int number = 7;
        boolean isPrime = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                isPrime = true;
            }
        }
        if (!isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");


    }
}
