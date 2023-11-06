package Function;

import java.util.Scanner;

public class GradeCalculator {
    public static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any percentage:");
        double percentage = sc.nextDouble();   
        char grade = calculateGrade(percentage);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}

