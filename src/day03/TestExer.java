//����һ���Ӽ��̶������Ϊ10�������������ж϶���������͸����ĸ���
//��������Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ���������Ϊ0ʱ��������
package day03;

import java.util.Scanner;

public class TestExer {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a=0;//��¼�����ĸ���
		int b=0;//��¼�����ĸ���
		/* ����һ
		for(int i=0;i<10;i++){
			System.out.println("�������"+(i+1)+"������");
			int num=s.nextInt();
			if(num>0){
				a++;
			}else if(num<0){
				b++;
			}
		}
		*/
		
		//����ѭ��for(;;){}
		for(;;){
			System.out.println("������һ������");
			int num= s.nextInt();
			if(num>0){
				a++;
			}else if(num<0){
				b++;
			}else{
				break;
			}
		}
		System.out.println("�����ĸ���Ϊ��"+a);
		System.out.println("�����ĸ���Ϊ��"+b);
		
		
		
	}

}
