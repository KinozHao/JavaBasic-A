package keypoint;

public class AboutPrivate {

	public static void main(String[] args) {
		maker o=new maker();
		o.name="Javes";//调用name属性并对其赋值
		o.setAge(1008888);//设定年龄为1998
		o.runs();//调用行为
		System.out.println(o.getAge());

	}

}
class maker{
	String name; //姓名
	private int age; //年龄  对年龄进行封装
	public void setAge(int a){//设定年龄
		if(a>0&&a<=150){//if语句做判断
		age=a;
		}else{
			for(;;){//判断错误不再范围后 for的死循环
				System.out.println("你怕是不是个人哟。");
			}
		}
	}
	public int getAge(){
		return age;
	}
	public void runs(){
		System.out.println("my name is "+name+"i,m"+age);
	}
}
