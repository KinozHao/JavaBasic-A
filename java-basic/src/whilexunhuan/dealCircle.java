package whilexunhuan;

import java.util.Scanner;

//��ѭ��
public class dealCircle {
    /*
    * ��ĿҪ��(��for��while�漴һ��ʵ��)
    * ����¼��������������߸���
    * ������ֵΪ0��ʱ��ֹͣ����
    * �ֱ���������ĸ����͸����ĸ���
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveNum = 0;
        int negativeNum = 0;
        //while (true){}    //while��ѭ����ʽ
        for (;;) {
            System.out.println("������ֵ:");
            int number = sc.nextInt();
            if (number > 0 ){
                positiveNum++;
            }else if (number < 0){
                negativeNum++;
            }else {
                break;
            }
        }
        System.out.println("��������:"+positiveNum);
        System.out.println("��������"+negativeNum);
    }

}
