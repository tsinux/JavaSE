package day06;
/*
 * ������������һ����װ������
 * ���⣺��������Ķ����Ժ����ֱ��ͨ��������.���ԡ��ķ�ʽ����Ӧ�Ķ������Ը�ֵ�Ļ���
 * 	   ���ܻ���ֲ�����ʵ����������⣬���ǿ��ǲ��ö�����ֱ���������ԣ�
 *   ����ͨ��������.����������ʽ�������ƶ�������Եķ��ʣ�
 *   ʵ������У������Ե�Ҫ��Ϳ���ͨ������������
 *   
 *����ķ���������װ�Ե�˼�룩
 *1.���������˽�л���
 *2.�ṩ�����ķ�����setter & getter����ʵ�ֵ���
 */

/*
 * Ȩ�����η�  public private protected ȱʡ
 *     ���������������ԣ�����
 *    ע�⣺(1)Ȩ�޴Ӵ�С���У�public protected ȱʡ private
 *    	  (2)�������Ȩ���У� public ȱʡ
 *    
 */
public class TestAnimal {

	public static void main(String[] args) {
		Animal a1=new Animal();
//		a1.name="����";
//		a1.legs=4;
		a1.setLegs(4);
		a1.setName("����");
		
		a1.info();
		a1.eat();
		
//		a1.getLegs();
//		a1.getName();
		System.out.println(a1.getLegs());
		System.out.println(a1.getName());
	}
	
}

class Animal{
	
//	String name; //���������
//	int legs;  //�ȵ�����
	
	//private���ε����ԣ�ֻ���ڱ����б����ã����˴��࣬�Ͳ��ܱ�������
	private String name; //���������
	private int legs;  //�ȵ�����
	String color;
	
	public void eat(){
		System.out.println("�����ʳ");
	}
	
	public void sleep(){
		System.out.println("����˯��");
	}
	
	public void info(){
		System.out.println("name:"+name+"  legs:"+legs);
	}
	
	//�����������
	public void setLegs(int l){
		if(l>0 && l%2==0){
			legs=l;
		}else{
			System.out.println("���������������");
		}
	}
	
	//��ȡ�������
	public int getLegs(){
		return legs;
	}
	
//	public int doLegs(int l){
//		legs=l;
//		return legs;
//	}
//	
	public void setName(String n){
		name=n;
	}
	
	public String getName(){
		return name;
	}
	
}