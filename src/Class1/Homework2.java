package Class1;

public class Homework2 {
    public static void main(String[] args) {

        /**

         Due: Thursday Feb 25

         Store below scenario value in an appropriate dataType variable, and print the same in console.
         1. number of hours in a day (byte)
         2. max no. of days in an year
         3. total number of employees in an organization
         4. population in a country
         5. interest rate
         6. balance in a bank account
         7. does the sun rise from the west? Store answer
         8. initials of your name (^Use: char)
         */
        /* 1. number of hours in a day (byte) */
        byte numOfHours = 24;
        System.out.println("There are " + numOfHours + " hours in a day");

        /* 2. max no. of days in an year */
        short numOfDays = 365;
        System.out.println("There are " + numOfDays + " days in a year");

        /* 3. total number of employees in an organization */
        int numOfEmployees = 575700;
        System.out.println("There are " + numOfEmployees + " employees in Amazon");

        /* 4. population in a country */
        int numOfPeople = 8655535;
        System.out.println("Israel 2020 population is estimated at " + numOfPeople + " people");

        /* 5. interest rate */
        double interestRate = 2.19;
        System.out.println("My mortgage's interest rate is " + interestRate + "%");

        /* 6. balance in a bank account */
        double bankAcctBalance = 109.33;
        System.out.println("My account balance is $" + bankAcctBalance);

        /* 7. does the sun rise from the west? Store answer */
        boolean isSunRiseWest = false;
        System.out.println("Does the sun rise from the west? " + isSunRiseWest);

        /* 8. initials of your name (^Use: char) */
        char firstNameInitial = 'S';
        char lastNameInitial = 'F';
        System.out.println("My name's initials are " + firstNameInitial + lastNameInitial);
    }
}