package control.ifus;

import java.util.Scanner;

//�߸�˧����
public class highRichHandsomeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("����������");
        int high = sc.nextInt();
        System.out.println("����ʲ�(��λ/ǧ��)");
        int rich = sc.nextInt();
        System.out.println("�㳤��˧��?(˧/��)");
        String handsome = sc.next();
        if (high >=180 && rich >=1 && handsome.equals("˧")){
            System.out.println("�Ǽ޲���");
        }else if (high >=180 || rich>=1 || handsome.equals("˧")){
            System.out.println("Ҳ���Լ�");
        }else{
            System.out.println("����");
        }
    }
}
