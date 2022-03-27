package basic1;

public class OneObjectCar {

	public static void main(String[] args) {
		car a=new car();
		//调用属性
		a.color="Yellow";
		a.tire=4;
		a.brand="elite392a";
		//调用行为(方法)
		a.run();
	}

}
class car{
	String color;//车颜色
	int tire; //轮胎数
	String brand; //车牌
	public void run(){
		System.out.print(color+"/PORCHES911 tire:"+tire+brand+" ");
	}
}
