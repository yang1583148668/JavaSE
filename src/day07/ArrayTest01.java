package day07;

import java.util.Scanner;

public class ArrayTest01 {
	public static void main(String[] args) {
		
		System.out.println("please input the number of students:");
		int num = Util.getStudentNum();
		int[] scores = new int[num];
		for(int i=0;i<num;i++) {
			System.out.println("please input the score of the No."+(i+1)+" student");
			scores[i] = Util.getStudentNum();
		}
		int maxScore = Util.getMaxScore(scores);
		char degree;
		for(int i=0;i<num;i++) {
			if((maxScore - scores[i])<=10) {
				degree='A';
			}else if((maxScore - scores[i])<=20) {
				degree='B';
			}else if((maxScore - scores[i])<=30) {
				degree='C';
			}else {
				degree='D';
			}
			
			System.out.println("the No."+(i+1)+" student's score is"+scores[i]+", degree is "+degree);
		}
		
	}
}
