/**
 * @author kinoz
 * @date 2022/3/26 - 18:24
 * @apiNote
 * ��װ������(����ͬ��װ�Ա���)
 * ������˽�л���ͬʱ ��Ҫ�ṩ�����ķ�������ȡ�����ô����Ե�ֵ
 * ����xxx ��ȡ����getxxx ����setxxx
 */
public class EmballerBasic {
    public static void main(String[] args) {
        cat c =new cat();
        //�÷������ξ����ֳ��˷�װ��
        c.setleg(8);    //��ʱ legΪprivateȨ�޲���ֱ�ӵ���
        c.getleg();

        c.setAge(23);
        c.getAge();
        c.info();
    }
}
class cat{
    private int age;
    private int leg;    //ͨ�����Ե�˽�л������ֳ��˷�װ��
    //set��get���ɶ����ԵĻ�ȡ
    public void setleg(int l){
        if (l > 0 && l%2==0){
            leg = l;
        }else {
            leg = 0;
        }
    }
    public int getleg(){
        return leg;
    }

    public void setAge(int a){
        if (a > 0 && a<30){
            age = a;
        }else {
            age = 0;
        }
    }
    public int getAge(){
        return  age;
    }


    public void info(){
        System.out.println("age:"+age+"\tlegs:"+leg);
    }
}
