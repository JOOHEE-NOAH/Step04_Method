package inputex;
/* eno:101 ename:�Ƿη� dept:A score:85.9 �� �����Ͽ� ����ϼ���
 * printf()�� �̿��ϼ���
 * 
 * -----
 * �����ȣ : 101
 * ����̸� : �Ƿη�
 * �μ��ڵ� : A
 * �Ի缺�� : 85.9
 * 
 */
public class InputTest5 {

	public static void main(String[] args) {
		int eno=101;
		String ename="�Ƿη�";
		char dept='A';
		double score=85.9;
		
		System.out.printf("�����ȣ : %d\n", eno);
		System.out.printf("����̸� : %s\n", ename);
		System.out.printf("�μ��ڵ� : %c\n", dept);
		System.out.printf("�Ի缺�� : %.1f\n", score);

	}

}
