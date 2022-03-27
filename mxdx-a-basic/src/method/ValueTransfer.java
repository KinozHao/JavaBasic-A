package method;

/**
 * @author kinoz
 * @date 2022/3/24 - 20:13
 * @apiNote 值传递的问题
 */
public class ValueTransfer {
    public static void main(String[] args) {
        //animal类的对象
        animal cat =new animal();
        //调用类的属性
        cat.a =10;
        cat.b =20;

        ValueTransfer vt = new ValueTransfer(); //方法里面调方法，要创建主类的对象
        vt.swap(cat);   //此时的ooo是作为实参传递到swap方法的形参

        System.out.println("a:"+ cat.a+"b:"+ cat.b);
    }
    public void swap(animal othercat){  //此时形参为引用数据类型tooools
        int temp = othercat.a;
        othercat.a = othercat.b;
        othercat.b = temp;
    }
}
class animal {
    int a;
    int b;

}
