/**
 * @author kinoz
 * @date 2022/4/9 - 17:53
 * @apiNote ==��equals������
 */
public class EqualsUs {
    public static void main(String[] args) {
        StudentList studentList1=new StudentList("Jone",21);
        StudentList studentList2=new StudentList("Jone",21);

        //��дǰ�Ƚ���������ĵ�ֵַ
        //��д��Ƚ����������ʵ������(����)
        boolean isEquals = studentList1.equals(studentList2);
        System.out.println("studentlist���ͱȽ�equals:"+isEquals);

        //==�Ƚ������������ͣ��Ƚϵ��ǵ�ֵַ
        System.out.println("studentlist���ͱȽ�==:"+(studentList1 == studentList2));


        //==�Ƚϻ����������ͣ��Ƚϵ���ֵ
        int a = 10;
        int b = 20;
        System.out.println("int���ͱȽ�:"+(a == b));


    }
}
