package control.ifus;

import java.util.Scanner;
/**
* ������ҹ��������ˣ�
 * ��֪����ǰ�������䣬ÿ���൱��������10.5��
 * ֮���ÿһ��4���൱���˵�4��
 * ��ô��ҵĹ�����˿������
* */
public class dogAgeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���빷�����");
        Double dogage = sc.nextDouble();
        if (dogage >=0 && dogage <=2){
            System.out.println("������˵�����:"+dogage*10.5);
        }else if (dogage >2){
            System.out.println("�൱���˵�����:"+(2*10.5 + (dogage-2) * 4));
        }else {
            System.out.println("������û����");
        }
    }

}
