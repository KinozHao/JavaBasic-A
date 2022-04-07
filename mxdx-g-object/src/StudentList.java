//这是一个子类
class StudentList {
    private String name;
    private int age;
    public StudentList() {
    }
    public StudentList(String name, int age) {
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

    @Override
    public String toString() {      //重写toStringMethod把参数返回到ToString类中
        //在ToString类中进行打印即可
        return "StudentList{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

   /* public boolean equals(Object obj){
        StudentList k =(StudentList)obj;
        return this.age == age && this.name.equals(k.name);
    }*/

    @Override
    public boolean equals(Object o) { ;
        StudentList student = (StudentList) o;

        if (age != student.age) return false;

        return name.equals(student.name);
    }
}
