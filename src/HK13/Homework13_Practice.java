package HK13;

public class Homework13_Practice {
    public static void main(String[] args) {
        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green",  "red", "yellow", "yellow", "grey", "blue" , "yellow", "grey",
                "green", "blue",  "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};
    Homework_13 a1 = new Homework_13();
    a1.findDuplicates(words);
    a1.returnDuplicateValues(words);
    a1.maximumRepteadedValues(arr);
    }
}
