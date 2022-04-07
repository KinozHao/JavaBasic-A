/*
结果:StudentList@1d95492
public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
分析:
    左边:类名
    中间:@
    右边:hashCode的十六进制表现形式
    这么写没有什么实际意义
 */
public class ToString {
    public static void main(String[] args) {
        StudentList s=new StudentList("小白",3);//新建对象,把参数也提前设置好
        String xs=s.toString();//子类Students的参数传送过来赋值给xs
        //toString方法的作用:可以更方便的显示属性值
        System.out.println(xs);//对xs进行打印
        System.out.println(s.toString());
        //如果直接调用对象的引用,会默认调用toString方法
        System.out.println(s);
        //调用的话更多的是为了传送数值,有些时候可能还需要进行一系列的运算
        System.out.println("Name:"+s.getName()+"Age:"+s.getAge());
    }
}
