package day02;

import java.util.Scanner;

public class TestIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("������С������ĩ�ɼ���");
		int score =s.nextInt();
		if(score>100 || score <0){
			System.out.println("�����������");
		}else{
			if(score == 100){
				System.out.println("����һ��BMW");
			}else if(score >80 && score<=99){
				System.out.println("����һ̨IPHONE");
			}else if(score >60 && score<=80){
				System.out.println("����һ����");
			}else{
				System.out.println("ʲô��û��");
			}
		}
		
	}

}
