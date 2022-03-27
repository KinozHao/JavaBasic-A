package yitext.improvetest;

/**
 * @author kinoz
 * @date 2022/3/24 - 15:32
 * @apiNote ���鹤����
 */
public class ArraysUtil {
    //���ֵ
    public int getMax(int[] arr){
        int MaxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MaxValue < arr[i]){
                MaxValue = arr[i];
            }
        }
        return MaxValue;
    }
    public float getMax(float[] arr){
        float MaxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MaxValue < arr[i]){
                MaxValue = arr[i];
            }
        }
        return MaxValue;
    }
    //��Сֵ
    public int getMin(int[] arr){
        int MinValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MinValue > arr[i]){
                MinValue = arr[i];
            }
        }
        return MinValue;
    }
    //�ܺ�
    public int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //ƽ��ֵ
    public int average(int[] arr){
        //�������÷��� ��֪���ܺ���ȥ������������������
        return sum(arr)/arr.length;
    }

    //��ת
    public void reverse(int[] arr){
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
    public void bubble(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
             }
        }
    }

    //���ݽ���λ��
    public void swap(int arr[],int a,int b){ // a,b��ʱ��Ϊ����
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //�������
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    //���鸴��
    public int[] copy(int[] arr){
        int [] term = new int[arr.length];
        for (int i = 0; i < term.length; i++) {
            term[i] = arr[i];
        }
        return term;
    }

    //���Բ���
    public int index(int []arr,int dest){
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
