package methodex;
//call by name : �̸��� ���� ȣ��
public class MethodEx2 {
	
	public static int view1() { //int �ǹ�: ���� �� ���� �ڷ���
		return 10; //�ݵ�� ������ �ؾ��Ѵ�.
	}
	public static char view2() { 
		return 'A';
	}	
	public static float view3() { 
			return 50.3f;
	}
	public static double view4() { 
		return 100.4;
}
	public static String view5() { 
		return "hello";
	}
	public static boolean view6() { 
			return true;
	}	

	
	
	public static void main(String[] args) {
		
		int a=view1(); System.out.println(a); // ����� �ؾ����� ����� �� ����
		char b=view2(); System.out.println(b);
		float c=view3(); System.out.println(c);
		System.out.println(view3()); // �̷��Ե� ǥ������
		System.out.println(view4());
		System.out.println(view5());
		System.out.println(view6());
	}
	


}
