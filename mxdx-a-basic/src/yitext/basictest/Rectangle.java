package yitext.basictest;

/**
 * @author kinoz
 * @date 2022/3/22 - 21:30
 * @apiNote ��ӡ���β�������������
 * @apiNote ���������ȥ��� �βκ����޷���ֵ������
 */
public class Rectangle {
    public static void main(String[] args) {
        Rectangle t = new Rectangle();
        t.method1();

        int area = t.method2();
        System.out.println("���ε����: "+area);

        int area2 = t.method3(4,4);
        System.out.println("���ε����: "+area2);
    }
    public void method1(){  //������ε�һ��ͼ��
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <8 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int method2(){   //�з���ֵ,Ϊ�̶��������
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <8 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10*8;
    }

    public int method3( int m , int n){ //�з���ֵ�����ֿ�����������������ε����
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }
}
