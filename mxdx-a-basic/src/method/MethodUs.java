package method;

public class MethodUs {

	public static void main(String[] args) {
		cor huoqu = new cor();
		huoqu.color="red";
		huoqu.number=4;
		huoqu.run();
		huoqu.sleep(30);
		huoqu.getColor();
		String ct = huoqu.getNation("Sudo");
		System.out.println(ct);
	}

}
class cor{
	String color;
	int number;
	/*
	* 有形参的还有没有形参的
	* 有返回值的也有没有返回值的
	* */
	public void run(){		//无形参
		System.out.println("just do it.");
	}
	public void sleep(int time){	//有形参
		System.out.println("sleep "+time+" minutes");
	}
	public String getColor(){
		return color;
	}
	public String getNation(String nation){
		String infos = "Tom nation is:"+nation;
		return infos;
	}

}
