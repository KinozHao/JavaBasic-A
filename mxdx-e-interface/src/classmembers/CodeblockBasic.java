package classmembers;

/**
 * @author kinoz
 * @date 2022/4/15 - 14:24
 * @apiNote 代码块的使用
 * 静态代码块 类加载时候就执行，只执行一次
 * 非静态代码块 类的对象的创建执行，每创建一个对象就加载一次
 */
public class CodeblockBasic {
    public static void main(String[] args) {
        String gj = Person.national;
        System.out.println(gj);

        //两个对象，代码块就执行了两次
        Person p1 =new Person();
        Person p2 =new Person();
    }
}

class Person{
    //属性
    String name;
    int age;
    static String national;

    //构造器
    public Person(){

    }
    //静态代码块
    static {
        national = "中华人民共和";
        System.out.println("static代码块的初始化");
    }

    //非静态代码块
    {
        System.out.println("非static代码块的初始化");
    }

    //方法
    public void eat(){
        System.out.println("吃熟的，不吃生的");
    }
}