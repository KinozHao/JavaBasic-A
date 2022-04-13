package wutest;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/13 - 16:36
 * @apiNote ���鹤����v2.0����
 */
public class ArrayUtilTest {
    int[] arr = {20,30,49,23,53,26,89};

    @Test
    public void auTestA(){
        //���Բ���
        int index = ArraysUtil.index(arr,233);
        if (index >= 0) {
            System.out.println("�ҵ��� ������" + index);
        } else {
            System.out.println("δ�ҵ�");
        }

        //��������
        int[] arr2 = ArraysUtil.copy(arr);
        System.out.println("����Ǹ��Ƶ���������");
        ArraysUtil.traverse(arr2);

    }

    @Test
    public void auTestB(){
        //ð������
        System.out.println("ֻ����:");
        ArraysUtil.traverse(arr);

        System.out.println("ð��+����:");
        ArraysUtil.bubble(arr);
        ArraysUtil.traverse(arr);
    }

    @Test
    public void auTestC(){
        //������������
        System.out.println("���ֵ:"+ArraysUtil.getMax(arr));
        System.out.println("��Сֵ:"+ArraysUtil.getMin(arr));
        System.out.println("�ܺ�:"+ArraysUtil.sum(arr));
    }
}
