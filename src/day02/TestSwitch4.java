package day02;

import java.util.Scanner;

//�Ӽ���������2014���month��day��Ҫ��ͨ������������������Ϊ2014��ĵڼ���
public class TestSwitch4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("�������·�;");
		int month = s.nextInt();
		System.out.println("���������ڣ�");
		int day = s.nextInt();
		
		int sum= 0;
		switch(month){
			case 12:sum=sum+30;
			case 11:sum=sum+31;
			case 10:sum=sum+30;
			case 9:sum=sum+31;
			case 8:sum=sum+31;
			case 7:sum=sum+30;
			case 6:sum=sum+31;
			case 5:sum=sum+30;
			case 4:sum=sum+31;
			case 3:sum=sum+28;
			case 2:sum=sum+31;
			case 1:sum=sum+day;
			
		}
		
		
		
		System.out.println(sum);
	}

}
