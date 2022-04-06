package ckeyword;

/**
 * @author kinoz
 * @date 2022/4/4 - 18:30
 * @apiNote
 */
public class Humans {
    String name;
    int age;
    long id = 251235485;    //身份证号码

    public Humans(){
        System.out.println("This is a test about super with constructor");
    }

    public Humans(String name) {
        this.name = name;
    }

    public Humans(String name, int age) {
        this(name);
        this.age = age;
    }


    public void eat(){
        System.out.println("human eat(父类)");
    }

    public void sleep(){
        System.out.println("human sleep");
    }
}
