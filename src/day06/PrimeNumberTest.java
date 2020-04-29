package day06;

/*
 * 打印100以内的所有质数
 * */
public class PrimeNumberTest {
	public static void main(String[] args) {
		for(int i=2;i<=100;i++) {
			boolean isFlag=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isFlag = false;
					break;
				}
			}
			if(isFlag) {
				System.out.println(i);
			}
		}
	}
}
