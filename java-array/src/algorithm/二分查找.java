package algorithm;
/**
 * ���ֲ���(��Ϥ����)�ǵݹ�˼��
 * ǰ�� �����ҵ���������������**/
public class ���ֲ��� {
    public static void main(String[] args) {
        int[] data2 = {1,6,11,19,35,37,49,59,70};
        int dest2 = 49;	//Ҫ���ҵ�ֵ
        int head = 0;	//��ʼ��������
        int end = data2.length - 1;	//��ʼ�����һ������
        boolean isFlag2  =true;	//��������������ж�
        while (head <= end){
            //int middle = (head + end )/2;         //��������ķ���
            int middle = head+(end - head )/2;      //ȷ�������middle��һ������head��С��end������������ķ���

            if (data2[middle]< dest2){
                head = middle + 1;
            }else if (data2[middle] > dest2){
                end = middle - 1;
            }else {	//
                System.out.println("find out the length num is: "+middle);
                isFlag2 = false;
                break;
            }
        }
        if (isFlag2){
            System.out.println("None find");
        }
    }
}
