package javacoading;

import java.util.Scanner;
public class IfElseclauseInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input marks scored by you"); 
		int marksObtained = input.nextInt();
		int passingMarks = 0;
		char grade;
		if (marksObtained >= passingMarks) {

			if (marksObtained > 90)grade = 'A';

		else if (marksObtained > 75) grade = 'B';
		else if (marksObtained > 60) grade = 'C';
		else
		grade = 'D';

		System.out.println("You passed the exam and your grade is " + grade);
		}
		else {
		grade = 'F';
		System.out.println("You failed and your grade is " + grade);
		}
		
		
		
		
		
	}

}
