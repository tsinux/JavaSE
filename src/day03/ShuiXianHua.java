//������е�ˮ�ɻ�������νˮ�ɻ�����ָһ��3λ�����ڸ���λ�����������͵����䱾��
//���� �� 153=1*1*1 + 3*3*3 + 5*5*5
package day03;

public class ShuiXianHua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=100;i<1000;i++){
			int j1=i/100;//��λ
			int j2=(i-j1*100)/10;//ʮλ
			int j3=i%10;//��λ
			
			if(i==j1*j1*j1 + j2*j2*j2 + j3*j3*j3){
				System.out.println(i);
			}
		}
	}

}
