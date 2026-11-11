package com.example;

public class GradeCalculator {

    public char determineLetterGrade(int numberGrade) {
        if (numberGrade < 0 || numberGrade > 100) {
            throw new IllegalArgumentException("Number grade must be between 0 and 100.");
        }
        
        if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';
        } else if (numberGrade < 80) {
            return 'C';
        } else if (numberGrade < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        System.out.println("Score 85 gets grade: " + calculator.determineLetterGrade(85));
    }
}
