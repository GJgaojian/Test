package xuan.ze.gao;

import java.util.Random;

public class Xz {

	/**
	 * http://www.cnblogs.com/liuling/p/2013-7-24-01.html
	 * 这星期知识：
	 * 1，选择排序
	 * 2,冒泡排序
	 * 3，二分排序
	 * 4，约瑟夫环
	 * 5，斐波那契数列
	 * 6，二叉树：先中后序遍历
	 * @param args
	 */

	//	public static void main(String[] args) {
	//		Random random=new Random();
	//		int[] pData=new int[10];
	//		for(int i=0;i<pData.length;i++){ //随机生成10个排序数
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


	//选择排序：第一次循环找出一个最小值，与第一个位置上的数交换，第二次找剩下的数中最小的，再与第二位上的数进行交换............
	public static void main(String[] args) {
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		//简单的选择排序
		for (int i = 0; i < a.length-1; i++) {
			int min = a[i];
			int n=i; //最小数的索引
			for(int j=i+1;j<a.length;j++){
				if(a[j]<min){  //找出最小的数
					min = a[j];
					n = j;
				}
			}
			a[n] = a[i];
			a[i] = min;
		}
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}