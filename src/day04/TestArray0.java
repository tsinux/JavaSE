package day04;

public class TestArray0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=12;
		boolean b=true;
		
		//��������
		String[] names;
		int[] scores;
		
		//��̬��ʼ��
		names=new String[]{"����","����","����"};
		
		//��̬��ʼ��
		scores=new int[4];
		
		//������Ӧ������Ԫ��
		scores[0] = 87;
		scores[1] = 89;
		scores[3] = 98;
		
		//����ĳ���  length
		System.out.println(names.length);
		System.out.println(scores.length);
		
		//��������Ԫ��
		System.out.println(names[0]);
		
		for(int j=0;j<names.length;j++){
			System.out.println(names[j]);
		}
		
		
	}

}
