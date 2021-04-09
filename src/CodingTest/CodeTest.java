package CodingTest;

import java.util.Arrays;

public class CodeTest {
    public static void main(String[] args) {
// Question 3 - method testing
        CodeTest.speedPointSystem(74);
        CodeTest.speedPointSystem(78);
        CodeTest.speedPointSystem(88);
        CodeTest.speedPointSystem(178);
        CodeTest.speedPointSystem(70);
//  Question 1 - method testing - couldn't figure out this completely
        int[] array = {10,20,30};
        CodeTest.removeUserInputFromArray(array , 20);
        System.out.println(Arrays.toString(array));

    }
    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points to be charged against
     * the license for over speeding.
     *
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user speed is such that system shows 12 points for a speed
     *      then print, license is suspended
     *
     *  Example:
     *      user speed = 74 ; 0 points
     *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     *
     */

        public static void speedPointSystem (int userSpeed){
            int speedLimit = 70;
            int points;
            if (userSpeed == speedLimit) {
                System.out.println("Thank you for driving within the speed limit.");
            } else if (userSpeed > speedLimit) {
                points = (userSpeed - speedLimit) / 5;
                if (points < 12) {
                    System.out.println(points + " points");
                } else if (points > 12) {
                    System.out.println("License is suspended");
                }
            }
        }
    /**
     * Question 1:
     * Create a method to return an int-array
     * after removing a given int-value from a given int array.
     *
     * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     *
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */

        public static int [] removeUserInputFromArray(int[] array , int userInput) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != userInput) {
                    array [i] = array [i];
                } else if (array[i] == userInput) {
                    array[i] = array [++i];
                }
            } return array;
        }




}
