package com.itman;
//������ϵ������
public class Arry {
	public static void main(String[] args) {
		int[] arr = new int[] {25,35,46,22,68,55};
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		//����Ԫ�ظ�ֵ
//		arr[0] = 100;
//		arr[1] = 260;
//		arr[2] = 900;
//		
//		System.out.println("-----------");
//		System.out.println(arr);
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		//ȡ��ֵ
		int max=arr[0];
		for(int i=1;i<arr.length;++i)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("max="+max);
		//������ͷ���		
		int sum=getSum(arr);
		System.out.println("sum="+sum);
	}
	//������Ԫ�غ͵ķ���
	public static int getSum(int [] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;++i)
		{
			sum+=arr[i];
		}
		return sum;
	}
}
