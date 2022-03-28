package keyword.thls;

/**
 * @author kinoz
 * @date 2022/3/28 - 19:05
 * @apiNote this的具体体现
 * @apiNote this调用构造器时候有点类似于继承
 */
public class ThisApply {
    public static void main(String[] args) {
        thistest t1 = new thistest("Kim");
        t1.setAge(10);
        System.out.println(t1.getName()+" love eat and he age: "+t1.getAge());

        thistest t2 = new thistest("Joson",20);
        System.out.println(t2.getName()+" love eat and he age: "+t2.getAge());


    }
}
class thistest{
    private String name;
    private int age;

    public thistest() {
        this.info();    //方法调用方法 this可不写
    }
    public thistest(String name){
        this(); //this调用构造器
        this.name = name;   //this修饰属性用来和形参区分开
    }
    public thistest(int age){
        this();
        this.age = age;
    }
    public thistest(String name,int age){
        this(age);
        this.name = name;
    }

    public void setAge ( int age){
        this.age = age;
    }
    public void setName (String name){
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void info(){
        System.out.println("this is a constructor");
    }

}
