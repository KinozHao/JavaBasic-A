package classmembers;

/**
 * @author kinoz
 * @date 2022/4/19 - 22:03
 * @apiNote ������һ����ôʹ���ڲ���
 */
public class WorkView {
    //����ֵ����ΪComparable�ӿ�
    public Comparable getComparable() {
        //���ڲ�����Ϊʵ������ʵ��Comparable�ӿ�
        class MyComparable implements Comparable {
            //��д�ӿڵķ���
            @Override
            public int compareTo(Object o) {
                return 0;
            }

        }
        //����һ���ӿڵ�ʵ��������������
        //return new MyComparable();

        //�����ڲ���д��
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
