package day06;

/*
 * ���������
 * 
 */
class Circle{
	double radius;
	
	public double findArea(){
		return Math.PI * radius *radius;
	}
	
	public void setRadius(double r){
		radius=r;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void show(){
		System.out.println("����һ��Բ");
	}
}

public class PassObject {

	public void printAreas(Circle c,int time){
		System.out.println("Radius"+"\t\t"+"Area");
//		int temp=0;
//		for(int i=1;i<=time;i++,temp=i){
//			c.setRadius(i);
//			System.out.println(c.getRadius()+"\t\t"+c.findArea());
//		}
//		c.setRadius(temp);
		int i=1;
		while(i<=time){
			c.setRadius(i);
			System.out.println(c.getRadius()+"\t\t"+c.findArea());
			i++;
		}
		c.setRadius(i);
	}
	
	public static void main(String[] args) {
		PassObject p=new PassObject();
		Circle c=new Circle();//��ʱC�İ뾶Ϊ0
		p.printAreas(c, 5);
		
		System.out.println("now radius is "+c.getRadius());
		
		System.out.println();
		
		p.printAreas(new Circle(), 6);
		//System.out.println("now radius is "+c.getRadius());
		
		new Circle().show();
		
		new Circle().setRadius(2.3);
		
		
		
		
	}
}
