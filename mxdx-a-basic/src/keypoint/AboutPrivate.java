package keypoint;

public class AboutPrivate {

	public static void main(String[] args) {
		maker o=new maker();
		o.name="Javes";//����name���Բ����丳ֵ
		o.setAge(1008888);//�趨����Ϊ1998
		o.runs();//������Ϊ
		System.out.println(o.getAge());

	}

}
class maker{
	String name; //����
	private int age; //����  ��������з�װ
	public void setAge(int a){//�趨����
		if(a>0&&a<=150){//if������ж�
		age=a;
		}else{
			for(;;){//�жϴ����ٷ�Χ�� for����ѭ��
				System.out.println("�����ǲ��Ǹ���Ӵ��");
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
