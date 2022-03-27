package duotai;
//this is a notepad when finished pls cls
public class ����textComputer {
	public static void main(String [] args){
	method(new asus(),new asuscst(),new thinkpad());
	}
	public static void method(asus a,asuscst b,thinkpad c){
		a.setbrand("asus666");
		a.setprice(3000);
		a.runs();
		System.out.println(a.getbrand()+"..."+a.getprice()+"$");
		System.out.println("________________________________");
		b.setbrand("asus 8888");
		b.setprice(15000);
		b.runs();
		b.redpoints();
		System.out.println(b.getbrand()+"..."+b.getprice()+"$");
		System.out.println("________________________________");
		c.setbrand("Thinkpad x1 cartan");
		c.setprice(17000);
		c.runs();
		c.redpoints();
		System.out.println(c.getbrand()+"..."+c.getprice()+"$");
		
	}
}
abstract class computer{	//������
	private String brand;	//˽�г�Ա����
	private int price;
	public computer(){}		//�ղι���
	public computer(String brand,int price){	//�вι���
		this.brand=brand;
		this.price=price;
	}
	public void setbrand(String brand){
		this.brand=brand;
	}
	public String getbrand(){
		return brand;
	}
	public void setprice(int price){
		this.price=price;
	}
	public int getprice(){
		return price;
	}
	public abstract void runs();
}
interface special{		//�ӿ�
	void redpoints();
}
class asus extends computer{	//�Ӽ̳и�
	public asus(){}
	public asus(String brand,int price){
		super(brand,price);
	}
	public void runs(){
		System.out.println("CPU:I5-6000K\t GPU:AMD R7340");

	}
}
class asuscst extends asus implements special{	//�Ӽ̳и� ʵ�ֽӿ�
	public asuscst(){}
	public asuscst(String brand,int price){
		super(brand,price);
	}
	public void redpoints(){				//�ӿ�ʵ��
		System.out.println("The asus cooperation with thinkpad get the redpoints");
		
	}
	public void runs(){					//abstract��ǿ����д����
		System.out.println("CPU:I9-9900HX\t GPU:NOVIDA TAITAN");
	}
}
class thinkpad extends computer implements special{
	public thinkpad(){}
	public thinkpad(String brand,int price){
		super(brand,price);
	}
	public void redpoints(){
		System.out.println("The redpoints is very canvenant");
	}
	public void runs(){
		System.out.println("CUP:I7-7000K\t GPU:I5-7000K");
	}
}