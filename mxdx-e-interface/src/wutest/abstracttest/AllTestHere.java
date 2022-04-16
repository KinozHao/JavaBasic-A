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

    @Test
    public void teacherTest(){
        teacher a=new teacher("����ʦ",19);
        a.teach();
        System.out.println(a.getname()+"..."+a.getage());
        teacher2 a2=new teacher2("��У��",49);
        a2.teach();
        System.out.println(a2.getname()+"..."+a2.getage());
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
}
