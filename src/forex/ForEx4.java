package forex;
//1~100 ������ 7�� ����� ����ϼ��� (continue ���)
//7 14 21....98
public class ForEx4 {

	public static void main(String[] args) {
		//7�� ����� �������� 0�ΰ��� ���
		
		//continue, break

		for(int i=1; i<=100;i++) { //for�� ���ߴ� ������ �����ؾ���.
			if(i%7!=0) { 
			
			continue; //  if�� �ƴѰ� ��Ƽ���� ���.
			
			}
			System.out.print(i+" ");
			
		}
		
//	--------------------�� ���------------------------	
//		for(int i=1; i<=100;i++) { //for�� ���ߴ� ������ �����ؾ���.
//					if(i%7<=6) { 
//					
//					continue; //  1 2 3 4 6 7 8 9 10������ �ټ���° ���� ������ ������ ó������ ���ư���.
//					
//					}
//					System.out.print(i+" ");
					
				}
					
				
	}

	
	