/*
 * 100���ڵ���������
 */

package day03;

public class TestPrimeNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��ȡϵͳ��ǰ���еĺ�����
		long start = System.currentTimeMillis();
		
		//boolean flag=false;
		
		label:for(int i=2;i<=100000;i++){
			//for(int j=2;j<i;j++){
			//�ĳ�ƽ����
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					//flag=true;
					//ע���߼����Ӹ�break����ʡ����ʱ��
					//break;
					continue label;
				}
			}
			System.out.println(i+"  ������");
			/*
				if(flag==false){
					System.out.println(i+"  ������");
				}
				//ע������flag��ֵ
				flag=false;
			*/
		}
		
		//�ٴλ�ȡϵͳ��ǰ���еĺ�����
		long end=System.currentTimeMillis();
		System.out.println("���л��ѵ�ʱ��Ϊ��"+(end-start));
	}

}
