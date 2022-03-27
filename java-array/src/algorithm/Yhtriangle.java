package algorithm;
//����������� �й����ƵP159,157
public class Yhtriangle {
    public static void main(String[] args) {
        //��ά�����ӡ��һ��ʮ�е��������
        /*
        *��ĿҪ��
        * 1 ��һ����һ��Ԫ�أ���n����n��Ԫ��
        * 2 ÿһ�еĵ�һ�������һ��Ԫ�ض���1
        * 2 �ӵ����п�ʼ�����ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ��
        * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
        * */

        // 1 ��������ʼ����ά����
        int yanghui [][] = new int[10][];

        // 2 �������Ԫ�ظ�ֵ
        for (int i = 0; i < yanghui.length ; i++) {
            yanghui[i] = new int [i+1];

            // 2.1 ����ĩԪ�ظ�ֵ
            yanghui[i][0] = yanghui[i][i] = 1;
            // 2.2 ��ÿ�еķ���ĩԪ�ظ�ֵ
            if (i > 1){
                for (int j = 1; j <yanghui[i].length-1; j++) {    //-1��Ϊ����������ĩ��Ԫ�� ��Ȼ�ᱨ����Խ���쳣
                    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
                }
            }
        }

        // 3 ������ά����
        for (int i = 0; i <yanghui.length ; i++) {
            for (int j = 0; j <yanghui[i].length ; j++) {
                System.out.print(yanghui[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
