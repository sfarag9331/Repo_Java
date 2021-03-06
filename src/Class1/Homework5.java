package Class1;
import java.util.Arrays;
import java.util.Locale;

public class Homework5 {
    public static void main(String[] args) {

        // Due: March 11th


        /**
         * 1. Does first name start with 'K' (ignore cases)
         * 2. If user has a last name, Does last name ends with 'a' (ignore cases)
         *      else print, "No last name entered"
         * 3. If user has a last name, print the 1st letter of last name
         *      else print, "No last name entered"
         * 4. Print the number of letters in the first name.
         */

        String fullName = "KMY pRaCtice";
        String result = "";
        String charStartsWith = "K";
        String fullNameUpperCase = fullName.toUpperCase();
        String fullNameLowerCase = fullName.toLowerCase();
        char firstIndexChar = fullName.charAt(0);

        if (fullNameUpperCase.startsWith(charStartsWith)) {
            System.out.println("First name starts with 'K'");
        } else if (fullNameLowerCase.startsWith(charStartsWith)){
            System.out.println("First name starts with 'K'");
        } else {
            System.out.println("First name does NOT start with " + charStartsWith);
        }

        String[] afterSplitBy_space_1 = fullName.split(" ");
        int totalNumofNames = afterSplitBy_space_1.length;
        char charEndsWith = 'a';
        char charEndsWithCap = 'A';
        int len = fullName.length();
        int lastIndex = len - 1;
        char lastIndexChar = fullNameUpperCase.charAt(lastIndex);
        String result2 = "";
        String lastNameStringIndex = afterSplitBy_space_1[totalNumofNames-1];
        char firstCharInLastNameString = lastNameStringIndex.charAt(0);

        if ((afterSplitBy_space_1.length>=2) && (lastIndexChar==(charEndsWith))){
            result2 = "Last name ends with 'a'";
        } else if ((afterSplitBy_space_1.length>=2) && (lastIndexChar==(charEndsWithCap))){
            result2 = "Last name ends with 'a'";
        } else if ((afterSplitBy_space_1.length>=2)){
            result2 = "Last name does not end with 'a'";
        } else {
            System.out.println("No last name entered");
        }
        System.out.println(result2);

        if ((afterSplitBy_space_1.length>=2)){
            result2 = "Last name begins with the letter " + firstCharInLastNameString;
            System.out.println(result2);
        } else {
            System.out.println("No last name entered");
        }

        String firstName_1 = afterSplitBy_space_1[0];
        int totaNumOfLettersFN = firstName_1.length();
        System.out.println("Total Number of Letters in the First Name: " + totaNumOfLettersFN);


        /**
         * String threeWordsSentence_1 =  "hApPY nEW yeAr";
         * sout(threeWordsSentence_1);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence_1);  // Happy New Year
         */
        String threeWordsSentence_1 =  "saLly farAG Bala";
        System.out.println(threeWordsSentence_1);
        threeWordsSentence_1 = threeWordsSentence_1.toLowerCase();
        String[] afterSplitBy_space = threeWordsSentence_1.split(" ");
        String firstWord = afterSplitBy_space [0];
        String secondWord = afterSplitBy_space [1];
        String thirdWord = afterSplitBy_space [2];

        String firstLetter = firstWord.substring(0, 1);
        String remainingLetters = firstWord.substring(1, firstWord.length());
        firstLetter = firstLetter.toUpperCase();
        firstWord = firstLetter + remainingLetters;

        String firstLetter2 = secondWord.substring(0, 1);
        String remainingLetters2 = secondWord.substring(1, secondWord.length());
        firstLetter2 = firstLetter2.toUpperCase();
        secondWord = firstLetter2 + remainingLetters2;

        String firstLetter3 = thirdWord.substring(0, 1);
        String remainingLetters3 = thirdWord.substring(1, thirdWord.length());
        firstLetter3 = firstLetter3.toUpperCase();
        thirdWord = firstLetter3 + remainingLetters3;
        threeWordsSentence_1 = firstWord + " " + secondWord + " " + thirdWord;

        System.out.println(threeWordsSentence_1);

        /**
         * Create abbreviation:
         * String threeWordsSentence_2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */
        String x = "Lab sessIONS clAsses";
        String xUpperCase = x.toUpperCase();
        String [] xAfterSplitBy_space = xUpperCase.split(" ");
        String xFirstWord = xAfterSplitBy_space[0];
        String xSecondWord = xAfterSplitBy_space[1];
        String xThirdWord = xAfterSplitBy_space[2];
        char xFWFL = xFirstWord.charAt(0);
        char xSWSL = xSecondWord.charAt(0);
        char xTWTL = xThirdWord.charAt(0);
        String xAbbreviation = xFWFL + "" + xSWSL + "" + xTWTL;
        System.out.println(xAbbreviation);


        /**
         * String sentence_4 = "We all are here to learn good stuff";
         * Print the number of words in the sentence.
         *
         */
        String sentence_4 = "We all are here to learn stuff";
        String[] afterSplitBy_spaces = sentence_4.split(" ");
        int numOfWords = afterSplitBy_spaces.length;
        System.out.println(numOfWords);


        /**
         * based on month name, print season
         * dec, jan, feb --> winter season
         * mar, apr, may --> summer season
         * jun, jul, aug --> fall season
         * sep, oct, nov --> spring season
         * if invalid month name, print "Invalid month name - ABC"
         */
        String monthName = "May";  //
        String lowerCaseMonthName = monthName.toLowerCase();

        switch (lowerCaseMonthName) {
            case ("dec"):
                System.out.println("winter season");
                break;
            case ("jan"):
                System.out.println("winter season");
                break;
            case ("feb"):
                System.out.println("winter season");
                break;
            case ("mar"):
                System.out.println("summer season");
                break;
            case ("apr"):
                System.out.println("summer season");
                break;
            case ("may"):
                System.out.println("summer season");
                break;
            case ("jun"):
                System.out.println("fall season");
                break;
            case ("jul"):
                System.out.println("fall season");
                break;
            case ("aug"):
                System.out.println("fall season");
                break;
            case ("sep"):
                System.out.println("spring season");
                break;
            case ("oct"):
                System.out.println("spring season");
                break;
            case ("nov"):
                System.out.println("spring season");
                break;
            default:
                System.out.println("Invalid month name - " + monthName);
                /**
                 * Print the position of searched named.
                 * * if name not found, print "XXXX is not present in the array"
                 *
                 */
                String[] names = {"john", "happy", "peACe", "jOy", "LEarN"};
                char position;
                String nameToSearch = "bla";

                if (names[0].equalsIgnoreCase(nameToSearch)) {
                    position = '1';
                } else if (names[1].equalsIgnoreCase(nameToSearch)) {
                    position = '2';
                } else if (names[2].equalsIgnoreCase(nameToSearch)) {
                    position = '3';
                } else if (names[3].equalsIgnoreCase(nameToSearch)) {
                    position = '4';
                } else if (names[4].equalsIgnoreCase(nameToSearch)) {
                    position = '5';
                } else System.out.println("Not Found");

            }

        }
    }


