package methodex;
//�Լ� :������ ��Ÿ��.
//�Լ�, function, procedure, method(��ü���⿡�� �Լ��� ǥ���Ҷ� �޼ҵ��� ��. �ڹٿ����� �Լ��� �޼ҵ��� ��.)
// call by name
public class MethodEx1 {

		public static void view() {// �Լ� ����, �ݵ�� Ŭ���� ��, �Լ��ܺο��� �����ؾ���.
		System.out.println("hello");
//		return; // ��� �̵�, ���� ����
	}
	
		public static void star() { // �Լ�����
			System.out.println("******");
		}
		
		
	public static void main(String[] args) {
			System.out.println();
			view(); //�Լ� ȣ��/ �Լ� ȣ���� �Լ� ���ο��� �ٸ� �Լ��� ȣ���Ѵ�.
			star();
			view();
			star();
	
	}

}
