package control.whileus;
//100�������������
public class primeNumber {
    public static void main(String[] args) {
        //current�����÷�:��ȡ��ǰʱ�����1970-1-1 0:00:00�ĺ�����
        long start = System.currentTimeMillis();
        int count = 0;
        boolean isFlag = true;      //�жϱ�ʶ��i�Ƿ��ܹ���j������һ���ܳ������͸ı���ֵΪfalse
        for (int i = 2; i <=100000 ; i++) {
            //�Ż�2:���ø��ź���sqrt
            for (int j = 2; j <= Math.sqrt(i); j++) {   //j:��iȥ��
            //for (int j = 2; j < i; j++) {   //j:��iȥ��
                if (i % j == 0){
                    isFlag = false;
                    break;  //�Ż�1��ֻ�Ա������������Ȼ����Ч
                }
            }
            if (isFlag == true){    //i��j����
                //System.out.println(i);
                count++;
            }
            isFlag = true;  //��ʶ����
        }
        long end = System.currentTimeMillis();
        System.out.println("�����ж��ٸ�:"+count);
        //sqrt����:20���� break:1280 ���㷨:13534
        System.out.println("�����ѵ�ʱ��:"+(end-start)+"��λ:����");
    }
}
