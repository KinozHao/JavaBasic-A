package keywordbasics;
//continue���÷�ֻ����ѭ����
public class continueUsing {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3){
                //��������ѭ���������´�ѭ��
                continue;
            }
            System.out.println(i);
        }
        System.out.println("---------------");


        fory:for (int i = 1; i <= 4; i++) {
            fore:for (int j = 1; j <= 5; j++) {
                if (j == 4){
                    //1,�����ڲ�ѭ����ִ����һ��ѭ������ӡ��������
                    //continue fore;
                    //2,�������ѭ����j=4ʱ���������ѭ����Ȼ��ִ���´�ѭ����3*4=12
                    continue  fory;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
