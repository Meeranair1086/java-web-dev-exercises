package exercises;
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length:");
        double rectangleLength=input.nextDouble();

        System.out.println("Enter the Width:");
        double rectangleWidth=input.nextDouble();

        double area=rectangleLength*rectangleWidth;
        System.out.println("Area of the Rectangle is " +area);
    }
}
