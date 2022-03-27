package controljump;
/*用来结束方法,不是为了跳出循环体，
最常用的就是结束一个方法，跳转到上层调用的方法*/
public class returnUsing {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            if (i == 3){
                //break;
               //continue;
                return;
            }
            System.out.println("once");
        }
        System.out.println("twice");
    }
}
