package aboutsuper;

/**
 * @author kinoz
 * @date 2022/4/4 - 18:25
 * @apiNote super�ľ���ʹ�ã��Լ������ԣ��������������Ĺ�ϵ
 */
public class DoctorView {
    public static void main(String[] args) {
        Doctor doc = new Doctor();  //���๹������ȥ���ʸ��๹����,�������������������������
        doc.aboutEat();

        System.out.println("------------------------------");

        Doctor doc2 = new Doctor("���ΰ",20,"�ۿ�����");
        doc2.docInfo();
    }

}
