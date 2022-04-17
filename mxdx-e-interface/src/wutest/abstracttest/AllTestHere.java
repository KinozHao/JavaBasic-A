package wutest.abstracttest;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/16 - 21:56
 * @apiNote ���������ʦ���ʵ���� �����̬������
 */
public class AllTestHere {

    @Test
    public void animalTest(){

        AllTestHere.animals(new Cats(18,"Kate"));

        System.out.println("----------------------------------");

        AllTestHere.animals(new Dogs(14,"Niki"));

    }

    /**
     * @apiNote ��̬���֣�����ֱ��ͨ��������������
     * ��̬���֣���ߴ�����д��Ч��
     */

    public static void animals(Animals animals){
        animals.eat();

        //instanceof�ؼ���ʹ�ã����������Լ��ķ���
        if (animals instanceof Cats){
            Cats cats = (Cats)animals;
            cats.catchMouse();
        }

        if (animals instanceof Dogs){
            Dogs dogs = (Dogs)animals;
            dogs.lookDoor();
        }
        System.out.println("The housePet name is:"+animals.getName()+
                "it's about"+animals.getAge()+"years old");
    }

    @Test
    public void teacherTest(){
        AllTestHere.schools(new Teacher("������",21));
        AllTestHere.schools(new Teacher2("���Ʒ�",31));
    }

    public static void schools(School school){
        //ͨ��toString��ȡ����
        System.out.println(school);
        school.teach();
    }
}
