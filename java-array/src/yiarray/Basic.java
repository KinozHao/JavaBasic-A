package yiarray;
import java.util.Arrays;

public class Basic {

	public static void main(String[] args) {

		//1 ����ĸ���
		int [] aa = new int[3];	//����Ķ�̬��ʼ��
		aa[1] = 10;			//����ĵڶ���������ֵ
		System.out.println(aa[1]);

		String[] dd = new String[100];	//����Ķ�̬��ʼ��
		dd[3] = "������ײ�";		//����ĵ�������������ֵ
 		System.out.println(dd[3]);
		//�ܽᣬ����һ����ʼ����ɣ��䳤�Ⱦ͹̶���



		//2 ����ı���
 		String[] menu = {"��dd","Сdd","bigais","littleais"};
		//1 ����arrays�е�toString����
		System.out.println("arrays����:"+Arrays.toString(menu));
		//2 ����forѭ�����б�������
		for (int i = 0; i <menu.length ; i++) {
			System.out.print(menu[i]+" ");
		}
		System.out.println();

		//����ĳ���
		System.out.println(menu.length);


	}
}