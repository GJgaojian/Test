package xuan.ze.gao;

import java.util.Random;

public class Xz {

	/**
	 * http://www.cnblogs.com/liuling/p/2013-7-24-01.html
	 * ������֪ʶ��
	 * 1��ѡ������
	 * 2,ð������
	 * 3����������
	 * 4��Լɪ��
	 * 5��쳲���������
	 * 6�������������к������
	 * @param args
	 */

	//	public static void main(String[] args) {
	//		Random random=new Random();
	//		int[] pData=new int[10];
	//		for(int i=0;i<pData.length;i++){ //�������10��������
	//			Integer a =random.nextInt(100);
	//			pData[i]= a;
	//			System.out.print(pData[i]+" ");
	//		}
	//		System.out.println();
	//		pData=Choose(pData);
	//		for(int i=0;i<pData.length;i++){
	//			System.out.print(pData[i]+" ");
	//		}
	//		System.out.println();
	//	}
	//	
	//	
	//	public static int[] Choose(int[] pData){
	//		System.out.println();
	//		for (int i = 0; i < pData.length; i++) {
	//			for (int j = i; j < pData.length; j++) {
	//				if(pData[j]<pData[i]){
	//					int a=pData[j];
	//					pData[j]=pData[i];
	//					pData[i]=a;
	//				}
	//			}
	//		}
	//		return pData;
	//	}


	//ѡ�����򣺵�һ��ѭ���ҳ�һ����Сֵ�����һ��λ���ϵ����������ڶ�����ʣ�µ�������С�ģ�����ڶ�λ�ϵ������н���............
	public static void main(String[] args) {
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
		System.out.println("����֮ǰ��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		//�򵥵�ѡ������
		for (int i = 0; i < a.length-1; i++) {
			int min = a[i];
			int n=i; //��С��������
			for(int j=i+1;j<a.length;j++){
				if(a[j]<min){  //�ҳ���С����
					min = a[j];
					n = j;
				}
			}
			a[n] = a[i];
			a[i] = min;
		}
		System.out.println();
		System.out.println("����֮��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}