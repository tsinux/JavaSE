package day06;

/*
 * ��ĵ�������Ա����������constructor ���췽����
 * �����������ã�
 * 1.��������
 * 2.�������Ķ�������Ը�ֵ
 * 
 * ע��
 * 1.������ʱ��������ʽ������Ĺ������Ļ��������Ĭ���ṩһ���ղεĹ�����
 * 2.һ����ʽ�Ķ�����Ĺ���������ôĬ�ϵĹ������Ͳ����ṩ
 * 3.���������Ĺ���������ʽ�� Ȩ�����η�   ����(�β�){}
 * 4.��Ķ��������֮�乹������
 */
/*
 * ���������Ը�ֵ���Ⱥ�˳��
 * 1.���Ե�Ĭ�ϳ�ʼ��
 * 2.���Ե���ʽ��ʼ��
 * 3.ͨ�������������Գ�ʼ��
 * 4.ͨ��"����.����"�ķ�ʽ�����Ը�ֵ
 * 
 */

public class TestPerson1 {
	public static void main(String[] args) {
		Person1 p1=new Person1();
		String str=new String("tsinux.com");
		System.out.println(str);
		
		Person1 p2=new Person1("����");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		Person1 p3=new Person1("����",23);
		System.out.println("name:"+p3.getName()+"  age:"+p3.getAge());
		
		//������Ը�ֵ�Ĺ���
		Person1 p4=new Person1();
		System.out.println("name:"+p4.getName()+"  age:"+p4.getAge());
		
		Person1 p5=new Person1(12);
		System.out.println("name:"+p5.getName()+"  age:"+p5.getAge());
	}
}

class Person1{
	//����
	private String name;
	private int age=1;
	
	//������   ��������
	public Person1(){
		
	}
	public Person1(String n){
		name=n;
	}
	
	public Person1(int a){
		age=a;
	}
	
	public Person1(String n,int a){
		name=n;
		age=a;
	}
	
	//����
	public void setName(String n){
		name = n;
	}
	
	public void setAge(int a){
		age=a;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	
}