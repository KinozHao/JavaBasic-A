/**
* @apiNote ����ʱ������ڴ��������ʱ���ø�������ָ���������,
 * ֱ�Ӵ������������������ʹ�����������е����Ժ���Ϊ
* */

import org.junit.Test;

public class DuotBasicII {
	@Test
	public void textChina(){	//����China�����
		DuotBasicII dl = new DuotBasicII();
		dl.FatherMethod(new China());
	}

	@Test
	public void textJapan(){	//����Japan�����
		DuotBasicII dl = new DuotBasicII();
		dl.FatherMethod(new Japan());
	}

	public void FatherMethod(Human human){
		human.person();		//����ΪHuman ʵ�����Ϊ�����Լ���д��ķ���
		human.food();

		////��������ת�� ȥ�����������еķ���
		if (human instanceof Japan){
			Japan jp = (Japan)human;
			jp.wordEasy();
		}

		if (human instanceof China){
			China cn = (China) human;
			cn.workHard();
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
		System.out.println("�Լ��ķ��� URGENTLY_NEEDED IT engineer 10/6/5������");
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
		System.out.println("�Լ��ķ��� �ھ� �ھ� Like 996.icu");
	}
}