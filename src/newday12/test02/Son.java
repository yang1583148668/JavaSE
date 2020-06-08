package newday12.test02;

public class Son extends Father {
	public String info = "son";
	
	public void test() {
		System.out.println(this.getInfo());
		System.out.println(super.getInfo());
	}
}
