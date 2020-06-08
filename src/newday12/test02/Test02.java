package newday12.test02;

public class Test02 {
	public static void main(String[] args) {
		Father father = new Father();
		Son son = new Son();
		System.out.println(father.getInfo());
		System.out.println(son.getInfo());
		son.test();
		System.out.println("-----");
		son.setInfo("new");
		System.out.println(father.getInfo());
		System.out.println(son.getInfo());
		son.test();
	}
}
