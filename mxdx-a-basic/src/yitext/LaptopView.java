package yitext;

public class LaptopView {
//面向对象laptop类总结
	public static void main(String[] args) {
		computer sc=new computer();
		sc.setPrice(3000);
		sc.setBrand("ThinkPad·X1·2018");
		System.out.println(sc.getBrand()+"..."+sc.getPrice()+"USD");
		sc.playgames();
		sc.seemovies();
		sc.forwork();
	}
}
class computer { //定义笔记本类
	private String brand;//品牌
	private int price;	//价钱
	public void setBrand(String brand){
		this.brand=brand;//局部变量赋值给成员变量
	}
	public String getBrand(){
		return brand;//返回值
	}
	public void setPrice(int price){
		if(price>0&&price<3500){//if判断语句 如果超出则执行else语句
		this.price=price;
		}else{
			System.out.println("To expensive i just have 3000USD FOR basic.computer");
		}
	}
	public int getPrice(){
		return price;
	}
	public void playgames(){//打游戏
		System.out.println("using thinkpad x1 play games");
	}
	public void seemovies(){//看电影
		System.out.println("using thinkpad x1 see movies");
	}
	public void forwork(){//工作用
		System.out.println("Using thinkpad x1 for work");
	}
}
