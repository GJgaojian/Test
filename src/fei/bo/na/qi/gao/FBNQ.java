package fei.bo.na.qi.gao;

import java.util.Scanner;

public class FBNQ {

	public static void main(String[] args) {  
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Please input this fibonacci n:");
		int n = scanner.nextInt(); // ��������Ϊ�����������  

		System.out.println(fibonacci(6) + ":" + fibonacciNormal(6));

		int sum = 0;  
		for(int i = 1; i <= n; i++){  
			sum += fibonacci(i);  
		}  
		System.out.println(sum);  
	}  

	// �ݹ�ʵ�ַ�ʽ  
	public static int fibonacci(int n){  
		if(n <= 2){  
			return 1;  
		}else{  
			return fibonacci(n-1) + fibonacci(n-2);  
		}  
	}  
	
	// ����ʵ�ַ�ʽ  
	public static int fibonacciNormal(int n){  
		if(n <= 2){  
			return 1;  
		}  
		int n1 = 1, n2 = 1, sn = 0;  
		for(int i = 0; i < n - 2; i ++){  
			sn = n1 + n2;   
			n1 = n2;  
			n2 = sn;  
		}  
		return sn;  
	}  
}