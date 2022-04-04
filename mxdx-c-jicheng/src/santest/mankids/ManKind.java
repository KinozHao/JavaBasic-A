package santest.mankids;

/**
 * @author kinoz
 * @date 2022/4/4 - 14:36
 * @apiNote
 */
public class ManKind {
    private int sex;
    private int salary;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ManKind(){

    }

    public ManKind(int sex,int salary){
        this.sex = sex;
        this.salary = salary;
    }

    public void manOrWoman(){
        if (sex == 1){
            System.out.println("is a little boy");
        }else if (sex == 0){
            System.out.println("is a little girl");
        }
    }

    public void employeed(){
        String jobInfo = (salary == 0)? "no job":"job";
        System.out.println(jobInfo);
    }
}


