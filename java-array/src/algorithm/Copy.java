package algorithm;
//数组的复制
//思考:arr1和arr2是什么关系?
//arr1和arr2地址值都相同都指向同一个数组实体
import java.util.Arrays;
public class Copy {
    public static void main(String[] args) {
        //fakeCopyMethods();
        String [] str = new String[]{"sis","bro","fae","mom","unc"};
        String [] str2 = new String[str.length];
        for (int i = 0; i < str2.length; i++) {
            str2[i] = str[i];
        }
        System.out.println(Arrays.toString(str));   //调用方法遍历数组
        for (int i = 0; i < str2.length; i++) {     //for循环遍历数组
            System.out.print(str2[i]+" ");
        }
    }

    private static void fakeCopyMethods() { //赋值操作
        //定义两个数组
        int [] arr1,arr2;
        arr1 = new int[]{2,3,5,7,11,13,17,19};

        //显示arr1的内容
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i] + "\t");
        }

        // 赋值arr2变量等于arr1
        // 不能称作数组的赋值，类似于桌面文件的快捷方式
        arr2 = arr1;

        //修改arr2的偶索引元素，使其等于索引值(如 arr1[0]=0, arr2[2]=2)]
        for (int i = 0; i <arr2.length ; i++) {
            if (i % 2 ==0){
                arr2[i] = i;
            }
        }
        System.out.println();
        //打印arr1
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+ "\t");
        }
    }
}
