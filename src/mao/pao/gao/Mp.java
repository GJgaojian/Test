package mao.pao.gao;

public class Mp {

	//	public static void main(String[] args) {
	//		int score[] = {67, 69, 75, 87, 89, 90, 99, 100};
	//
	//
	//		for (int i = 0; i < score.length -1; i++){   //�����n-1������ 
	//			for(int j = 0 ;j < score.length - i - 1; j++){ 
	//				//�Ե�ǰ��������score[0......length-i-1]��������(j�ķ�Χ�ܹؼ��������Χ��������С��)
	//				if(score[j] < score[j + 1]){    //��С��ֵ����������
	//					int temp = score[j];
	//					score[j] = score[j + 1];
	//					score[j + 1] = temp;
	//				}
	//			}            
	//			System.out.print("��" + (i + 1) + "����������");
	//			for(int a = 0; a < score.length; a++){
	//				System.out.print(score[a] + "\t");
	//			}
	//			System.out.println("");
	//		}
	//		System.out.print("������������");
	//		for(int a = 0; a < score.length; a++){
	//			System.out.print(score[a] + "\t");
	//		}
	//	}


	public static void main(String[] args) {
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
		System.out.println("����֮ǰ��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		//ð������
		for (int i = 0; i < a.length;                                                                               i++) {
			for(int j = 0; j<a.length-i-1; j++){
				//����-i��Ҫ��ÿ����һ�ζ�������i�������������ȥ�ˣ�û�б�Ҫ���滻��
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("����֮��");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
