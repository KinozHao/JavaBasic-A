package basictest.daffodils;
//ʹ��forѭ���ṹ���ˮ�ɻ����ļ���
public class wfForWhich {
	//ʲô��ˮ�ɻ���һ����λ������������ֵ�����������䱾��
	//���� 153=1*1*1+5*5*5+3*3*3��
	//��֪����ˮ�ɻ��ķ�Χ��100-999
	public static void main(String[] args) {
		System.out.println("���1-1000�е�ˮ�ɻ�����ʲô");
		for(int a=100;a<=999;a++){ //a����ֵ100����a<=999
			int ge=a%10; //���λ
			int shi=a/10%10; //��ʮλ
			int bai=a/10/10%10; //���λ
			if(ge*ge*ge+bai*bai*bai+shi*shi*shi==a){//��������a���
				System.out.println(a); //���ӡa��ֵ
			}
		}

	}

}
