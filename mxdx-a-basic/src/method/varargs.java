package method;

/**
 * @author kinoz
 * @date 2022/3/24 - 19:08
 * @apiNote jdk1.5�»��� ����ֱ�Ӷ����ܺͶ��ʵ����ƥ����β�
 */
public class varargs {
    public static void main(String[] args) {
        varargs vs = new varargs();
        vs.show("30");
        vs.show(20,33,44,55,66,77,4353);



    }
    void show(String s){    //�˷����β�ֻ��ƥ��һ��ʵ��
        System.out.println(s);
    }

    void show(int ... splus){    //����varargs���Ժ��βοɶ�Ӧ���ʵ��
        System.out.println(splus);  //��ӡΪ��ֵַ û�б���
        for (int i = 0; i < splus.length; i++) {
            System.out.print(splus[i]+"\t");
        }
    }
    //1.5ǰ��ʽ��...��ʽ�÷���ͬ,�����ɲ���
    //void show(String...splus){}
    void show(String[] splus){

    }
}
