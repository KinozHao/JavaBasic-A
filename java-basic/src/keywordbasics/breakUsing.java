package keywordbasics;
//break���÷���������switch����ѭ������ʹ�á�

public class breakUsing {
    public static void main(String[] args) {
        //��������ѭ��
        for (int i =1;i < 10;i++){
            if (i == 6){
                break;
            }
            System.out.print(i+",");
        }

        //�������ѭ��
        foa:for (int i = 1;i <=4;i++){
            fob:for (int j = 1; j <=6 ; j++) {
                if (j == 4){
                    //break fob;    //�����ڲ�ѭ�������������δ�ӡ��ֻ��ӡ��������
                    break  foa;     //�������ѭ�������������δ�ӡ��ֻ��ӡ1��3��
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
