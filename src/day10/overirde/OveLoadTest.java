package day10.overirde;
/*��ϰһ
 * �����������ط��������ã�������ΪmOL
 * 1 ���������ֱ����һ��int�Ͳ���������int�Ͳ����� һ���ַ�������
 * 2 ���������ֱ�ִ�м���ƽ��������˻�������ַ�����Ϣ
 * 3 ����main�����зֱ��ò���������������
 * 
 * ��ϰ����
 * 	�����������ط���max�� ��һ�������ֱ�������int�͵����ֵ���ڶ�����2��double�͵����ֵ����������3��double�͵����ֵ
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
