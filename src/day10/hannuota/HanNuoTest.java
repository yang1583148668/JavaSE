package day10.hannuota;
/*
 * 汉诺塔
 * 算法原理
 * 整个问题：可以必然可以分解为下面的3过程：

1、将A柱2个盘子移动到C柱；

2、将A柱1个盘子移动到B柱；

3、将C柱2个盘子移动到B柱；

将A柱3个盘子借助C柱移动到B柱；

用函数表示：f(3,A,B,C);

1、将A柱2个盘子移动到C柱；

f(2,A,C,B);

2、将A柱1个盘子移动到B柱；

f(1,A,B,C)->将A柱盘子移动到B柱;

3、将C柱2个盘子借助A柱移动到B柱；

f(2,C,B,A);

函数关系式：f(3,A,B,C)=f(2,A,C,B)+f(1,A,B,C)+f(2,C,B,A);

推广到n的情况：

f(n,A,B,C)=f(n-1,A,C,B)+f(1,A,B,C)+f(n-1,C,B,A);

 */
public class HanNuoTest {
	public static void main(String[] args) {
		hannuo(3,'A','B','C');
	}
	//n 代表A盘上的个数，A代表需要移走的柱子，B代表目标柱，C代表中间柱
	public static void hannuo(int n, char A,char B,char C) {
		
		if(n==1) {
			System.out.println("move: "+A+"->"+B);
			return;
		}
		hannuo(n-1,A,C,B);
		hannuo(1,A,B,C);
		hannuo(n-1,C,B,A);
	}
}







