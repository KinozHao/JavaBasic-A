package wutest.interfacetest;

/**
 * @author kinoz
 * @date 2022/4/18 - 18:42
 * @apiNote 比较圆的半径
 */
public class CompareCircle extends Circle implements CompareObject {
    public CompareCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof CompareCircle){
            CompareCircle cc = (CompareCircle) o;
            //使用判断语句
            /*if (this.getRadius() > cc.getRadius()){
                return 1;
            }else if (this.getRadius() < cc.getRadius()){
                return  -1;
            }else {
                return 0;
            }*/
            //使用包装类方法 前提是属性类型为包装类
            return this.getRadius().compareTo(cc.getRadius());
        }else {
            //return 0;
            throw new RuntimeException("传输数值不匹配");
        }
    }

}
