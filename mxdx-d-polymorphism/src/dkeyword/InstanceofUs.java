package dkeyword;

/**
*@apiNote 向下转型instanceof关键词的体现
 * 具体就是为了解决如何去调用子类自己的属性/方法
 * 开发中使用频率较少
* */

public class InstanceofUs {
	public static void main(String[] args) {
		Watch watch = new TraditionWatch();
		watch.seeTime();
		watch.collect();
		System.out.println("----上面为正常的多态结构----");
		System.out.println("----下为instanceof的使用，即调用子类自己方法属性的解决办法");
		/**
		 * @apiNote 强制类型转换符，解决不能使用子类自己对象的问题,具有一定风险
		 * 可能会出现ClassCastException

		TraditionWatch tdw =(TraditionWatch)watch;	//转为TraditionWatch类型
		tdw.crafts();

		SmartWatch swh = (SmartWatch)watch;	//转为SmartWatch类型
		swh.fashion();
		 */

		if (watch instanceof TraditionWatch){	//判断watch是不是TraditionWatch的实例
			TraditionWatch tdw =(TraditionWatch) watch;
			tdw.crafts();	//子类调用自己特有的方法
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
		System.out.println("手表都能看时间");
	}

	public void collect(){
		System.out.println("手表都可以收藏");
	}
}

class TraditionWatch extends Watch{
	int price;

	@Override
	public void seeTime() {
		System.out.println("非常精准的传统计算时间方式");
	}

	@Override
	public void collect() {
		System.out.println("传统手表首场意义极高");
	}

	public void crafts(){
		System.out.println("工艺精益，身份的象征");
	}
}

class SmartWatch extends Watch{
	int money;

	@Override
	public void seeTime() {
		System.out.println("现代液晶屏工艺");
	}

	@Override
	public void collect() {
		System.out.println("没什么收藏意义，每年都要淘汰");
	}

	public void fashion(){
		System.out.println("非常的流行，年轻人更爱");
	}
}
