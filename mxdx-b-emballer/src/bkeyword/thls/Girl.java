package bkeyword.thls;

/**
 * @author kinoz
 * @date 2022/3/28 - 19:33
 * @apiNote 女孩类
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
        System.out.println("我也要和这个男孩结婚"+boy.getName());
    }
    public int compare(Girl girl){  //如果有两个女孩的话 对她们的年龄进行比较
        return this.age - girl.age;
    }
}
