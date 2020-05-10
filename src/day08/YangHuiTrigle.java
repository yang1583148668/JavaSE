package day08;
/*
 * 杨辉三角：
 * 	 每一行首数字和尾数字都是1
 * 	从第三行开始非第一个数字和非最后一个数字，的数字的值等于其顶上和左肩数之和
 * 	yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j]
 * 
 * 案例要求：利用二维数组打印一个10行的杨辉三角
 * */

public class YangHuiTrigle {
	public static void main(String[] args) {
		int[][] yanghui = new int[10][];
		for(int i=0;i<10;i++) {
			yanghui[i] = new int[i+1];
			yanghui[i][0]=yanghui[i][i] =1;
			if(i>1) {
				for(int j=1;j<i;j++) {
					yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
				}
			}
		}
		
		for(int i=0;i<yanghui.length;i++) {
			for(int j=0;j<yanghui[i].length;j++) {
				System.out.print(yanghui[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}
