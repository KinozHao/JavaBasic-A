package basic1;

public class OneObjectCar {

	public static void main(String[] args) {
		car a=new car();
		//��������
		a.color="Yellow";
		a.tire=4;
		a.brand="elite392a";
		//������Ϊ(����)
		a.run();
	}

}
class car{
	String color;//����ɫ
	int tire; //��̥��
	String brand; //����
	public void run(){
		System.out.print(color+"/PORCHES911 tire:"+tire+brand+" ");
	}
}
