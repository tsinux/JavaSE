package day02;

public class TestExer1 {

	public static void main(String[] args) {
		int m=12;
		int n=5;
		System.out.println("m:"+m+"n:"+n);
		
		/**
		//����һ���ṩһ����ʱ����
		int temp=m;
		m=n;
		n=temp;
		System.out.println("m:"+m+"n:"+n);
		*/
		
		/**
		//����������m��n�ϴ�ʱ���п��ܳ��־�����ʧ
		m=m+n;
		n=m-n;
		m=m-n;
		System.out.println("m:"+m+"n:"+n);
		*/
		
		//������:λ�����
		m=m^n;
		n=m^n;//(m^n)^n==m
		m=m^n;//(m^n)^m==n
		System.out.println("m:"+m+"n:"+n);
		
		
		
	}
	

}
