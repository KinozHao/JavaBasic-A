package op��rateur;
//λ�����
public class BitTest {
    public static void main(String[] args) {
        methodBit();


    }

    private static void methodBit() {
        /**
         * ����
         * λ����������Ķ������͵�����
         * << ��һ����Χ�ڣ�ÿ�����ƶ�1λ���൱��*2
         * >> ��һ����Χ�ڣ�ÿ�����ƶ�1λ���൱��/2
         */
        int i =21;
        System.out.println("i << 2 :"+(i << 2));
        System.out.println("i << 3 :"+(i << 3));
        System.out.println("i << 26 :"+(i << 26));
        System.out.println("i << 27 :"+(i << 27));

        System.out.println("i >> 2 :"+(i >> 2));
        System.out.println("i >> 26 :"+(i >> 26));

        //��θ�Ч�ʵļ��� 2*8
        int y = 2<<3;
        y = 8<<1;
        System.out.println(y);
    }
}
