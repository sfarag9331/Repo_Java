package Class1;

public class Homework9 {
    public static void main(String[] args) {
        System.out.println(Titlecase(" hello wOrLD  "));

        studentGrade (50,100);

        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        ReverseIntArray(intArray);

        NumberOfWords ("One day at a time.");


    }
    // Due: Mar 25, 2021

    /**
     * Write a method to convert given string into Titlecase
     */
    public static String Titlecase (String myString) {
        String[] myStringArray = myString.trim().split(" ");
        myString = "";
        for (int i = 0; i < myStringArray.length; i++) {
            myString = myString + myStringArray[i].substring(0, 1).toUpperCase() + myStringArray[i].substring(1).toLowerCase() + " ";
        }
        myString = myString.trim();
        return myString;
    }

    /**
     * Write a method that will tell grade to student for given score and MaxScore
     */

    public static void studentGrade (double studentScore, double maxScore) {
        double studentScorePercentage = studentScore / maxScore;
        double studentScoreGrade = studentScorePercentage * 100;
        String studentGrade = "";

        if (studentScoreGrade >= 90) {
            studentGrade = "A";
        } else if (studentScoreGrade <= 89.99 && studentScoreGrade >= 80) {
            studentGrade = "B";
        } else if (studentScoreGrade <= 79.99 && studentScoreGrade >= 70) {
            studentGrade = "C";
        } else if (studentScoreGrade <= 69.99 && studentScoreGrade >= 60) {
            studentGrade = "D";
        } else if (studentScoreGrade <= 59.99 && studentScoreGrade >= 50.01) {
            studentGrade = "E";
        } else if (studentScoreGrade <= 50) {
            studentGrade = "F";
        } else {
            System.out.println("Invalid data entered");
        }
        System.out.println("Your percentage: " + studentScoreGrade + "%" + " and your Grade is: " + studentGrade);
    }

    /**
     * Write a method that will reverse any given int-array
     */
    public static void ReverseIntArray (int intArray[]) {
        System.out.println("Original Array printed in reverse order:");
        for (int i = intArray.length - 1; i >= 0; i--)
            System.out.print(intArray[i] + "  ");
    }

    /**
     * Write a method that return the number of words in given sentence.
     */
    public static int NumberOfWords (String givenSentence) {
        String[] givenSentenceArray = givenSentence.split(" ");
        return givenSentenceArray.length;
    }
}
