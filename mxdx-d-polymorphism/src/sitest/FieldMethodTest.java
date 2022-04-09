package sitest;

/**
 * @author kinoz
 * @date 2022/4/8 - 19:09
 * @apiNote
 */
public class FieldMethodTest {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);    //���20
        s.display();            //20

        //== ���������������� �Ƚϵ��ǵ�ֵַ�Ƿ���ͬ
        Base b = s; //��̬��
        System.out.println(b == s);     //��ôb��s�϶�����ȵ�
        System.out.println(b.count);    //����Base���Լ�������10
        //��̬���� ���븸 ������
        b.display();
    }
}

class Base{
    int count = 10;

    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;

    @Override
    public void display() {
        System.out.println(this.count);
    }
}

