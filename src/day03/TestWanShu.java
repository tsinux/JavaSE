/*
 *һ�������ǡ�õ�����������֮�ͣ��������Ϊ��������
 *����  6=1+2+3
 *�ҳ�1000���ڵ���������
 */

package day03;

public class TestWanShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int factor=0;
		
		for(int i=1;i<=1000;i++){
			for(int j=1;j<i;j++){
				if(i%j==0){
					factor=factor+j;
				}
			}
			if(i==factor){
				System.out.println(i);
			}
			
			//��ʼ��
			factor=0;
		}
		
	
	}

}
