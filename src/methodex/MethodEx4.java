package methodex;

public class MethodEx4 {
	public static int total(int k, int e, int m) {
		return k+e+m;
	}
	public static double avg(int total) {
		return total/3.0;
	}
	
	public static char grade(double avg) {
			char ck;
			switch ( (int)(avg/10)) { //avg�� ���ڶ� char�� ��� �Ұ� �׷��� int�� ����ȯ ���ֱ� 
			case 10:
			case 9:  ck= 'A'; 
					 break;    //�������� return�̶� break �߰��� ���� ��.
			case 8:  ck='B'; 
					break;
			case 7:  ck='C'; 
					break;
			case 6:  ck='D'; 
					break;
			default: ck='F';
			}	return ck;
			
			
//			switch ( (int)(avg/10)) {
//			case 10:
//			case 9: return  'A'; 
//					 
//			case 8: return 'B'; 
//					 
//			case 7: return 'C'; 
//					 
//			case 6: return 'D';
//					 
//			default: return 'F';	// �߰� �߰� return�� �־ break�ϸ�  ������. �ٽ� ���ư����ϴµ� �극��ũ �ع����ϱ�.
			
		}
		public static String result(char grade) {
			String rs=null;
			
			if (grade=='F') {
				 rs="���հ�";
			}
			else  rs="�հ�";
				
			return rs;
			}
			
		
		
		public static void main(String[] args) {
		int k=95, e=85, m=73;
		System.out.println("����: "+total(k,e,m)+"��");
		System.out.printf("����: %.2f\n",avg(total(k,e,m))); //avg(253)�� ����
		System.out.println("����: "+grade(avg(total(k,e,m))));
		System.out.println("���: "+result(grade(avg(total(k,e,m)))));
	
		
		
		//����: switch�� �̿��Ͽ� ��� ���ϱ�
		//90�̻� A 80�̻�B 70�̻� C 60�̻� D ������ F
		
		// ���: if~else�� �̿��Ͽ� 'F'�� ��� "���հ�", �������� �հ�
//		---
//		���� : 253��
//		��� : 84.33
//		���� : B
//		��� : �հ�
//		
		
		
		
		
		
		
		}
		private static String result(String grade) {
			return null;
		}
		
		
		}
	


