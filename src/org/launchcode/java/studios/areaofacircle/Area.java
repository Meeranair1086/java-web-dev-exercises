package org.launchcode.java.studios.areaofacircle;
import java.lang.*;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double areaOfTheCircle;
        //double pi=3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius:");
        double radius = input.nextDouble();
        areaOfTheCircle = Circle.getArea(radius);
        String value="";
        if (radius <= 0) {
            System.out.println("Radius must be greater than 0");
        }
        else if(radius=null){
            System.out.println("Radius must be greater than 0");
        }
        {        else {
            System.out.println("The area of a circle of radius " + radius + " is: " + areaOfTheCircle);
        }
    }
}
