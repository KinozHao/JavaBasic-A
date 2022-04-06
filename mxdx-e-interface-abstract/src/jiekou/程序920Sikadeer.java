package jiekou;
public class ³ÌÐò920Sikadeer {
	public static void main(String[] args) {
			method1(new Sikadeer());
			method2(new JumpSikadeer());
	}
	public static void method1(Sikadeer a){
		a.eat();
		a.sleep();
		a.setname("Lucy");
		a.setage(20);
		System.out.println(a.getname()+"//"+a.getage());
	}
	public static void method2(JumpSikadeer b){
		b.eat();
		b.sleep();
		b.setname("Kite");
		b.setage(5000);
		System.out.println(b.getname()+"//"+b.getage());
	}
}
abstract class animals{
	private String name;
	private int age;
	public animals(){}
	public animals(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public void setage(int age){
		this.age=age;
	}
	public int getage(){
		return age;
	}
	public abstract void eat();
	public abstract void sleep();
}
interface juming{
	public abstract void jump();
}
class Sikadeer extends animals{
	public Sikadeer(){}
	public Sikadeer(String name,int age){
	super(name,age);
	}
	public void eat(){
		System.out.println("The Si Ka deer eat the green");
	}
	public void sleep(){
		System.out.println("The Si Ka deer also sleep at midnight");
	}
}
class JumpSikadeer extends Sikadeer implements juming{
	public JumpSikadeer(){}
	public JumpSikadeer(String name,int age){
	super(name,age);
	}
	public void eat(){
		System.out.println("The Si Ka deer JUMPING");
	}
	public void sleep(){
		System.out.println("The Si Ka deer SLEEP JUMPING");
	}
	public void jump(){
		System.out.println("This is a jumping SI KA DEER ");
	}
}