package control.ifus;

/**
* 1.�������뿪��һ�����Ʊ����Ϸ����������ز� ��һ����λ���Ĳ�Ʊ����ʾ�û�����һ����λ ����Ȼ��������Ĺ����ж��û��Ƿ���Ӯ��
* 1)����û��������ƥ���Ʊ��ʵ��˳�򣬽��� 10 000��Ԫ��
* 2)����û��������������ƥ���Ʊ�������� �֣���˳��һ�£����� 3 000��Ԫ��
* 3)����û������һ�����ֽ�����˳�������ƥ ���Ʊ��һ�����֣�����1 000��Ԫ��
* 4)����û������һ�����ֽ������˳������� ƥ���Ʊ��һ�����֣�����500��Ԫ��
* 5)����û����������û��ƥ���κ�һ�����֣� ���Ʊ���ϡ�
* */
import java.util.Random;
import java.util.Scanner;

public class CaiPiaoTest {
    public static void main(String[] args) {
        //������Ĳ�Ʊ��,����10-99֮��
        Scanner sc =new Scanner(System.in);
        System.out.println("������Ĳ�Ʊ����");
        int input = sc.nextInt();

        if (input < 10 || input >99){
            System.out.println("������10-99������");
            return;
        }

        //�н���Ʊ��
        int r = new Random().nextInt(99 - 10 + 1)+10;
        System.out.println("�н��ĺ���: "+r);

        //��ȡ�������ʮλ�͸�λ
        int sw = r / 10;
        int gw =  r % 10;

        //��ȡ��Ʊ����ʮλ�͸�λ
        int s = input / 10;
        int g = input % 10;

        int cp = 0; //��Ʊ����
        if (r == input){
            cp = 10000;
        }else if ((gw == g || sw == s)&&(gw == s || sw == g)){
            cp = 3000;
        }else if (sw == s || gw == g){
            cp = 1000;
        }else if ((gw == g || sw == s) || (gw ==s || sw == g)){
            cp =500;
        }else {
            System.out.println("û���н�");
        }
        System.out.println("����н������"+cp);
    }
}
