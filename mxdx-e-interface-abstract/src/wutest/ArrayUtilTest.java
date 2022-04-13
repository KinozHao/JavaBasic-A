package wutest;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/13 - 16:36
 * @apiNote 数组工具类v2.0测试
 */
public class ArrayUtilTest {
    int[] arr = {20,30,49,23,53,26,89};

    @Test
    public void auTestA(){
        //线性查找
        int index = ArraysUtil.index(arr,233);
        if (index >= 0) {
            System.out.println("找到了 索引是" + index);
        } else {
            System.out.println("未找到");
        }

        //复制数组
        int[] arr2 = ArraysUtil.copy(arr);
        System.out.println("这个是复制的另外数组");
        ArraysUtil.traverse(arr2);

    }

    @Test
    public void auTestB(){
        //冒泡排序
        System.out.println("只遍历:");
        ArraysUtil.traverse(arr);

        System.out.println("冒泡+遍历:");
        ArraysUtil.bubble(arr);
        ArraysUtil.traverse(arr);
    }

    @Test
    public void auTestC(){
        //算术运算体现
        System.out.println("最大值:"+ArraysUtil.getMax(arr));
        System.out.println("最小值:"+ArraysUtil.getMin(arr));
        System.out.println("总和:"+ArraysUtil.sum(arr));
    }
}
