package yiarray;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        scoreStu();
        //�绰����
        int arr [] = new int[]{8,2,1,0,3};
        int index [] = new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel ="";
        for (int i = 0; i < index.length ; i++) {
            tel += arr[index[i]];
        }
        System.out.println("TEL:"+tel);

    }

    private static void scoreStu() {
        //ѧ���ȼ��������а���
        //1����ȡѧ������
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ������:");
        int stu = sc.nextInt();

        //2���������飬�洢ѧ���ɼ�����̬��ʼ��
        int[] score = new int[stu];

        //3���������е�Ԫ�ظ�ֵ
        System.out.println("������"+stu+"ѧ���ɼ�");
        for (int i = 0; i <score.length ; i++) {
            score[i] =sc.nextInt();
        }
        //4����ȡ��߷�(�� �����е����ֵ)
        int Maxscore = 0;
        for (int i = 0; i < score.length ; i++) {
            if (Maxscore < score[i]){
                Maxscore = score[i];
            }
        }
        //5������ÿ��ѧ���ɼ�����߷ֵĲ�ֵ���õ�ÿ��ѧ���ĵȼ���������ȼ��ͳɼ�
        char level;
        for (int i = 0; i <score.length ; i++) {
            if (Maxscore - score[i] <= 10){
                level = 'A';
            }else if (Maxscore - score[i] <= 20){
                level = 'B';
            }else if (Maxscore - score[i] <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("studned"+ i + " score"+ score[i] + " level"+ level);
        }
    }
}
