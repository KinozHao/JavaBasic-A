package sitest;

/**
 * @author kinoz
 * @date 2022/4/8 - 20:24
 * @apiNote ����С���� �����ʲô
 */
public class InterviewTest {
    public static void main(String[] args) {
        faze fe = new zil();
        fe.add(10,2,3,4,2,2,1); //result zil

        if (fe instanceof  zil) {
            zil z = (zil) fe;
            z.add(1, 2, 3);     //result zil222
        }
    }
}

/**
* @apiNote ���ɷ�������д �ɱ��βν���������� ...��[]��һ����˼
* */
class faze{
    public void add(int a,int ... arr){
        System.out.println("faze");
    }
}

class zil extends faze{
    @Override
    public void add(int a, int[] arr) {
        System.out.println("zil");
    }

    //���ڱ�����˵�������� ���ڸ�����˵��������д
    public void add(int a, int b,int c) {
        System.out.println("zil222");
    }
}
