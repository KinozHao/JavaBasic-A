package dkeyword;

/**
*@apiNote ����ת��instanceof�ؼ��ʵ�����
 * �������Ϊ�˽�����ȥ���������Լ�������/����
 * ������ʹ��Ƶ�ʽ���
* */

public class InstanceofUs {
	public static void main(String[] args) {
		Watch watch = new TraditionWatch();
		watch.seeTime();
		watch.collect();
		System.out.println("----����Ϊ�����Ķ�̬�ṹ----");
		System.out.println("----��Ϊinstanceof��ʹ�ã������������Լ��������ԵĽ���취");
		/**
		 * @apiNote ǿ������ת�������������ʹ�������Լ����������,����һ������
		 * ���ܻ����ClassCastException

		TraditionWatch tdw =(TraditionWatch)watch;	//תΪTraditionWatch����
		tdw.crafts();

		SmartWatch swh = (SmartWatch)watch;	//תΪSmartWatch����
		swh.fashion();
		 */

		if (watch instanceof TraditionWatch){	//�ж�watch�ǲ���TraditionWatch��ʵ��
			TraditionWatch tdw =(TraditionWatch) watch;
			tdw.crafts();	//��������Լ����еķ���
		}
		if (watch instanceof SmartWatch){
			SmartWatch swh = (SmartWatch) watch;
			swh.fashion();
		}

	}

}

class Watch {
	String brand;
	int id;

	public void seeTime(){
		System.out.println("�ֱ��ܿ�ʱ��");
	}

	public void collect(){
		System.out.println("�ֱ������ղ�");
	}
}

class TraditionWatch extends Watch{
	int price;

	@Override
	public void seeTime() {
		System.out.println("�ǳ���׼�Ĵ�ͳ����ʱ�䷽ʽ");
	}

	@Override
	public void collect() {
		System.out.println("��ͳ�ֱ��׳����弫��");
	}

	public void crafts(){
		System.out.println("���վ��棬��ݵ�����");
	}
}

class SmartWatch extends Watch{
	int money;

	@Override
	public void seeTime() {
		System.out.println("�ִ�Һ��������");
	}

	@Override
	public void collect() {
		System.out.println("ûʲô�ղ����壬ÿ�궼Ҫ��̭");
	}

	public void fashion(){
		System.out.println("�ǳ������У������˸���");
	}
}
