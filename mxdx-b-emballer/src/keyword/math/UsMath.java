package keyword.math;
/**
 * @apiNote �������ʹ��
 * */
public class UsMath {
	public static void main(String[] args) {
		/*double a=Math.random();//random��Χ�����ڵ���0.0��С��1.0��α���doubleֵ.
		System.out.println(a);*/
		for(int a=0;a<10;a++){
			System.out.println(Math.random());//�������10�� �����ֵ��0.0-1.0;
		}
		//Math���Ĭ��ΪС��ֵ,������int����ǿת����,*100ȡֵ����0-99֮��;
		for(;;){
			System.out.println((int)(Math.random()*100));//��intǿת��for����ѭ��0-99����
		}
		//����1-100�������
		//Math.random()0.0000000-0.999999999
		//Math.random()*100=========>0.00000-99.999999999
	}

}
