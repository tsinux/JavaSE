package day02;

public class TestSwitch3 {

	public static void main(String[] args) {

		int score=27;
		int i=score/10;
		switch(i){
			case 10:
			case 9:
			case 8:
			case 7:
			case 6:
				System.out.println("����");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("������");
				break;
			default:
				System.out.println("��������");
				break;
		}
		
	}

}
