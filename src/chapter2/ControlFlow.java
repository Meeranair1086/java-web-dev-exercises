package chapter2;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
public class ControlFlow {
    public static void main(String[] args) {
        int arrInt[] = {1, 1, 2, 3, 5, 8};
        int numArray = 0;
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("The array elements are: "+ arrInt[i]);
        }
        //Printing Odd numbers in the array
        for(int j=0;j<arrInt.length;j++){
           if(arrInt[j]%2!=0){
               System.out.println("The Odd numbers in the array are:"+ arrInt[j]);
           }
        }
        //using Split method to divide the string at each space and store the individual words in an array.
        String str="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String strArray[]= str.split(" ");
        System.out.println("The array of strings are: "+Arrays.toString(strArray));

        //change the delimiter to split the string into separate sentences.
        String str1="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String strArray1[]=str1.split("\\.");
        System.out.println("The array of strings with changing the delimiter are: "+Arrays.toString(strArray1));
    }
}

