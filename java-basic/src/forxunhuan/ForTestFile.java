package forxunhuan;
/*
* �������1ѭ����150����ӡÿһ��ֵ
* 3�����д�ӡhzz
* 5�����д�ӡbjj
* 7�����д�ӡshh
* */
public class ForTestFile {
    public static void main(String[] args) {
        for (int i = 0; i <=150 ; i++) {
            System.out.print(i+"  ");
            if (i % 3 == 0){
                System.out.print("hzz");
            }

            if (i % 5 == 0){
                System.out.print("bjj");
            }

            if (i % 7 == 0){
                System.out.print("shh");
            }

            //����
            System.out.println();
        }
    }
}
