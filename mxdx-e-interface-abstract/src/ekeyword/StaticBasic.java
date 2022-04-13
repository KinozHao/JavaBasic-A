package ekeyword;

import org.junit.Test;

/**
 * @apiNote static关键词使用
 * */

public class StaticBasic {

	@Test
	public void countryTest() {
		//National.COUNTRY = "中国";	//静态变量可用类名调用

		National national = new National();
		national.name = "吕威";
		national.info();

		National national2 = new National();
		national2.name = "成周州";
		national2.info();
	}



}
class National {
	String name;
	static String COUNTRY;	//静态变量
	public void info(){
		System.out.println("姓名:"+ name + " 国籍:"+ COUNTRY);
	}
}
