package algorithm;

public class Reverse {

	public static void main(String[] args) {
		//1 ��������
		int [] arr={90,80,70,60,50,46};


		//2 ����һ ��������������н���
/*		for (int i = 0; i < arr.length/2; i++) {	// /2�ǽ�������
			int temp = arr[i];
			arr[i] =arr[arr.length - i -1];	//����ĳ��ȱ�������1������Ҫ��ȥ1
			arr[arr.length-i-1] = temp;
		}*/

		//2.1 ������
		for (int i = 0,j = arr.length-1;i<j;i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		/* while��д��
		int i=0;
		while(i<arr.length/2){
		int oxo=arr[i];
		arr[i]=arr[arr.length-1-i];//����ĳ��ȱ�������1������Ҫ��ȥ1
		arr[arr.length-1-i]=oxo;
		i++;*/

		//3 ����ı���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();	//�������

	}
}
