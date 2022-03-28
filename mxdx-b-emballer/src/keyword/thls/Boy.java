package keyword.thls;

/**
 * @author kinoz
 * @date 2022/3/28 - 19:33
 * @apiNote 男孩类
 */
public class Boy {
    private String name;
    private int age;

    public Boy(String name,int age){
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


    public void marry(Girl girl){
        System.out.println("想和这个女孩结婚 "+girl.getName());
    }
    public void shout(){
        if (this.age >= 22){
            System.out.println("去登记结婚");
        }else {
            System.out.println("年纪太小，一边去");
        }
    }
}
