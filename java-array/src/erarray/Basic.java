package erarray;

public class Basic {

	public static void main(String[] args) {
		Basic er = new Basic();
		int [][] a=new int[2][3];
		//����һ����λ����.
		//�����ά������������һά���� 
		//������ÿ��һλ������������Ԫ��
		//int []a,b[];a��һά���飬b�Ƕ�ά���顣
		System.out.println(a);		//��ӡ����ά����
		System.out.println(a[0]);   //��ά�����еĵ�һ��һά����
		System.out.println(a[0][0]); //��ά�����еĵ�һ��һλ�����Ԫ��
		/**
		 * ǰ����Ϊ��ֵַ������ΪĬ��ֵ
		 * [[I@9945ce//��ά�����ӡ�����Ľ��������[[
		   [I@b5dac4//һά�����ӡ�����Ľ��ֻ��һ��[[
           0��һ��һά�����Ĭ��ֵ��Ԫ��ֵ
         */
		System.out.println("==============================");
		System.out.println("The second write");
		er.two();
		System.out.println("==============================");
		System.out.println("The third write");
		er.three();
	}
	public void three(){
		int [][]arr={{1,2},{10,20},{100,200}};
		//����һ����ά����,�����ά������ÿ�������Ŷ�����һ��һά����
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		System.out.println(arr[1]);
		System.out.println(arr[1][1]);
	}
	public void two(){
		int [][]a=new int[2][];//������һά����
		a[0]=new int[2];//��һ��һά������Դ洢����Ԫ��,��û�б���ʼ��
		a[1]=new int[3];//�ڶ���һά������Դ洢����Ԫ��,��û�б���ʼ��
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
	}

}
