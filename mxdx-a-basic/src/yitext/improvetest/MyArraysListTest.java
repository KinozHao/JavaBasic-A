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
                System.out.println("找到了 索引是" + index);
            } else {
                System.out.println("未找到");
            }
        }

        {
            int[] arr2 = as.copy(arr);
            System.out.println("这个是复制的另外数组");
            as.print(arr2);
        }
        {
            System.out.println("排序前(遍历):");
            as.print(arr);

            System.out.println("排序后(冒泡):");
            as.bubble(arr);
            as.print(arr);
        }
    }
}
