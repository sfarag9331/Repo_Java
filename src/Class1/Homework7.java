package Class1;

public class Homework7 {
    public static void main(String[] args) {
        // Due: Mar 18, 2021

        /**
         * String sentence1 =  "hApPY nEW yeAr";
         * sout(sentence1);  // hApPY nEW yeAr
         * // code
         * sout(sentence1);  // Happy New Year
         */
        String sentence1 = "i'm 59 yEars OlD";
        String sentence1LC = sentence1.toLowerCase();
        String[] words = sentence1LC.split(" ");
        String firstLetter = "";
        String remainingLetters;


        for (int i = 0; i <= words.length - 1; i++) {
            firstLetter = words[i].substring(0, 1);
            remainingLetters = words[i].substring(1, words[i].length());
            firstLetter = firstLetter.toUpperCase();
            String wordI = firstLetter + remainingLetters;
            System.out.print(wordI + " ");
        }
        System.out.println("");


        /**
         * Create abbreviation:
         * String sentence2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */

        String sentence = "Best place iN THE whole World";
        String sentenceUpperCase = sentence.toUpperCase();
        String[] sentenceArray = sentenceUpperCase.split(" ");
        char sentenceAbbreviation;

        for (int i = 0; i <= sentenceArray.length - 1; i++) {
            sentenceAbbreviation = sentenceArray[i].charAt(0);
            System.out.print(sentenceAbbreviation);
        }
        System.out.println("");


        /**
         * Reverse a string
         *
         String sentence3 = "happy holidays";
         String reverseSentence3 = "";
         System.out.println("sentence3 : " + sentence3);     // happy holidays
         // code
         System.out.println("Reverse sentence3 : " + reverseSentence3);  // syadiloh yppah
         */
        String sentence3 = "happy holidays";
        String reverseSentence3 = "";
        System.out.println("sentence3 : " + sentence3);     // happy holidays
        String[] sentence3AfterSplit = sentence3.split("");

        for (int i = sentence3AfterSplit.length - 1; i >= 0; i--) {
            reverseSentence3 = sentence3AfterSplit[i];
            System.out.print(reverseSentence3);
        }
    }

}
