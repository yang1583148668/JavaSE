package day08;
/*
 * 冒泡排序：
 * 冒泡排序的思想是依次比较相邻的2个元素，每次可以找到一个最大或最小的值放到末尾，然后再重头开始找到第二大或者第二小，依次类推，
 * 直到所有的数字排序完成
 * 
 * 举例：将int型的数组按照升序排列
 */
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] arr1 = new  int[] {45,57,32,1,109,500,-1};
		int tmp;
		//需要比较的轮数
		for(int i =0;i<arr1.length-1;i++) {
			//每一轮需要比较的次数
			for(int j=0;j<arr1.length-1-i;j++) {
				if(arr1[j]>arr1[j+1]) {
					tmp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1]=tmp;
				}
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
