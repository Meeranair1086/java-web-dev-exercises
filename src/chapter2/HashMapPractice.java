package chapter2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter the Student's ID:");

        //get student ID and names
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);
                input.nextLine();
            }
        } while (!newStudent.equals(""));
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID:"+student.getKey() + "  Student Name:"+student.getValue() );
        }
    }
}

