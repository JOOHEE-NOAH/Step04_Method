package inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* bufferedreader�� �̿��Ͽ� ���� �Է� �޾Ƽ� ����ϼ���
 * �����ȣ �Է� : 101
 * ����̸� �Է� : �Ƿη�
 * �μ��ڵ� : A
 * �Ի缺�� : 85.9
 * 
 * -----
 * �����ȣ : 101     <---println()
 * ����̸� : �Ƿη�
 * �μ��ڵ� : A
 * �Ի缺�� : 85.90  <---printf()
 * 
 */
public class InputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int eno;
		String ename;
		char dept;
		double score;
		
		System.out.print("�����ȣ �Է� : "); eno=Integer.parseInt(br.readLine());
		System.out.print("����̸� �Է� : "); ename=br.readLine();
		System.out.print("�μ��ڵ� �Է� : "); dept=br.readLine().charAt(0);
		System.out.print("�Ի缺�� �Է� : "); score=Double.parseDouble(br.readLine());
		System.out.println("-----");
		System.out.println("�����ȣ : "+eno);
		System.out.println("����̸� : "+ename);
		System.out.println("�μ��ڵ� : "+dept);
		System.out.printf("�Ի缺�� : %.2f\n", score);

	}

}
