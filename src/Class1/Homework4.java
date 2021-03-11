package Class1;

public class Homework4 {
    public static void main(String[] args) {

            // Due : March 8

            /**
             * Assign result as true if length of sentence_3 is greater than 10
             * else assign false
             *
             * Hint: use ternary operator
             */
            String sentence_3 = "hello dear, how are you?";
            int sentence_3Length = sentence_3.length();
            int length = 10;
            boolean result = sentence_3Length > length ? true : false;
            System.out.println("1. Is the string's length greater than 10?" + " " + result);


            /**
             *  1. Replace all 'r' with 'f' (Ignore cases)
             */
            String sentence_4 = "We all ARe Good ProgRommeR";
            String sentence_4Lowercase = sentence_4.toLowerCase();
            String sentence_4New = sentence_4Lowercase.replace('r','f');
            System.out.println("\n2. " + sentence_4New);


            /**
             * 1. Display the length of your fullname.
             * 2. Does your name start with 'K' (ignore cases)
             * 3. Does your full name contain 'a' (ignore cases)
             */
            String fullName = "Sally Farag";
            int fullNameLength = fullName.length();
            String fullNameLowerCase = fullName.toLowerCase();
            String fullNameUpperCase = fullName.toUpperCase();
            boolean doesFullNameContainK = fullNameUpperCase.contains("K");
            boolean doesFullNameContaina = fullNameLowerCase.contains("a");
            System.out.println("\n3. My full name's length is " + fullNameLength);
            System.out.println("Does my full name contain 'K'? " + doesFullNameContainK);
            System.out.println("Does my full name contain 'a'? " + doesFullNameContaina);

        }
    }