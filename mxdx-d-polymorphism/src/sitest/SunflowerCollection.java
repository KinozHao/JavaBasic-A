package sitest;

/**
* @apiNote ��������С��ϰ
* */

public class SunflowerCollection {
	public static void main(String[] args) {
		mathod(new liuke());
		mathod(new leke());
	}
	public static void mathod(kuihuabook s){//�������ø���
		s.begins();
	}

}
abstract class kuihuabook{		//������
	public abstract void begins();//���󷽷�
}
class liuke extends kuihuabook{	//�Ӽ̳и�
	public void begins(){		//override
		System.out.println("very hard for learning");
	}
}
class leke extends kuihuabook{	//�Ӽ̳и�
	public void begins(){		//override
		System.out.println("Not so hard also like to play");
	}
}