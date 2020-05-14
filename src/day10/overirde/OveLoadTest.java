package day10.overirde;
/*重载练习
 * 编写3个重载方法，方法名称为mOL
 * 1 三个方法分别接收1个int型变量，2个int型变量，1个字符串变量
 * 2 三个方法分别计算1个参数的平方，2个参数的乘积，一个字符串的输出
 * 3 定义main方法分别调用三个方法
 * 
 * 练习2，计算最大值
 * 	定义三个max方法，然后分别计算2个int型参数的最大值，2个double型的最大值，3个double型的最大值。
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
