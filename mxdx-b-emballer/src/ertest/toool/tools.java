package ertest.toool;

public class tools {
		public tools(){}
		public static int getMax(int [] arr){
			int a=arr[0];
			for(int b=1;b<arr.length;b++){
				if(a<arr[b]){
					a=arr[b];
				}
			}
			return a;//�������ֵ
		}
		//2����ı���
		public static void print(int [] arr){
			for(int c=0;c<arr.length;c++){
				System.out.print(arr[c]+" ");
			}
		}
		//3����ķ�ת
		public static void revArry(int [] arr){
			for(int d=1;d<arr.length/2;d++){
				int temp=arr[d];
				arr[d]=arr[arr.length-1-d];
				arr[arr.length-1-d]=temp;
			}
		}
	}
