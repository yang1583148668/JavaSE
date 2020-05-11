package day08;
/*
 * 快速排序算法
 *1 从数列中挑出一个基准值。
 *2 从后往前找到一个比基准值小的数，然后从前往后找一个比基准值大的数，交换2个数的位置
 *3 当从左往右查找和从右往左查找相遇时，表明在相遇点，左边除基准外都是比基准小的数，右边都是比基准大的数，
 *4 交换基准值和相遇点左侧的数
(2) 将所有比基准值小的摆放在基准前面，所有比基准值大的摆在基准的后面(相同的数可以到任一边)；在这个分区退出之后，该基准就处于数列的中间位置。
(3) 递归地把"基准值前面的子数列"和"基准值后面的子数列"进行排序。
 * 
 * 
 * 
 */
public class QuickSortTest {
	public static void main(String[] args) {
		
		int[] arr1 = new int[]{7,-1,6,87,7,7,2,19};
		//System.out.println(arr1[0]);
		quicksort(arr1,0,arr1.length-1);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
	
	public static void quicksort(int[] arr1, int left, int right) {
		// TODO Auto-generated method stub
		if(left>right) {
			return;
		}
		
		int currentLeft = left;
		int currentright = right;
		int keyvalue = arr1[left];
		
		while(currentLeft<currentright) {
			
			while(currentLeft<currentright && arr1[currentright]>=keyvalue) {
				currentright--;
			}
			while(currentLeft<currentright && arr1[currentLeft]<=keyvalue) {
				currentLeft++;
			}
			//System.out.println("currentLeft "+currentLeft+" currentrgiht "+currentright);
			if(currentLeft<currentright) {
				int tmp = arr1[currentright];
				arr1[currentright] = arr1[currentLeft];
				arr1[currentLeft] = tmp;
			}
			
		}
		arr1[left] = arr1[currentLeft];
		arr1[currentLeft] =keyvalue;
		
		quicksort(arr1,left,currentLeft-1);
		quicksort(arr1,currentLeft+1,right);
	}
}
