package control.whileus;

public class whileTest {
    public static void main(String[] args) {
        int a=1; //����һ������
        while(a<=15){//��while�������a��<=15�� �мǲ���дΪ1<=15����ᷢ������ѭ��
            System.out.println("so the a ="+a);
            a++;
        }

        System.out.println("----------------------");

        // ����1-100�ĺ�
        int c=1;
        int b=0;
        while(c<=100){
            b=c+b;
            c++;
        }
        System.out.println("so b="+b);
    }
}
