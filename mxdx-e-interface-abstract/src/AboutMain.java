/**
 * @author kinoz
 * @date 2022/4/14 - 19:57
 * @apiNote main������ʹ��
 */
public class AboutMain {
    //���main������Ϊ��������
    public static void main(String[] args) {
        //��̬���������̬����
        TestMain.main(args);    //����ֱ�ӵ���
    }
}
class TestMain{
    //��main��������Ϊһ���򵥵Ĺ��췽��ʹ��
    public static void main(String[] args) {
        //��һ������Ϊ100��String��������
        args = new String[100];
        for (int i = 0; i < args.length; i++) {
            //��������鸳ֵ
            args[i] = "args_"+i;
            //��ӡ�������
            System.out.println(args[i]);
        }
    }
}
