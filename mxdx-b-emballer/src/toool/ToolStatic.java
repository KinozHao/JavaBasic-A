package toool;

public class ToolStatic {
	//�����������еķ������Ǿ�̬�� 
	//���һ���������Եķ������Ǿ�̬�ģ���Ҫ�ڶ���һ����˽�й��췽��
	//Ŀ���ǲ��������ഴ���������ֱ��������.���ü���
	public static void main(String[] args) {
		int [] arr={11,22,33,44,55};
		tools at=new tools();
		int a=at.getMax(arr);//�����ֵ��ֵ��a
		System.out.println(a);//��ӡa�����ֵ��
		System.out.println("-----------------------");
		at.print(arr);//���ù������е�����ı�������		��ӡ
		System.out.println();
		System.out.println("-----------------------");
		at.revArry(arr);
		at.print(arr);		//��ת
		//text2.getmax(arr);
	}
}
