package inputex;


/* argument�� �̿��Ͽ� �Է��� �޾Ƽ� ������ּ���
 * $ java InputTest7 101 �Ƿη� A 85.9
 * 
 * �����ȣ : 101     
 * ����̸� : �Ƿη�
 * �μ��ڵ� : A
 * �Ի缺�� : 85.90  
 * 
 * ---printf()�� �ѹ��� ����Ͽ� ������ּ���
 * 
 */
public class InputTest7 {

	public static void main(String[] args)  {
		
		int eno=Integer.parseInt(args[0]);
		String ename=args[1];
		char dept=args[2].charAt(0);
		double score=Double.parseDouble(args[3]);
		
		
		System.out.printf("�����ȣ : %d\n����̸� : %s\n�μ��ڵ� : %c\n�Ի缺�� : %.2f", eno, ename, dept, score);
		
		
		
		
//		int a=Integer.parseInt(args[0]);
//		int b=Integer.parseInt(args[1]);
//		int c=Integer.parseInt(args[2]);
//		
//		System.out.println("�� ���� �� :"+(a+b+c));
		
		
//		System.out.printf("�μ� : %s\n���� : %.1f��", dept, score);
		
//		System.out.printf("�����ȣ : %d\n", eno);
//		System.out.printf("����̸� : %s\n", ename);
//		System.out.printf("�μ��ڵ� : %c\n", dept);
//		System.out.printf("�Ի缺�� : %.1f\n", score);

	}

}
