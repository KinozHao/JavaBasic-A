package yitext.improvetest;

/**
 * @author kinoz
 * @date 2022/3/22 - 22:02
 * @apiNote ����ͷ����Ľ��ʹ��
 */
public class Student {
    public static void main(String[] args) {
        Test4[] stus = new Test4[20];

        for (int i = 0; i < stus.length; i++) {
            //��ÿ������Ԫ��һ���ռ�
            stus[i] = new Test4();
            //��ÿһ������Ԫ����������Ը�ֵ
            stus[i].number = i+1;
            stus[i].state = (int)(Math.random()*(6-1+1)+1);
            stus[i].score = (int)(Math.random()*(100-0+1));
        }

        //����ѧ������
        for (int i = 0; i < stus.length; i++) {
            //����ѧ����Ϣ����
            System.out.println(stus[i].Information());
        }

        System.out.println("---------------------------------------");
        //QAF1:��ӡ���꼶��ѧ����Ϣ
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == 3){
                //System.out.println(stus[i].Information());
            }
        }
        System.out.println("---------------------------------------");
        //QAF2:ð������ѧ���ɼ� ��������ѧ����Ϣ
        for (int i = 0; i < stus.length-1; i++) {
            for (int j = 0; j < stus.length-1-i; j++) {
                if (stus[j].score > stus[j+1].score){
                    //�������������Ԫ�� student1 object
                    Test4 temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < stus.length; i++) {
                System.out.println(stus[i].Information());
        }

    }
}
class Test4 {
    int number;//ѧ��
    int state;//���
    int score;//����

    public String Information(){ //��ʾѧ����Ϣ�ķ���
        return "ѧ��:"+number+" �꼶:"+state+" ����:"+score;
    }

}
