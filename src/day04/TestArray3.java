
package day04;
/*
 * 1.������Ԫ�ص����ֵ����Сֵ��ƽ�������ܺ͵�
 * 2.����ĸ��ƣ���ת
 * 3.����Ԫ�ص�����
 */
public class TestArray3 {

	public static void main(String[] args) {
	
		int[] arr=new int[]{12,43,9,0,-65,-99,100,9};
		
		//���ֵ
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("��������ֵΪ��"+max);
		
		//��Сֵ
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("�������СֵΪ��"+min);
		
		//�ܺ�
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println("�ܺ�Ϊ��"+sum);
		
		//ƽ��ֵ
		int avg=0;
		avg=sum/arr.length;
		System.out.println("ƽ����Ϊ��"+avg);
		
		//����ĸ���
		
		/*
		int[] array1,array2;
		array1=new int[]{2,3,5,7,11,13,17,19};
		
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+"\t");
		}
		
		System.out.println();
		
		array2=array1;        //������ô���ƣ�����Ӱ��array1
		
		//for(int i=0;i<array2.length;i++){
		//	System.out.print(array2[i]+"\t");
		//}
		for(int i=0;i<array2.length;i++){
			if(i%2==0){
				array2[i]=i;
			}
		}
		
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+"\t");
		}
		
		
		//��ȷ��������
		int[] array1,array2;
		array1=new int[]{2,3,5,7,11,13,17,19};
		
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+"\t");
		}
		
		System.out.println();
		
		array2=new int[array1.length];
		//��array2��ֵ
		for(int i=0;i<array2.length;i++){
			if(i%2==0){
				array2[i]=i;
			}else{
				array2[i]=array1[i];
			}
			
		}
		
		System.out.println("array2��");
		for(int i=0;i<array2.length;i++){
			System.out.print(array2[i]+"\t");
		}
		
		System.out.println();
		
		System.out.println("array1��");
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+"\t");
		}
		*/
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=arr[i];
		}
		
		//����
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		
		
		//����Ԫ�صķ�ת
		/*for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		*/
		for(int x=0,y=arr.length-1;x<y;x++,y--){
			int temp=arr[x];
			arr[x]=arr[y];
			arr[y]=temp;
		}
		
		System.out.println();
		System.out.println("��ת֮��Ľ����");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		
		
		//ʹ��ð������ʹ����Ԫ�ش�С��������
		/*
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		*/
		
		
		//ʹ��ֱ��ѡ������ʹ����Ԫ�ش�С��������
		/*
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		*/
		for(int i=0;i<arr.length-1;i++){
			int t=i;
			for(int j=i;j<arr.length;j++){
				if(arr[t]>arr[j]){
					t=j;
				}
			}
			if(t !=i){
				int temp=arr[t];
				arr[t]=arr[i];
				arr[i]=temp;
			}
		}
		
		
		
		
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
