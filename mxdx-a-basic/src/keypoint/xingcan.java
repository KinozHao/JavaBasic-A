package keypoint;

/*
* ʲô���β�
* д�ڷ���()��� д�ڷ���{}���
* ͬʱ�β�Ҳ�Ǿֲ�����
* */
public class xingcan {
	//��������ʽ����������ʱ��ε���
	public static void main(String[] args) { 
		people s=new people();
		print(s);
		//print(10);
	}
	/*public static void print(int x){
		System.out.println(x);
	}*/
	public static void print(people stu){
		stu.name="Carzy";
		stu.age=19;
		stu.speak();
		
	}

}
class people{
	String name;
	int age;
	public void speak(){
		System.out.println(name+"..."+age);
		String city = "tokyo";	//�ֲ������޳�ʼ��ֵ �踳ֵ
		System.out.println("city: "+city);
	}
}
