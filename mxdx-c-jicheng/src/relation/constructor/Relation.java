package relation.constructor;
//�̳��й������Ĺ�ϵ
//������ǰ�����ں�
public class Relation {
	public static void main(String[] args) {
		rabbit s=new rabbit();
	}

}
class animal extends Object{	//����Ĭ�ϼ̳�Object��
	public animal(){
		super();	//���super�̳еľ���Object��
		System.out.println("����");
	}
}
class rabbit extends animal{
	public rabbit(){
		super();		//����һ�����,�����д,ϵͳĬ�ϼ���,�������ʸ����еĿղι���
		System.out.println("����");
	}
}