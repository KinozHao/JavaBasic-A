package bkeyword.thls;

/**
 * @author kinoz
 * @date 2022/3/28 - 19:33
 * @apiNote Ů����
 */
public class Girl {
    private String name;
    private int age;

    public Girl(){

    }
    public Girl(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy){
        boy.marry(this);
        System.out.println("��ҲҪ������к����"+boy.getName());
    }
    public int compare(Girl girl){  //���������Ů���Ļ� �����ǵ�������бȽ�
        return this.age - girl.age;
    }
}
