package yitext.improvetest;

/**
 * @author kinoz
 * @date 2022/3/22 - 22:02
 * @apiNote ����ͷ����Ľ��ʹ��
 */
public class StudentMd {
    public static void main(String[] args) {
        //����student�������
        Test3[] test = new Test3[20]; //��̬��ʼ������

        //��������
        for (int i = 0; i < test.length; i++) {
            //Ϊÿһ�����鴴������
            test[i] = new Test3();
            //Ϊÿһ����������е����Խ��и�ֵ
            test[i].number = i+1;
            test[i].state = (int)(Math.random()*(6-1+1)+1);
            test[i].score = (int)(Math.random()*(100-0+1));
        }

        StudentMd stus1 = new StudentMd();
        stus1.print(test);
        System.out.println("------------------------------");

        stus1.searchstate(test,3);

        System.out.println("-------------------------------");
        stus1.bubblesort(test);
    }
    //����ѧ������
    public void print(Test3[] stus){
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].Information());
        }
    }

    //QAF1:��ӡ���꼶��ѧ����Ϣ
    public void searchstate(Test3[] stus, int state){
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == 3){
                System.out.println(stus[i].Information());
            }
        }
    }

    //QAF2:ð������ѧ���ɼ� ��������ѧ����Ϣ
    public void bubblesort(Test3[] stus){
        for (int i = 0; i < stus.length-1; i++) {
            for (int j = 0; j < stus.length-1-i; j++) {
                if (stus[j].score > stus[j+1].score){
                    //�������������Ԫ�� student1 object
                    Test3 temp = stus[j];
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

class Test3 {
    int number;//ѧ��
    int state;//���
    int score;//����

    public String Information(){ //��ʾѧ����Ϣ�ķ���
        return "ѧ��:"+number+" �꼶:"+state+" ����:"+score;
    }

}
