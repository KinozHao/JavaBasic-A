package controljump;
/*������������,����Ϊ������ѭ���壬
��õľ��ǽ���һ����������ת���ϲ���õķ���*/
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
