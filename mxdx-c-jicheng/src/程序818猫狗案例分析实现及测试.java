public class 程序818猫狗案例分析实现及测试 {
	public static void main(String[] args) {
		cats s= new cats();
		s.eat();
		s.catchS();
		System.out.println(s.getcolors()+"..."+s.getlegs());
		cats s2=new cats("brrow",4);
		s.eat();
		s.catchS();
		System.out.println(s2.getcolors()+"..."+s2.getlegs());
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		dogs y=new dogs("black",4);
		y.eat();
		y.homes();
		System.out.println(y.getcolors()+"///"+y.getlegs());

	}
}
class Animalss{
	private String colors;
	private int legs;
	public Animalss(){
		
	}
	public Animalss(String colors,int legs){
		this.colors=colors;
		this.legs=legs;
	}
	public void setcolors(String colors){
		this.colors=colors;
	}
	public String getcolors(){
		return colors;
	}
	public void setlegs(int legs){
		this.legs=legs;
	}
	public int getlegs(){
		return legs;
	}
	public void eat(){
		System.out.println("the animals also love to eat things");
	}
}
class cats extends Animalss{
	public cats(){
		this("blue",4);
	}
	public cats(String colors,int legs){
		super(colors,legs);
	}
	public void catchS(){
		System.out.println(this.getcolors()+"the cat catch the Mouse");
	}
}
class dogs extends Animalss{
	public dogs(){}
	public dogs(String colors,int legs){
		super(colors,legs);
	}
	public void homes(){
		System.out.println("the dogs also can look the homes to pritective the security");
	}
}
