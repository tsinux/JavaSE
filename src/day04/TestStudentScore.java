/*
 * �Ӽ�������ѧ���ɼ����ҵ���߷֣������ѧ���ɼ��ȼ�
 * �ɼ�>=��߷�-10  �ȼ�ΪA
 * �ɼ�>=��߷�-20  �ȼ�ΪB
 * �ɼ�>=��߷�-30  �ȼ�ΪC
 * ����                                 �ȼ�ΪD
 * 
 * ��ʾ���ȶ���ѧ��������������������int���飬���ѧ���ɼ�
 */
package day04;

import java.util.Scanner;

public class TestStudentScore {

	public static void main(String[] args) {
		//1.����Scanner���󣬲��Ӽ��̻�ȡѧ���ĸ���n
		Scanner s=new Scanner(System.in);
		System.out.println("������ѧ���ĸ�����");
		int count=s.nextInt();
		
		//2.���������ѧ���ĸ���n������һ������Ϊn��int�͵�����
		int[] scores=new int[count];
		int maxScore=0;
		
		//3.���δӼ��̻�ȡn��ѧ���ĳɼ�����������Ӧ������Ԫ�أ�����ȡn��ѧ���е���߷�
		System.out.println("������"+count+"���ɼ�");
		for(int i=0;i<scores.length;i++){
			int score=s.nextInt();
			scores[i]=score;
			if(scores[i]>maxScore){
				maxScore=scores[i];
			}
		}
		
		//4.����ѧ���ɼ������飬������ѧ���ɼ�����߷ֵĲ�ֵ��������Ӧ�ĵȼ������
		System.out.println("��߷�Ϊ��"+maxScore);
		for(int i=0;i<scores.length;i++){
			char level;
			if(scores[i]>=maxScore-10){
				level='A';
			}else if(scores[i]>=maxScore-20){
				level='B';
			}else if(scores[i]>=maxScore-30){
				level='C';
			}else{
				level='D';
			}
			
			System.out.println("student "+i+
					" score is "+scores[i]+
					" grade is "+level);
		}
		
		
	}
}


