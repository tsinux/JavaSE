/*
 *break:ʹ����switch-case�л���ѭ����
 *		���ʹ����ѭ���У���ʾ������ǰѭ��
 *
 *continue:ʹ����ѭ���ṹ��
 *			��ʾΪ��������ѭ��
 *
 *��break��continue֮�������������䣬���ܱ�ִ��
 */

package day03;

public class TestBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=10;i++){
			if(i%4==0){
				//break;
				continue;
			}
			System.out.println(i);
		}
		
		//��ǩlabel
		label:for(int i=1;i<5;i++){
			for(int j=1;j<=10;j++){
				if(j%4==0){
					//break;
					//continue;
					
					//break label;
					continue label;
					
				}
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
