package algorithm;
//����ĸ���
//˼��:arr1��arr2��ʲô��ϵ?
//arr1��arr2��ֵַ����ͬ��ָ��ͬһ������ʵ��
import java.util.Arrays;
public class Copy {
    public static void main(String[] args) {
        //fakeCopyMethods();
        String [] str = new String[]{"sis","bro","fae","mom","unc"};
        String [] str2 = new String[str.length];
        for (int i = 0; i < str2.length; i++) {
            str2[i] = str[i];
        }
        System.out.println(Arrays.toString(str));   //���÷�����������
        for (int i = 0; i < str2.length; i++) {     //forѭ����������
            System.out.print(str2[i]+" ");
        }
    }

    private static void fakeCopyMethods() { //��ֵ����
        //������������
        int [] arr1,arr2;
        arr1 = new int[]{2,3,5,7,11,13,17,19};

        //��ʾarr1������
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i] + "\t");
        }

        // ��ֵarr2��������arr1
        // ���ܳ�������ĸ�ֵ�������������ļ��Ŀ�ݷ�ʽ
        arr2 = arr1;

        //�޸�arr2��ż����Ԫ�أ�ʹ���������ֵ(�� arr1[0]=0, arr2[2]=2)]
        for (int i = 0; i <arr2.length ; i++) {
            if (i % 2 ==0){
                arr2[i] = i;
            }
        }
        System.out.println();
        //��ӡarr1
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+ "\t");
        }
    }
}
