package algorithm;

//�������� ���ֵ ��Сֵ ƽ��ֵ ��
public class ArithmeticOperation {
    public static void main(String[] args) {
        int arr [] = new int[10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int)(Math.random()*(99-10+1)+10); //����ʮ����ͬ�������������2λ��
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ ",");
        }
        System.out.println();

        //���ֵ
        int MaxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MaxValue < arr[i]){
                MaxValue = arr[i];
            }
        }
        System.out.println("���ֵ��: "+MaxValue);

        //��Сֵ
        int MinValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MinValue > arr[i]){
                MinValue = arr[i];
            }
        }
        System.out.println("��Сֵ��: "+ MinValue);

        //�ܺ�
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        System.out.println("�ܺ�Ϊ:"+sum);

        //ƽ��ֵ
        int avgValue = sum / arr.length;
        System.out.println("ƽ��ֵ: "+ avgValue);
    }
}