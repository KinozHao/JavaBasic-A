package pgtest;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author kinoz
 * @date 2022/4/11 - 19:50
 * @apiNote ѧ���ɼ����� Vector��ʹ��
 * ���ְ�װ�࣬��Щ��������β�ҲҪ�õ���װ��
 */
public class ScoreTest {
    public static void main(String[] args) {
        //����Scanner����
        Scanner sc = new Scanner(System.in);

        //����vector����,�൱����
        Vector vr = new Vector();

        int maxScore = 0;   //��߷�
        for (;;){
            System.out.println("����ѧ���ɼ������븺���������");
            int score = sc.nextInt();
            if (score < 0){
                break;
            }
            if (score > 100){
                System.out.println("��������");
                continue;
            }

            //Integer inScore = score;  //��װ��

            vr.addElement(score); //���Ԫ�ص�vector �Զ�װ������

            //��ȡѧ����߷�
            if (maxScore < score){
                maxScore = score;
            }
        }

        char level; //�ɼ��ȼ�
        //����vector,���ÿ��ѧ���ɼ�,������߷ֱȽϣ��õ�ѧ���Ǽ�
        //vr.size��ȡ�洢��Ԫ��
        for (int i = 0; i < vr.size(); i++) {
            //��ȡÿһ��Ԫ��
            Object obj = vr.elementAt(i);

            //1.5��ǰ
            /*Integer it1 = (Integer)obj;
            int iScore = it1.intValue();*/

            //�Զ�����
            int iScore = (int)obj;

            if (maxScore - iScore <= 10){
                level = 'A';
            }else if (maxScore - iScore <= 20){
                level = 'B';
            }else if (maxScore - iScore <= 30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student-"+ i +"score is:"+iScore+",level is "+level);
        }


    }
}
