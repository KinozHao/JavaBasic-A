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
	* ���βεĻ���û���βε�
	* �з���ֵ��Ҳ��û�з���ֵ��
	* */
	public void run(){		//���β�
		System.out.println("just do it.");
	}
	public void sleep(int time){	//���β�
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
