package op��rateur;
//��ֵ�����
public class SetValueTest {
    public static void main(String[] args) {

        //������ֵ
        int a,b;
        a=b=10;
        int a1=100,b1=200;
        System.out.println(a+b+a1+b1);

        //�䲻��ı䱾�����������
        int a3 =10;
        a3 +=2;
        System.out.println(a3);
        a3 -=2;
        System.out.println(a3);
        a3 *=2;
        System.out.println(a3);
        a3 /=2;
        System.out.println(a3);
        a3 %=2;
        System.out.println(a3);

        System.out.println("-------------");

        //�����б���ʵ��+2�Ĳ���ǰ�� int num=10;
        int num =10;
        num +=2;//�Ƽ��÷�
        num = num+2;
        //ʵ��+1�Ĳ���
        num++; //�Ƽ��÷�
        num +=1;
        num = num+1;
        System.out.println(num);

    }
}
