package day06;
/*
 * �����Ĳ�������
 * 1.�βΣ���������ʱ������С�����ڵĲ���
 * 	   ʵ�Σ����÷���ʱ��ʵ�ʴ���Ĳ�����ֵ
 * 2.����Java�еĲ������ݻ���:ֵ���ݻ���
 * 		1)�β��ǻ����������͵ģ���ʵ�ε�ֵ���ݸ��βεĻ����������͵ı���
 * 		2)�β��������������͵�:��ʵ�ε��������ͱ�����ֵ����Ӧ�Ķѿռ�Ķ���ʵ����׵�ֵַ�����ݸ��βε��������ͱ���
 * 
 * 
 * 
 */
public class TestArgsTransfer {

	public static void main(String[] args) {
		TestArgsTransfer tt=new TestArgsTransfer();
		
		int i=10;
		int j=5;
		System.out.println("i:"+i+"  j:"+j);
		
		//����������ֵ
//		int temp=i;
//		i=j;
//		j=temp;
//		System.out.println("i:"+i+"  j:"+j);
		
		tt.swap(i, j);
		System.out.println("i:"+i+"  j:"+j);
	}
	
	//����һ����������������������ֵ
	public void swap(int i,int j){
		int temp=i;
		i=j;
		j=temp;
		System.out.println("i:"+i+"  j:"+j);
	}
	
	
}
