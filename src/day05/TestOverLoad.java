package day05;
/*
 * ����������OverLoad
 * Ҫ��
 * 1.ͬһ������
 * 2.������������ͬ
 * 3.�����Ĳ����б�ͬ(�����ĸ�����ͬ�����������Ͳ�ͬ)
 * 
 * ���䣺���������غͷ����ķ���ֵ����û�й�ϵ
 */
public class TestOverLoad {

}

class OverLoad{
	//��������int�ͱ����ĺ�
	public int getSum(int i,int j){
		return i+j;
	}
	
	//��������int�ͱ����ĺ�
	public int getSum(int i,int j,int k){
		return i+j+k;
	}
	
	//��������double�����ݵĺ�
	public double getSum(double d1,double d2){
		return d1+d2;
	}
	
	//��������double�����ݵĺ�
	public void getSum(double d1,double d2,double d3){
		System.out.println(d1+d2+d3);
	}
	

	
	
}