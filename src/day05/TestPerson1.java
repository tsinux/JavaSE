package day05;


/*
 * 
 */
public class TestPerson1 {

	public static void main(String[] args) {
		Person1 p=new Person1();
		p.study();
		p.showAge();
		p.addAge(2);
		p.showAge();
		
		Person1 p1=new Person1();
		p1.showAge();
	}
}

class Person1{
	//����
	String name;
	int age;
	int sex;
	
	//����
	public void study(){
		System.out.println("studying");
	}
	public void showAge(){
		System.out.println(age);
		//��ӡ����showAge()�����Ķ����age����
	}
	//�����ô˷����Ķ����age��������i�꣬�������µ�age
	public int addAge(int i){
		age+=i;
		return age;
	}
}