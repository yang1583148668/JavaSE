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
			System.out.println("----------------��ͥ��֧���˱�----------------");
			//System.out.println(detail+"\n");
			System.out.println("\t\t1 ��ʾ��ͥ��֧");
			System.out.println("\t\t2��¼�������");
			System.out.println("\t\t3 ��¼֧�����");
			System.out.println("\t\t4 ��¼֧�����");
			System.out.println("----------------------------------------------");
			System.out.println("�����빦��ѡ��(1-4)");
			
			choice = scan.next();
			switch(choice) {
			case "1":
				System.out.println("��ͥ��֧������£�");
				System.out.println("��֧���\t\t����\t\t���\t\t���");
				System.out.println(detail);
				System.out.println("\n\n");
				break;
			case "2":
				System.out.println("�Ǽ����������");
				System.out.println("�������������ͣ�");
				shouruleixing=scan.next();
				System.out.println("�����������");
				shourujine=scan.nextInt();
				sum+=shourujine;
				detail =detail+"����\t\t"+shouruleixing+"\t\t"+shourujine+"\t\t"+sum+"\n";
				break;
			case "3":
				System.out.println("�Ǽ����������");
				System.out.println("������֧�����ͣ�");
				zhichuleixing=scan.next();
				System.out.println("������֧����");
				zhichujine=scan.nextInt();
				sum-=zhichujine;
				detail =detail+"֧��\t\t"+zhichuleixing+"\t\t"+zhichujine+"\t\t"+sum+"\n";
				break;
			case "4":
				System.out.println("ȷ���˳���(Y/N)");
				String queren = scan.next();
				if(queren.equals("Y")) {
					isFlag = false;
				}
				break;
			default:
				System.out.println("�������������ѡ��");	
				
				break;
			}
		}
	}
}
