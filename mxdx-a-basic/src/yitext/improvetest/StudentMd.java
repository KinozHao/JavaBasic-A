package yitext.improvetest;

/**
 * @author kinoz
 * @date 2022/3/22 - 22:02
 * @apiNote 数组和方法的结合使用
 */
public class StudentMd {
    public static void main(String[] args) {
        //创建student数组对象
        Test3[] test = new Test3[20]; //静态初始化数组

        //遍历数组
        for (int i = 0; i < test.length; i++) {
            //为每一个数组创建对象
            test[i] = new Test3();
            //为每一个数组对象中的属性进行赋值
            test[i].number = i+1;
            test[i].state = (int)(Math.random()*(6-1+1)+1);
            test[i].score = (int)(Math.random()*(100-0+1));
        }

        StudentMd stus1 = new StudentMd();
        stus1.print(test);
        System.out.println("------------------------------");

        stus1.searchstate(test,3);

        System.out.println("-------------------------------");
        stus1.bubblesort(test);
    }
    //遍历学生数组
    public void print(Test3[] stus){
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].Information());
        }
    }

    //QAF1:打印三年级的学生信息
    public void searchstate(Test3[] stus, int state){
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == 3){
                System.out.println(stus[i].Information());
            }
        }
    }

    //QAF2:冒泡排序学生成绩 遍历所有学生信息
    public void bubblesort(Test3[] stus){
        for (int i = 0; i < stus.length-1; i++) {
            for (int j = 0; j < stus.length-1-i; j++) {
                if (stus[j].score > stus[j+1].score){
                    //交换的是数组的元素 student1 object
                    Test3 temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].Information());
        }
    }
}

class Test3 {
    int number;//学号
    int state;//年纪
    int score;//分数

    public String Information(){ //显示学生信息的方法
        return "学号:"+number+" 年级:"+state+" 分数:"+score;
    }

}
