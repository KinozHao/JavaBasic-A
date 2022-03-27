package yiarray;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        scoreStu();
        //电话号码
        int arr [] = new int[]{8,2,1,0,3};
        int index [] = new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel ="";
        for (int i = 0; i < index.length ; i++) {
            tel += arr[index[i]];
        }
        System.out.println("TEL:"+tel);

    }

    private static void scoreStu() {
        //学生等级分数排行案例
        //1，读取学生个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数:");
        int stu = sc.nextInt();

        //2，创建数组，存储学生成绩，动态初始化
        int[] score = new int[stu];

        //3，给数组中的元素赋值
        System.out.println("请输入"+stu+"学生成绩");
        for (int i = 0; i <score.length ; i++) {
            score[i] =sc.nextInt();
        }
        //4，获取最高分(即 数组中的最大值)
        int Maxscore = 0;
        for (int i = 0; i < score.length ; i++) {
            if (Maxscore < score[i]){
                Maxscore = score[i];
            }
        }
        //5，根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
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
