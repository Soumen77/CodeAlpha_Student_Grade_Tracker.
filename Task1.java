package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        int[] grades = new int[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }
        
        Arrays.sort(grades);
        
        int sum = 0;
        int highest = grades[numStudents - 1];
        int lowest = grades[0];
        
        for (int grade : grades) {
            sum += grade;
        }
        
        double average = (double) sum / numStudents;
        
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        
        input.close();
    }
}
