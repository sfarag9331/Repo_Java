package HK13;

import java.util.*;

public class Homework_13 {
    public static void main(String[] args) {


    }

    /**
     * Question 1:
     * Create a method that can find if the given array has any duplicate data or not?
     */


    public void findDuplicates (String [] StringArray) {
            List<String> wordsList = Arrays.asList(StringArray);
            int countDuplicates = 0;
            for (int i = 0; i < wordsList.size(); i++) {
                String valueOfI = wordsList.get(i);
                int firstIndexOf_Word_i = wordsList.indexOf(valueOfI);
                int lastIndexOf_Word_i = wordsList.lastIndexOf(valueOfI);
                if (firstIndexOf_Word_i != lastIndexOf_Word_i) {
                    countDuplicates++;
                }
            }
            if (countDuplicates > 0) {
                System.out.println("Duplicates are found");
            } else {
                System.out.println("Duplicates are NOT found");
            }
        }

    /**
     * Question 2:
     * Create a method that would return the values occurring more than one time in given string-array
     *
     * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     *
     */
        public void returnDuplicateValues (String [] StringArray) {
            List<String> wordsList = Arrays.asList(StringArray);
            List<String> newList = new ArrayList<>();
            for (int i = 0; i < wordsList.size(); i++) {
                String valueOfI = wordsList.get(i);
                int firstIndexOf_Word_i = wordsList.indexOf(valueOfI);
                int lastIndexOf_Word_i = wordsList.lastIndexOf(valueOfI);
                if (firstIndexOf_Word_i != lastIndexOf_Word_i) {
                    if (!newList.contains(valueOfI)) {
                        newList.add(valueOfI);
                    }
                }
            } System.out.println(newList);
        }

    /**
     * Question 3:
     * Create a method that will take String-array as input
     *
     * If there is a color with maximum count, return the color name
     * If there are two or more colors with same number, return all.
     */
    //Ignor - could'nt figure this one out
    public void maximumRepteadedValues (String [] StringArray) {
        List<String> wordsList = Arrays.asList(StringArray);
        Set<String> unique = new HashSet<>(wordsList);
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(wordsList, key));
        }
    }

}
