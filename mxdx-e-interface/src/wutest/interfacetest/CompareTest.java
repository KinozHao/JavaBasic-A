package wutest.interfacetest;

/**
 * @author kinoz
 * @date 2022/4/18 - 18:58
 * @apiNote 比较圆半径的测试
 */
public class CompareTest  {
    public static void main(String[] args) {
        CompareCircle a= new CompareCircle(3.2);
        CompareCircle b= new CompareCircle(3.2);
        int compareValue = a.compareTo(b);
        if (compareValue > 0){
            System.out.println("a大");
        }else if (compareValue < 0){
            System.out.println("b大");
        }else {
            System.out.println("相同");
        }
        CompareCircle c= new CompareCircle(3.2);

        //不同类型时候就会输出我们自定义的异常
        int compareValue2 = c.compareTo(new String());
        System.out.println(compareValue2);
    }
}
