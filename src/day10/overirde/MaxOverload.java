package day10.overirde;

public class MaxOverload {
	public void max(int i1,int i2) {
		int max;
		if(i1>i2) {
			max = i1;
		}else {
			max = i2;
		}
		System.out.println("the max is "+max);
	}
	
	public void max(double d1,double d2) {
		// TODO Auto-generated method stub
		double  max;
		if(d1>d2) {
			max = d1;
		}else {
			max = d2;
		}
		System.out.println("the max is "+max);
	}
	public void max(double d1,double d2,double d3) {
		double max = d1>d2?(d1>d3?d1:d3):(d2>d3?d2:d3);
		System.out.println("the max is "+ max);
	}
}
