package yitext.improvetest;

/**
 * @author kinoz
 * @date 2022/3/24 - 15:36
 * @apiNote
 */
public class MyArraysListTest {
    public static void main(String[] args) {
        MyArraysList as = new MyArraysList();
        int[] arr = {20,30,49,23,53,26,89};
        {
            int index = as.index(arr,233);
            if (index >= 0) {
                System.out.println("�ҵ��� ������" + index);
            } else {
                System.out.println("δ�ҵ�");
            }
        }

        {
            int[] arr2 = as.copy(arr);
            System.out.println("����Ǹ��Ƶ���������");
            as.print(arr2);
        }
        {
            System.out.println("����ǰ(����):");
            as.print(arr);

            System.out.println("�����(ð��):");
            as.bubble(arr);
            as.print(arr);
        }
    }
}
