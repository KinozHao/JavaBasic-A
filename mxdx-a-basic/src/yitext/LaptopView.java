package yitext;

public class LaptopView {
//�������laptop���ܽ�
	public static void main(String[] args) {
		computer sc=new computer();
		sc.setPrice(3000);
		sc.setBrand("ThinkPad��X1��2018");
		System.out.println(sc.getBrand()+"..."+sc.getPrice()+"USD");
		sc.playgames();
		sc.seemovies();
		sc.forwork();
	}
}
class computer { //����ʼǱ���
	private String brand;//Ʒ��
	private int price;	//��Ǯ
	public void setBrand(String brand){
		this.brand=brand;//�ֲ�������ֵ����Ա����
	}
	public String getBrand(){
		return brand;//����ֵ
	}
	public void setPrice(int price){
		if(price>0&&price<3500){//if�ж���� ���������ִ��else���
		this.price=price;
		}else{
			System.out.println("To expensive i just have 3000USD FOR basic.computer");
		}
	}
	public int getPrice(){
		return price;
	}
	public void playgames(){//����Ϸ
		System.out.println("using thinkpad x1 play games");
	}
	public void seemovies(){//����Ӱ
		System.out.println("using thinkpad x1 see movies");
	}
	public void forwork(){//������
		System.out.println("Using thinkpad x1 for work");
	}
}
