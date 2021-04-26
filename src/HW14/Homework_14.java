package HW14;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.*;

public class Homework_14 {

    public static void main(String[] args) {

        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        List<String> StringArray = new ArrayList<>();
        List<String> wordsList = Arrays.asList(words);


        Homework_14 a1 = new Homework_14();
        a1.printDuplicates(wordsList);

        Map<Integer , String> integerKeyMap = new HashMap<>();
        integerKeyMap.put(101 , "happy");
        integerKeyMap.put(102 , "peace");
        integerKeyMap.put(103 , "Happy");
        integerKeyMap.put(104 , "learn");
        integerKeyMap.put(105 , "PEaCe");
        integerKeyMap.put(106 , "HAPPY");
        System.out.println(integerKeyMap);
        a1.keysWithSameValue(integerKeyMap);


        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green","grey","grey","grey","grey"};
        a1.printMaximumKeys(arr);
    }

    /**
     * Question 1:
     * Create a method, that will return all duplicates values with count from the given List<String>
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * Output:
     *      happy - 2
     *      joy - 3
     *      laugh - 2
     */
    public void printDuplicates (List<String> String_Array) {
        HashMap<String, Integer> count = new HashMap<>();
        for (int i = 0; i < String_Array.size(); i++) {
            String valueOfI = String_Array.get(i);
            if (!count.containsKey(valueOfI))
                count.put(valueOfI, 1);
            else
                count.put(valueOfI,
                        count.get(valueOfI) + 1);
        }

        HashMap<String, Integer> count2 = new HashMap<>();
        Set<String> allKeys = count.keySet();
        for (String key : allKeys) {
            Integer val = count.get(key);
            if (val != 1) {
                count2.put(key , val);
            }
        }
        System.out.println(count2);

    }




    /**
     *
     * Question 2:
     * Create a hashMap with any numbers of key-value pairs from the user
     * Key should be Integer
     * Value should be String
     *
     * Create method that will print the keys with same value, else "All keys have different values"
     *
     * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
     * Output (print) ->
     *      "happy" with keys -> 101, 103, 106
     *      "peace" with keys -> 102, 105
     *
     * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
     * Output (print) ->
     *      All keys have different values
     *
     *
     */
    public void keysWithSameValue (Map<Integer , String> integerKeyMap) {

        Collection<String> allValues = integerKeyMap.values();
        Set<Integer> allKeys = integerKeyMap.keySet();
        Set<Integer> keySet = new HashSet<>();
        String val = "";

        for (Integer key : allKeys) {
            val = integerKeyMap.get(key).toLowerCase();
            if (integerKeyMap.containsValue(val.toLowerCase()) == true) {
                keySet.add(key);
            }

        }
        System.out.println(val + " with keys " + keySet);

    }








    /**
     * Question 3:
     * Create a method that will take String-array as input
     *
     * If there is a color with maximum count, return the color name
     * If there are two or more colors with same number, return all.
     */

    public void printMaximumKeys (String[] String_Array) {
        HashMap<String, Integer> count = new HashMap<>();
        List<String> wordsList = Arrays.asList(String_Array);
        for (int i = 0; i < wordsList.size(); i++) {
            String valueOfI = wordsList.get(i);
            if (!count.containsKey(valueOfI))
                count.put(valueOfI, 1);
            else
                count.put(valueOfI,
                        count.get(valueOfI) + 1);
        }

        Set<String> allKeys = count.keySet();
        Integer maxVal = 0;
        String maxKey = "";
        for (String key : allKeys) {
            Integer val = count.get(key);
            if (val > maxVal) {
                maxVal = val;
            }
        }
        for (String key2 : allKeys) {
            Integer val2 = count.get(key2);
            if (maxVal == val2) {
                System.out.println(key2);
            }
        }

    }
}

