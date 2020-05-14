package day10.overirde;
/*练习一
 * 定义三个重载方法并调用，方法名为mOL
 * 1 三个方法分别接收一个int型参数，两个int型参数， 一个字符串类型
 * 2 三个方法分别执行计算平方，计算乘积，输出字符串信息
 * 3 主类main方法中分别用参数区分三个方法
 * 
 * 练习二：
 * 	定义三个重载方法max， 第一个方法分别求两个int型的最大值，第二个求2个double型的最大值，第三个求3个double型的最大值
 */
public class OveLoadTest {
	public static void main(String[] args) {
		Overload overload1 = new Overload();
		overload1.mOL(2);
		overload1.mOL(5, 6);
		overload1.mOL("hello");
		
		MaxOverload maxOverload = new MaxOverload();
		maxOverload.max(5, 4);
		maxOverload.max(5.4, 6.9);
		maxOverload.max(5.0, 7.2, 2.3);
	}
	
	
}
