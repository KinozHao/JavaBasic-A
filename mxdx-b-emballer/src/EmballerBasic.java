/**
 * @author kinoz
 * @date 2022/3/26 - 18:24
 * @apiNote
 * 封装的体现(不等同封装性本身)
 * 对属性私有化的同时 需要提供公共的方法来获取和设置此属性的值
 * 属性xxx 获取方法getxxx 设置setxxx
 */
public class EmballerBasic {
    public static void main(String[] args) {
        cat c =new cat();
        //用方法传参就体现出了封装性
        c.setleg(8);    //此时 leg为private权限不可直接调用
        c.getleg();

        c.setAge(23);
        c.getAge();
        c.info();
    }
}
class cat{
    private int age;
    private int leg;    //通过属性的私有化来体现出了封装性
    //set与get构成对属性的获取
    public void setleg(int l){
        if (l > 0 && l%2==0){
            leg = l;
        }else {
            leg = 0;
        }
    }
    public int getleg(){
        return leg;
    }

    public void setAge(int a){
        if (a > 0 && a<30){
            age = a;
        }else {
            age = 0;
        }
    }
    public int getAge(){
        return  age;
    }


    public void info(){
        System.out.println("age:"+age+"\tlegs:"+leg);
    }
}
