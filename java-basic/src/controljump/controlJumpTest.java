package controljump;
/**
 * 题目要求
 * 让电脑分别打印2次、7次、12次输出语句
 * */
public class controlJumpTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0){
                //break;    //2次
                //continue;   //7次
                            //12次
            }
            System.out.println("打印结果");
        }
    }
}
