package day10.valuetransfer;

import javafx.collections.ListChangeListener.Change;

/*
 *   方法参数传递的原则也是值传递
 *       规则：
 *         如果形参的类型是基本数据类型，那么在调用方法时传递参数传递的是变量值。
 *         如果形参的类型是引用数据类型，那么在调用方法是传递参数传递的是变量指向的对象在堆中的地址
 *         针对字符串类型，因为String的底层为final类型的char[]原因，所以如果对形参进行改变，则会重新创建String对象，并将地址传给形参，
 *         但是对于实参来说，还是指向原地址，所以对形参指向的数组进行操作，也不会影响到实参的值。
 */
public class ValueTransfer {
	public static void main(String[] args) {
		int i1 =1;
		System.out.println("基本数据类型测试 改变前"+i1);
		changeBasic(i1);
		//基本数据类型传参只传i1的值，在其他方法中会新建变量i1 用来存储这个值，对其他方法中的i1做修改并不改变
		//main方法中i1的值
		System.out.println("基本数据类型测试 改变后"+i1);
		
		ValueHelp vh1 = new ValueHelp();
		System.out.println("引用数据类型测试 改变前"+vh1.i);
		changeYinYong(vh1);
		System.out.println("引用数据类型测试 改变后"+vh1.i);
		
		String s1 = "abc";
		String s2 = new String("edf");
		System.out.println("字符串数据类型测试 1改变前"+s1);
		System.out.println("字符串数据类型测试 2改变前"+s2);
		changeString1(s1);
		changeString2(s2);
		System.out.println("字符串数据类型测试 1改变前"+s1);
		System.out.println("字符串数据类型测试 2改变前"+s2);
	}
	
	public static void changeBasic(int i1) {
		i1=2;
	}
	
	public static void changeYinYong(ValueHelp vh) {
		vh.i  =20;
	}
	
	public static void changeString1(String s) {
		s = "hij";
	}
	
	public static void changeString2(String s) {
		s = new String("opq");
	}
}
