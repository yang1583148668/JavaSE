package day07;

import java.util.Scanner;

public class Util {
	public static Scanner scanner = new Scanner(System.in);
	
	public static int getStudentNum() {
		
		int num = scanner.nextInt();
		return num;
	}

	public static int getMaxScore(int[] scores) {
		// TODO Auto-generated method stub
		int max = scores[0];
		for(int score:scores) {
			if(score>max) {
				max=score;
			}
		}
		return max;
	}
}
