package sitest;

/**
* @apiNote ��������С��ϰ
* */

public class SunflowerCollection {
	public static void main(String[] args) {
		//��̬������,new����������
		allMethod(new liuke());
		allMethod(new leke());
	}
	public static void allMethod(kuihuabook s){//�ѳ�������Ϊ�β�
		s.begins();
	}

}
abstract class kuihuabook{		//������
	public abstract void begins();//���󷽷�
}
class liuke extends kuihuabook{	//�Ӽ̳и�
	@Override
	public void begins(){
		System.out.println("very hard for learning");
	}
}
class leke extends kuihuabook{	//�Ӽ̳и�
	@Override
	public void begins(){
		System.out.println("Not so hard also like to play");
	}
}