package forex;

public class ForEx1 {

	public static void main(String[] args) {
		
		//100 97 94 ... 82
		
		
		for(int i=100; i>=80;i-=3) { //  i���� 3�� �����Ѵٴ� �ǹ�
			System.out.print(i+" ");	
			}
		
		for(char i='A'; i<='Z'; i++) {
			System.out.println(i+" ");
		}
		
//		�����
//		for(int i=100; i>=82;i--) {  
//			
//		System.out.print(i+" ");	
//			i=i-2;
//		}
		
		
		
//		for(char i='a'; i<='z'; i++) {
//			System.out.print(i+" ");
//		}
//		
		
		
//		----------------1-----------------------------
//		int sum=0, odd=0, even=0; //�ݵ�� �ʱ�ȭ ���־���� 
//		
//		for(int i=1; i<=100;i++) {   //�ʱⰪ�� ����    -->1���� 100����
//		
//			sum+=i; // sum=sum+i;
//			//¦����, Ȧ������ ����Ͽ� ����ϼ���
//			switch(i%2) {
//			case 1: odd+=i; break;
//			case 0: even+=i; break;
//			}
//			
//		}
//		
//		System.out.println("1-100 ������ �� : "+sum);
//		System.out.println("1-100 ������ Ȧ���� : "+odd);
//		System.out.println("1-100 ������ ¦���� : "+even);
//		
		
		
		
		//�� (Ʋ��)���
//for(int i=1; i<=100;i++) { 
//			
//			i++;
//			odd+=i;
//			
//		}
//        for(int i=2; i<=100;i++) { 
//			
//			i++;
//			even+=i;
//			
//		}
		
		
	}

}
