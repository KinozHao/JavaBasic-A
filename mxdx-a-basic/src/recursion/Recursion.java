package recursion;

/**
 * @author kinoz
 * @date 2022/3/25 - 12:20
 * @apiNote �ݹ�����
 */
public class Recursion {
    public static void main(String[] args) {
        //����forѭ������
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum +=i;
        }
        System.out.println("��������"+sum);

        //�ݹ����
        Recursion rn = new Recursion();
        int sum2 =rn.dgsum(100);
        System.out.println("�ݹ鷽��"+sum2);

    }
    //��������1-n֮��������Ȼ���ĳɼ���n!����n�Ľ׳�
    public int dgsum(int n){
        if (n == 1){
            return 1;
        }else{
            return n+dgsum(n-1);
        }
    }
}
