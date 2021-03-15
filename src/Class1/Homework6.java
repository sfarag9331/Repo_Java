package Class1;

public class Homework6 {
    public static void main(String[] args) {
        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 90.00 - 100.00
         * Grade B: 80.00 - 89.99
         * Grade C: 70.00 - 79.99
         * Grade D: 60.00 - 69.99
         * Grade E: 50.01 - 59.99
         * Grade F: <= 50.00
         */
        double studentScore = 50;
        double maxScore = 100;
        double studentScorePercentage = studentScore/maxScore;
        double studentScoreGrade = studentScorePercentage*100;
        String grade = "";
        // calculate percentage
        // Your percentage: XX.yy and your Grade is: Z

        if (studentScoreGrade>=90){
            grade = "A";
        } else if (studentScoreGrade<=89.99 && studentScoreGrade>=80) {
            grade = "B";
        }else if (studentScoreGrade<=79.99 && studentScoreGrade>=70){
            grade = "C";
        } else if (studentScoreGrade<=69.99 && studentScoreGrade>=60) {
            grade = "D";
        }else if (studentScoreGrade<=59.99 && studentScoreGrade>=50.01) {
            grade = "E";
        }else if (studentScoreGrade<=50) {
            grade = "F";
        }else{
            System.out.println("Invalid data entered");
        }
        System.out.println("Your percentage: " + studentScoreGrade + "%" + " and your Grade is: " + grade);


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */
        int variable = 13;
        int divisible1 = 3;
        int divisible2 = 5;
        String result;

        if (variable % 3 == 0 && variable % 5 != 0){
            System.out.println("divisible by 3");
        } else if (variable % 3 != 0 && variable % 5 == 0) {
            System.out.println("divisible by 5");
        } else if (variable % 3 == 0 && variable % 5 == 0) {
            System.out.println("divisible by both");
        } else {
            System.out.println(variable);
        }




        /**
         * Checking car gear (P, D, N, R)           // switch
         * if car gear is P, display "you can park the car"
         * if car gear is D,
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car gear is N, display "put car in car wash"
         * if car gear is R, display  "revere the car"
         */
        char carGear = 'R';
        String driveType = "Snow";
        switch (carGear) {
            case 'P':
                System.out.println("You can park the car");
                break;
            case 'D':
                System.out.println("You are on " + driveType + " mode");
                break;
            case 'N':
                System.out.println("put car in car wash");
                break;
            case 'R':
                System.out.println("revere the car");
                break;
        }
    }
}
