package chapter2;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class ArrayListExercise {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(32);
        numbers.add(55);
        numbers.add(69);
        numbers.add(33);
        numbers.add(46);
        numbers.add(49);
        numbers.add(24);


        int result = ArrayListExercise.sumOfEven(numbers);

        System.out.println("Sum of Even Numbers are :" + result);

        ArrayList<String> words = new ArrayList<String>();
        words.add("Java");
        words.add("Meera");
        words.add("Deepa");
        words.add("Apple");
        words.add("Javascript");
        words.add("Python");


        int numWord;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the word:");
        numWord=input.nextInt();

        //prompt the user to enter the word length for the search.

        List<String> strWord=ArrayListExercise.wordList(words,numWord);
        for(String str3 : strWord)
        System.out.println("The Words with letters are:"+str3);

        //Bonus
        String num = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String str[] = num.split(",");
        List<String> al = new ArrayList<String>();
        al = Arrays.asList(str);
        for(String s: al) {
            System.out.println(s);
        }

    }

    public static int sumOfEven(List<Integer> obj) {
        int sum = 0;
        for (int numInt : obj) {
            if (numInt % 2 == 0) {
                sum += numInt;
            }
        }
        return sum;
    }

    public static List<String> wordList(ArrayList<String> strObj,int nl) {

     List<String> objN = new ArrayList<>();
        for (String newStr : strObj) {
            if (newStr.length() == nl) {
                objN.add(newStr);
            }
        }
        return objN;
    }

}


