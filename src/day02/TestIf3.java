package day02;

import java.util.Scanner;

public class TestIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("�������һ������");
		int num1=s.nextInt();
		System.out.println("������ڶ�������");
		int num2=s.nextInt();
		System.out.println("���������������");
		int num3=s.nextInt();
		
		System.out.println("��С���������Ϊ��");
		if(num1>num2){
			if(num3>num1){
				System.out.println(num2+","+num1+","+num3);
			}else if(num3<num2){
				System.out.println(num3+","+num2+","+num1);
			}else{
				System.out.println(num2+","+num3+","+num1);
			}
		}else{
			if(num3>num2){
				System.out.println(num1+","+num2+","+num3);
			}else if(num3<num1){
				System.out.println(num3+","+num1+","+num2);
			}else{
				System.out.println(num1+","+num3+","+num2);
			}
		}
		
		
	}

}
