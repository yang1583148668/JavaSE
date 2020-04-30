package day06.familyaccount;

import java.util.Scanner;

public class FamilyAccount {
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		boolean isFlag=true;
		String detail="";
		int sum=5000;
		String choice;
		String shouruleixing;
		int shourujine;
		String zhichuleixing;
		int zhichujine;
		while (isFlag) {
			System.out.println("----------------家庭收支记账表----------------");
			//System.out.println(detail+"\n");
			System.out.println("\t\t1 显示家庭收支");
			System.out.println("\t\t2记录收入情况");
			System.out.println("\t\t3 记录支出情况");
			System.out.println("\t\t4 记录支出情况");
			System.out.println("----------------------------------------------");
			System.out.println("请输入功能选择(1-4)");
			
			choice = scan.next();
			switch(choice) {
			case "1":
				System.out.println("家庭收支情况如下：");
				System.out.println("收支情况\t\t类型\t\t金额\t\t余额");
				System.out.println(detail);
				System.out.println("\n\n");
				break;
			case "2":
				System.out.println("登记收入情况：");
				System.out.println("请输入收入类型：");
				shouruleixing=scan.next();
				System.out.println("请输入收入金额：");
				shourujine=scan.nextInt();
				sum+=shourujine;
				detail =detail+"收入\t\t"+shouruleixing+"\t\t"+shourujine+"\t\t"+sum+"\n";
				break;
			case "3":
				System.out.println("登记收入情况：");
				System.out.println("请输入支出类型：");
				zhichuleixing=scan.next();
				System.out.println("请输入支出金额：");
				zhichujine=scan.nextInt();
				sum-=zhichujine;
				detail =detail+"支出\t\t"+zhichuleixing+"\t\t"+zhichujine+"\t\t"+sum+"\n";
				break;
			case "4":
				System.out.println("确认退出？(Y/N)");
				String queren = scan.next();
				if(queren.equals("Y")) {
					isFlag = false;
				}
				break;
			default:
				System.out.println("输入错误，请重新选择");	
				
				break;
			}
		}
	}
}
