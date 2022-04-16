package wutest.statictest;

/**
 * @author kinoz
 * @date 2022/4/13 - 16:32
 * @apiNote ���鹤����v2.0
 * ͨ���Է����ľ�̬��(static)
 * ʹ�õ��ñ��෽�����Ӽ�㣬�����½�����ֻ��ͨ������ȥ���ü���
 */
public class ArraysUtil {
    //���ֵ
    public static int getMax(int[] arr){
        int MaxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MaxValue < arr[i]){
                MaxValue = arr[i];
            }
        }
        return MaxValue;
    }
    //�������صľ�������
    public static float getMax(float[] arr){
        float MaxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MaxValue < arr[i]){
                MaxValue = arr[i];
            }
        }
        return MaxValue;
    }

    //��Сֵ
    public static int getMin(int[] arr){
        int MinValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MinValue > arr[i]){
                MinValue = arr[i];
            }
        }
        return MinValue;
    }
    //�ܺ�
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //ƽ��ֵ
    public static int average(int[] arr){
        //�������÷��� ��֪���ܺ���ȥ������������������
        return sum(arr)/arr.length;
    }

    //��ת
    public static void reverse(int[] arr){
		for (int i = 0; i < arr.length/2; i++) {	// /2�ǽ�������
			int temp = arr[i];
			arr[i] =arr[arr.length - i -1];	//����ĳ��ȱ�������1������Ҫ��ȥ1
			arr[arr.length-i-1] = temp;
		}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();	//�������
    }

    //ð������
    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
             }
        }
    }

    //���ݽ���λ��(private����)��������ʹ��
    private static void swap(int arr[],int a,int b){ // a,b��ʱ��Ϊ����
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //�������
    public static void traverse(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    //���鸴��
    public static int[] copy(int[] arr){
        int [] term = new int[arr.length];
        for (int i = 0; i < term.length; i++) {
            term[i] = arr[i];
        }
        return term;
    }

    //���Բ���
    public static int index(int []arr,int dest){
        for (int i = 0; i < arr.length; i++) {
            //�ж��Ƿ��Ӧ
            if (dest == arr[i]){
                //����ҵ���������ֵ
                return i;
            }
        }
        return -1; //����û�ҵ�����˼
    }
}
