package santest.mankids;

/**
 * @author kinoz
 * @date 2022/4/4 - 14:45
 * @apiNote
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids(17);
        someKid.printAge();     //�Լ�������ķ���

        someKid.setSalary(0);   //����
        someKid.setSex(1);      //����

        someKid.manOrWoman();   //���ø��෽��
        someKid.employed();    //��д���෽��
    }
}
