package methodex;
//call by value : ���� ���� ȣ�� -->�Ű� ������ �ִ� ���
public class MethodEx3 {

	public static void show1(int a, char b, double c, float d) {
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	public static int show2(int k, int e, int m) {
		return k+e+m;
	}
	
	public static double show3(int k, int e, int m) {
		return (k+e+m)/3.0; // �̰��� ������
	}
	
	public static String show4(int k, int e, int m) { //return�� ���ڿ��� �����Ƿ� String ���
		double avg=(k+e+m)/3.0;
		if(avg>=60)
			 return "�հ�"; //return�� ����� �ݵ�� �ϳ��� �Ǿ�� �Ѵ�. �� �ƴϸ� ���հ��̶� ����.
		else
			return "���հ�"; 
	}
	
	public static void main(String[] args) { //()���� ���� �Ű����������
		
		System.out.println(show4(95, 85, 73));
		
		System.out.printf("��� : %.2f\n", show3(95, 85, 73));
		
		
		int sum=show2(95, 85, 73); 
		System.out.println("�հ� : "+sum);
		//�Ǵ�
		System.out.println("�հ� : "+show2(95, 85, 73));
		
		
		
		show1(10,'A', 10.5, 100.3f);
		
		
		
		
		
		
		
		
		
	}

}
