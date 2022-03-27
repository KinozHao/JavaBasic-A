package yitext.improvetest;

/**
 * @author kinoz
 * @date 2022/3/22 - 22:02
 * @apiNote 数组和方法的结合使用
 */
public class Student {
    public static void main(String[] args) {
        Test4[] stus = new Test4[20];

        for (int i = 0; i < stus.length; i++) {
            //给每个数组元素一个空间
            stus[i] = new Test4();
            //给每一个数组元素里面的属性赋值
            stus[i].number = i+1;
            stus[i].state = (int)(Math.random()*(6-1+1)+1);
            stus[i].score = (int)(Math.random()*(100-0+1));
        }

        //遍历学生数组
        for (int i = 0; i < stus.length; i++) {
            //调用学生信息方法
            System.out.println(stus[i].Information());
        }

        System.out.println("---------------------------------------");
        //QAF1:打印三年级的学生信息
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == 3){
                //System.out.println(stus[i].Information());
            }
        }
        System.out.println("---------------------------------------");
        //QAF2:冒泡排序学生成绩 遍历所有学生信息
        for (int i = 0; i < stus.length-1; i++) {
            for (int j = 0; j < stus.length-1-i; j++) {
                if (stus[j].score > stus[j+1].score){
                    //交换的是数组的元素 student1 object
                    Test4 temp = stus[j];
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
class Test4 {
    int number;//学号
    int state;//年纪
    int score;//分数

    public String Information(){ //显示学生信息的方法
        return "学号:"+number+" 年级:"+state+" 分数:"+score;
    }

}
