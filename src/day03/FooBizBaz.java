//��д����FooBizBaz.java,��1ѭ����150����ÿһ�д�ӡһ��ֵ
//����ÿ��3�ı������ϴ�ӡ����foo������ÿ��5�ı������ϴ�ӡ��biz������ÿ��7�ı������ϴ�ӡ��baz��
package day03;

public class FooBizBaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=150;i++){
			System.out.print(i+" ");
			
			if(i%3==0){
				System.out.print("foo  ");
			}
			
			if(i%5==0){
				System.out.print("biz  ");
			}
			
			if(i%7==0){
				System.out.print("baz  ");
			}
			System.out.println();
		}
	}

}
