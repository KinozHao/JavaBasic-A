package whilexunhuan;
//100�������������
//�Ż���
public class primeNumber2 {
    public static void main(String[] args) {
        //current�����÷�:��ȡ��ǰʱ�����1970-1-1 0:00:00�ĺ�����
        long start = System.currentTimeMillis();

        //count���ڻ�ȡ�ж��ٸ�����
        int count = 0;
        label:for (int i = 2; i <= 100000 ; i++) {
            //���ź����Ż������ٶ�
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0 ){
                    continue label;
                }
            }
            //��ִ�е��˲���Ķ�������
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("�����ж��ٸ�:"+count);
        System.out.println("�����ѵ�ʱ��:"+(end-start)+"��λ:����");
    }
}
