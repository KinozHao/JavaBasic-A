package control.whileus;
public class TextFile1 {
    public static void main(String[] args) {
        //��1-100���ڵ�ż��
        int i =1;
        while (i<=100){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

        //˵��:do while���ٻ�ִ��һ��ѭ����
        int f = 10;
        do {
            System.out.println("de while implement");
            f--;
        }while (f > 10);

        int ft = 10;
        while (ft >10){
            System.out.println("while implement");
            ft--;
        }
    }
}
