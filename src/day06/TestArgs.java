package day06;
/*
 * �ɱ�������βεķ���
 * 1.��ʽ�����ڷ������βΣ���������...�β���
 * 2.�ɱ�������βεķ�����ͬ���ķ���֮�乹������
 * 3.�ɱ�������β��ڵ���ʱ��������0��ʼ����������������
 * 4.ʹ�ÿɱ����βεķ����뷽�����β�ʹ��������һ�µ�
 * 5.�������д��ڿɱ�������βΣ���ôһ��Ҫ�����ڷ����βε����
 * 6.��һ�������У��������һ���ɱ�������β�
 */
public class TestArgs {

	public static void main(String[] args) {
		TestArgs t=new TestArgs();
		t.sayHello();
		//t.sayHello(new String[]{"hello china","hello beijing"});
		t.sayHello("hello china","hello beijing");
	}
	//����4��������������
	public void sayHello(){
		System.out.println("hello world!");
	}
	
	public void sayHello(String str1){
		System.out.println("hello "+str1);
	}
	
	//�ɱ�������βεķ���
	public void sayHello(String ... args){
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]+"$");
		}
	}
	
	public void sayHello(int i,String ... args){
		System.out.println(i);
		
		for(int j=0;j<args.length;j++){
			System.out.println(args[j]+"$");
		}
	}
	
	public void sayHello1(String[] args){
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}
	
	//�ɱ�����βε�ʹ�õ�����
	public int getSum(int i,int j){
		return i+j;
	}
	public int getSum(int i,int j,int k){
		return i+j+k;
	}
	
	public int getSum(int ... args){
		int sum=0;
		for(int i=0;i<args.length;i++){
			sum+=args[i];
		}
		return sum;
	}
	
	
	
	
}

