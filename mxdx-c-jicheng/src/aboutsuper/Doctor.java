package aboutsuper;

/**
 * @author kinoz
 * @date 2022/4/4 - 18:33
 * @apiNote �̳�Humans��ҽ����
 */
public class Doctor extends Humans {
    String major;
    long id = 21421223; //����

    public Doctor(){ super();}

    public Doctor(String major){
        this.major = major;
    }

    public Doctor(String name, int age, String major) {
        super(name, age);       //super��ȡ���๹�������β�
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("Doctor eat at hospital dining hall(����)");
    }

    public void aboutEat(){
        this.eat();     //��д���eat����
        super.eat();    //����Ĭ�ϵ�eat����
    }

    public void docInfo(){
        System.out.println("����:"+name+" ����:"+age);
        System.out.println("ҽԺ����: "+ this.id );
        System.out.println("���֤��: "+ super.id);  //SUPER���ֺ�����ͬ��������
    }

}
