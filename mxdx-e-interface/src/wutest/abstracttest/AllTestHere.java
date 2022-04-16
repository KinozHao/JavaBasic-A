package wutest.abstracttest;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/16 - 21:56
 * @apiNote 动物类和老师类的实例化 抽象多态的体现
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
        teacher a=new teacher("李老师",19);
        a.teach();
        System.out.println(a.getname()+"..."+a.getage());
        teacher2 a2=new teacher2("刘校长",49);
        a2.teach();
        System.out.println(a2.getname()+"..."+a2.getage());
    }

    /**
     * @apiNote 静态体现，我们直接通过类名来调用它
     * 多态体现，提高代码书写的效率
     */

    public static void animals(Animals animals){
        animals.eat();

        //instanceof关键词使用，调用子类自己的方法
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
