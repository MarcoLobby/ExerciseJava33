package it.DevelHope.ExerciseJava33;

public class Start {
    public static void main(String[] args) {
        String string = "I Like to code near the Lake with my friend Luke";
        String string2 = string.replaceAll("L[^u]ke", "BLA");

        System.out.println(string2);

    }
}
/*
    You have a string with the following value: I Like to code near the Lake with my friend Luke
    with a regular expression, change into BLA all occurrences of words that start with an l and end with a ke, except your friend
    print the result
*/