package day05;

import java.util.Scanner;

/*
 * ���ڱ����ķ���:
 * 1)�����������͵Ĳ�ͬ�������������ͣ�8�֣�& ������������
 * 2)����������λ�õĲ�ͬ ����Ա����  & �ֲ�����
 */
public class TestPerson {

	public static void main(String[] args) {

		//���ʵ����
		Person p1=new Person();
		p1.info();
		
		p1.name="����";
		p1.age=23;
		p1.sex=true;
		p1.info();
		
		p1.setName("����");
		System.out.println(p1.getName());
		p1.info();
		
		Person p2=p1;
		System.out.println("p1:"+p1);
		System.out.println("p2:"+p2);
		p2.info();
		
		p2=new Person();
		System.out.println("p2:"+p2);
		p2.info();
		
		//ʵ����Scanner��Ķ���ͨ���˶���.nextInt()���ã������Ӧ�Ĺ���
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		
		Person p3=new Person();
		p3.info();
		
		
	}
}

class Person{
	//����
	String name;
	int age=10;
	boolean sex;
	
	//����
	public void eat(){
		System.out.println("�˳Է�");
	}
	public void sleep(){
		System.out.println("��˯��");
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void info(){
		eat();
		sleep();
		System.out.println("name:"+name+" age:"+age+" sex:"+sex);
	}
	
	
	
}
