package binterface;

public class ����916�ӿڵĸ��� {
	public static void main(String[] args) {
		//jeiko s=new jieko();				//�ӿڲ��ܱ�ʵ����,��Ϊ���ó��󷽷�û������
		jeiko s=new jiezhe();				//��������ָ��������� //���뿴�� ���п���	
		s.eat();							//�ӿڵ�ʵ�������ö�̬�ķ�ʽ����
	}
}
interface jeiko{
	public abstract void eat();			//�ӿ��еķ������ǳ����
}
class jiezhe implements jeiko{			//���Զ���Ϊ�����൫�����岻��
	public void eat(){
		System.out.println("all of us like eat ");
	}	
}
