/**
* @apiNote ����ʱ������ڴ��������ʱ���ø�������ָ���������,
 * ֱ�Ӵ������������������ʹ�����������е����Ժ���Ϊ
* */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            package basic;

public class DuotBasicII {
	public static void main(String[] args) {

		DuotBasicII dii = new DuotBasicII();
		dii.func(new Japan());	//��������
		System.out.println();
		dii.func(new China());

	}

	public void func(Human human){	//�൱��peoples human = new Japan();
		human.food();		//�����Ϊ������д����ķ���
		human.person();

		if (human instanceof China){	//��������ת�� ȥ��������ķ���
			China cn = (China) human;
			cn.workHard();
		}

		if (human instanceof Japan){
			Japan jp = (Japan) human;
			jp.wordEasy();
		}
	}


}
class Human {
	public void person(){
		System.out.println("all of yours are person");
	}

	public void food(){
		System.out.println("a lot of food for you choose");
	}

	/** @apiNote
	 *  ��û�ö�̬����ϵ������ʲô���ͣ���newʲô���Ͷ���
	 * 	����Ҫд���������ط��������븴���Բ��ߣ��Ƚ�ӷ��
	 */
	public void fuc(Japan jp){
		jp.person();
		jp.food();
	}
	public void fuc(China cn){
		cn.person();
		cn.food();
	}
}
class Japan extends Human {
	public void person(){
		System.out.println("I,m japanese");
	}
	public void food(){
		System.out.println("We eat Sushi");
	}
	public void wordEasy(){
		System.out.println("URGENTLY_NEEDED IT engineer 10/6/5������");
	}
}
class China extends Human {
	public void person(){
		System.out.println("I,m Chinese");
	}
	public void food(){
		System.out.println("We eat dumping");
	}

	public void workHard(){
		System.out.println("�ھ� �ھ� Like 996.icu");
	}
}