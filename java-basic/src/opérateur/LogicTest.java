package op��rateur;
//�߼������
public class LogicTest {
    public static void main(String[] args) {
        methodYV();
        System.out.println("[***************************]");
        methodHUO();
        //�������Ƽ�ʹ��||��&&
        logicsQuestion();

    }

    private static void logicsQuestion() {
        boolean x =true;
        boolean y =false;
        short z = 42;
        /*�Ӻ��ں�,�������1�����Ƚ� ��:false
        �ң�false
        ��·�����Ϊfalse�ұ߲�ִ��
        */
        if((z++ == 42)&&(y = true)){
            z++;    //z==44����
            //��·�����false�ұ߼���ִ��
            if ((x = false)||(++z==45)){    //z==45
                z++; //z==46

            }
        }
        System.out.println("���մ�ӡ�����z = "+z);
    }

    private static void methodHUO() {
        // |��||������
        // ��ͬ��1 |��||����������ͬ
        // ��ͬ��2 ���������Ϊfalseʱ��,���߶���ִ�з����ұߵ�����
        // ��ͬ��  �����������true��ʱ�� |�����ִ���ұߵ������||����ִ��
        boolean bl3 = true;
        //bl3 = false;
        int a3 = 10;
        if (bl3 | (a3++>0)){
            System.out.println("Tokyo");
        }else{
            System.out.println("Peking");
        }
        System.out.println(a3);

        boolean bl4 = true;
        //bl4 = false;
        int a4 = 10;
        if (bl4 || (a4++>0)){
            System.out.println("Tokyo");
        }else{
            System.out.println("Peking");
        }
        System.out.println(a4);
    }


    private static void methodYV() {
        // &��&&������
        // ��ͬ��1 &��&&����������ͬ
        // ��ͬ��2 ���������Ϊtrueʱ��,���߶���ִ�з����ұߵ�����
        // ��ͬ��  �����������false��ʱ�� &�����ִ���ұߵ������&&����ִ��
        boolean bl = true;
        bl = false;
        int a = 10;
        if (bl & (a++>0)){
            System.out.println("Tokyo");
        }else{
            System.out.println("Peking");
        }
        System.out.println(a);

        boolean bl2 = true;
        bl2 = false;
        int a2 = 10;
        if (bl2 && (a2++>0)){
            System.out.println("Tokyo");
        }else{
            System.out.println("Peking");
        }
        System.out.println(a2);
    }
}
