package sitest;

/**
 * @author kinoz
 * @date 2022/4/8 - 19:09
 * @apiNote
 */
public class FieldMethodTest {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);    //输出20
        s.display();            //20

        //== 对于引用数据类型 比较的是地址值是否相同
        Base b = s; //多态性
        System.out.println(b == s);     //那么b和s肯定是相等的
        System.out.println(b.count);    //调用Base类自己的属性10
        //多态体现 编译父 运行子
        b.display();
    }
}

class Base{
    int count = 10;

    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;

    @Override
    public void display() {
        System.out.println(this.count);
    }
}

