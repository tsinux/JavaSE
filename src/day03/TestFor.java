package day03;

public class TestFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		
		System.out.println();
		
		for(int i=0;i<4;i++){
			System.out.println("HelloWorld");
		}
		
		int j=1;
		for(System.out.println('a');j<4;System.out.println('b'),j++){
			System.out.println('c');
		}
		
		//���100���ڵ�����ż��
		//����ż���ĺ�
		//ż���ĸ���
		int sum=0;
		int count=0;
		for(int k=0;k<=100;k++){
			if(k%2==0){
				System.out.println(k);
				sum=sum+k;
				count++;
			}
		}
		System.out.println("�ܺ�Ϊ��"+sum);
		System.out.println("100����ż���ĸ���Ϊ��"+count);
	}

}
