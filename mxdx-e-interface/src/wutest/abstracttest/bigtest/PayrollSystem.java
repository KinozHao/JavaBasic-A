package wutest.abstracttest.bigtest;

import java.util.Calendar;

/**
 * @author kinoz
 * @date 2022/4/17 - 15:33
 * @apiNote Ա����ľ������
 */
public class PayrollSystem {
    public static void main(String[] args) {
        //��ʽһ
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("�����·���:");
        int month = scanner.nextInt();*/

        //��ʽ�� ʹ��Calendar��ķ���
        Calendar calendar = Calendar.getInstance();
        //Ҫע������·ݵ������Ǵ�0��ʼ��
        int month2 = calendar.get(Calendar.MONTH);  //��ȡ��ǰ���·�

        //����һ��Employee���͵����飬Ĭ�Ͽ��Դ����������(����ʵ��������)
        Employee [] emp = new Employee[2];
        //���µ���
        emp[0] = new SalariedEmployee("Lily",1001,
                new MyDate(2000,4,4),13000);

        //��Сʱ����
        emp[1] = new HourlyEmployee("Jack",4003,
                new MyDate(2003,8,3),260,88);

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
            double salary = emp[i].earnings();
            System.out.println("�¹���: "+salary);
            //��Ϊ�·������Ǵ�0��ʼ����Ҫ+1
            if (month2 + 1 == emp[i].getBirthday().getMonth()) {
                System.out.println("���ո���:���¹�������100Ԫ");
            }
        }

    }
}
