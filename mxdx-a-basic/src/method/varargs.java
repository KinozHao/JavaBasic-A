package method;

/**
 * @author kinoz
 * @date 2022/3/24 - 19:08
 * @apiNote jdk1.5新机制 允许直接定义能和多个实参相匹配的形参
 */
public class varargs {
    public static void main(String[] args) {
        varargs vs = new varargs();
        vs.show("30");
        vs.show(20,33,44,55,66,77,4353);



    }
    void show(String s){    //此方法形参只可匹配一个实参
        System.out.println(s);
    }

    void show(int ... splus){    //用了varargs特性后形参可对应多个实参
        System.out.println(splus);  //打印为地址值 没有遍历
        for (int i = 0; i < splus.length; i++) {
            System.out.print(splus[i]+"\t");
        }
    }
    //1.5前方式和...方式用法相同,但不可并存
    //void show(String...splus){}
    void show(String[] splus){

    }
}
