package classmembers;

/**
 * @author kinoz
 * @date 2022/4/15 - 14:24
 * @apiNote ������ʹ��
 * ��̬����� �����ʱ���ִ�У�ִֻ��һ��
 * �Ǿ�̬����� ��Ķ���Ĵ���ִ�У�ÿ����һ������ͼ���һ��
 */
public class CodeblockBasic {
    public static void main(String[] args) {
        String gj = Person.national;
        System.out.println(gj);

        //�������󣬴�����ִ��������
        Person p1 =new Person();
        Person p2 =new Person();
    }
}

class Person{
    //����
    String name;
    int age;
    static String national;

    //������
    public Person(){

    }
    //��̬�����
    static {
        national = "�л����񹲺�";
        System.out.println("static�����ĳ�ʼ��");
    }

    //�Ǿ�̬�����
    {
        System.out.println("��static�����ĳ�ʼ��");
    }

    //����
    public void eat(){
        System.out.println("����ģ���������");
    }
}