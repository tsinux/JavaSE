package day05;

/*
 * ������ԣ���Ա������
 * ��Ա���� VS �ֲ�����
 * ��ͬ�㣺
 * 1.����λ�ò�ͬ��
 * 		��Ա���������������������
 * 		�ֲ������������ڷ�����������ββ���
 * 2.��Ա���������η����ĸ���public��private��protected��ȱʡ
 * 	 �ֲ�����û�����η�
 * 3.��ʼ��ֵ��һ�����г�ʼ��ֵ
 * 	��Ա�����������������ʱ�򣬲���ʽ�ĸ�ֵ����ô��ͬ�������ͻ��в�ͬ��Ĭ�ϳ�ʼ��ֵ
 * 		byte short int long  ==>0
 * 		float  double ==>0.0
 * 		char  ==>�ո�
 * 		boolean  ==>false
 *  	�������ͱ���  ==>null
 * 	�ֲ�������һ��Ҫ��ʽ�ĸ�ֵ���ֲ�����û��Ĭ�ϳ�ʼ��ֵ
 * 4.�������ڴ��д�ŵ�λ�ò�ͬ
 * 		��Ա���������ڶѿռ���
 * 		�ֲ�����������ջ�ռ���
 * 		
 */

/*
 * ��ķ������ṩĳ�ֹ��ܵ�ʵ��
 * 1)ʵ����public void eat(){}
 * 		 public String getName(){}
 * 		 public void setName(String n){}
 * 	��ʽ��Ȩ�����η�  ����ֵ����(void �޷���ֵ/����ķ���ֵ) ������(�β�){}
 * 
 * 2)���ڷ���ֵ���ͣ�
 * 		void�����˷�������Ҫ����ֵ
 * 		�з���ֵ�ķ������ڷ��������һ����return + ����ֵ���Ͷ�Ӧ�ı���
 * 	void ��return����ͬʱ������һ��������
 * 
 * 
 * 3)�����ڿ��Ե��ñ�����������������ԣ����ǲ����ڷ������ٶ��巽��
 * 	 
 * 
 * 
 */
public class Zoo {

	public static void main(String[] args) {
		//���ʵ����
		Animal a1=new Animal();
		
		a1.name="����";
		a1.age=10;
		System.out.println("name:"+a1.name+" age:"+a1.age);
		a1.eat();
		a1.sleep();
		System.out.println(a1.desc());
		
		System.out.println(a1.getName());
		a1.setName("����");
		System.out.println(a1.getName());
		
		Animal a2=new Animal();
		System.out.println("name:"+a2.name+" age:"+a2.age);
		a2.eat();
		a2.name="����";
		System.out.println("name:"+a1.name+" age:"+a1.age);
		System.out.println("name:"+a2.name+" age:"+a2.age);
		
		//a3��a1����һ������ʵ��
		Animal a3=a1;
		System.out.println("name:"+a3.name+" age:"+a3.age);
		a3.name="ά����";
		System.out.println("name:"+a1.name+" age:"+a1.age);
		System.out.println("name:"+a3.name+" age:"+a3.age);
		
		System.out.println(a3.getName());
		
	}
}

class Animal{
	//����
	String name;
	int age;
	
	//����
	public void eat(){
		System.out.println("�����ʳ");
	}
	public void sleep(){
		System.out.println("��������");
	}
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	public String desc(){
		if(age>18){
			return "ǡͬѧ����";
		}else{
			return "���ǿ�����Ƭ������";
		}
	}
	public void setName(String n){
		name=n;
	}
	
	//i �ֲ�����
	public void addAge(){
		int i=2;
		age+=i;
	}
	
	public void info(){
		eat();
		sleep();
	}
	
}