package aboutsuper;

/**
 * @author kinoz
 * @date 2022/4/4 - 18:33
 * @apiNote 继承Humans的医生类
 */
public class Doctor extends Humans {
    String major;
    long id = 21421223; //工号

    public Doctor(){ super();}

    public Doctor(String major){
        this.major = major;
    }

    public Doctor(String name, int age, String major) {
        super(name, age);       //super获取父类构造器的形参
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("Doctor eat at hospital dining hall(子类)");
    }

    public void aboutEat(){
        this.eat();     //重写后的eat方法
        super.eat();    //父类默认的eat方法
    }

    public void docInfo(){
        System.out.println("姓名:"+name+" 年龄:"+age);
        System.out.println("医院工号: "+ this.id );
        System.out.println("身份证号: "+ super.id);  //SUPER区分和子类同名的属性
    }

}
