
package day04;

public class TestArray2 {

	public static void main(String[] args) {
		
		int[] scores1=new int[10];
		int[][] scores2;
		String[][] names;
		
		//��̬��ʼ��
		scores2=new int[][]{{1,2,3},{4,5,6},{11}};
		//��̬��ʼ��
		names=new String[6][5];
		names=new String[6][];
		names[0]=new String[5];
		
		//���þ����Ԫ��
		int[][] i=new int[3][2];
		i[1][0]=90;
		i[2][1]=100;
		
		//����ĳ���  length
		System.out.println(i.length);     //��
		System.out.println(i[0].length);  //��
		
		System.out.println(names.length);
		System.out.println(names[0].length);
		
		//������ά����
		for(int m=0;m<scores2.length;m++){
			for(int n=0;n<scores2[m].length;n++){
				System.out.print(scores2[m][n]+"  ");
			}
			System.out.println();
		}
		
		int[] x,y[];
		//int[] x;//һά
		//int[] y[];//��ά
		y=new int[3][2];
		x=y[0];
		x[0]=y[1][2];
		
		
		
		
	}

}
