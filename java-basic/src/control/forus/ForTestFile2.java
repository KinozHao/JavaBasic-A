package control.forus;

import java.util.Scanner;

/*
* ��������������m��n
* �����Լ������С������
* ����12��20�����Լ����4����С��Լ����60
* ˵����break�ؼ��ʵ�ʹ��
* */
public class ForTestFile2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("�����һ�����֣�");
        int m = sc.nextInt();
        System.out.println("����ڶ������֣�");
        int n = sc.nextInt();

        //���Լ��
        //1����ȡ����������Сֵ
        int min = (m <= n)? m:n;
        //2������
        for (int i = min; i >=1 ; i--) {
            if (m % i == 0 && n % i == 0){
                System.out.println("���Լ���ǣ�"+i);
                break;//һ������break������ѭ��
            }
        }

        //��С������
        //1����ȡ�����������ֵ
        int max = (m >= n)? m:n;
        //2������
        for (int i = max; i<=m*n ; i++) {
            if (i % m == 0 && i % n == 0){
                System.out.println("��С�������ǣ�"+i);
                break;
            }
        }
    }
}
