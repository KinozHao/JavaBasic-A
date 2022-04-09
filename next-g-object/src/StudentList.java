//����һ������
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
    public String toString() {      //��дtoStringMethod�Ѳ������ص�ToString����
        //��ToString���н��д�ӡ����
        return "StudentList{" + "name='" + name + '\'' + ", age=" + age + '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentList that = (StudentList) o;
        return age == that.age &&
                name.equals(that.name);
    }

    //�ֶ�ʵ��
    //��д��ԭ��:�Ƚ����������ʵ�������Ƿ���ͬ(��name��age)
/*    public boolean equals(Object obj){
        //�Ƚϵ��ǵ�ַ����ͬ�ͷ���true
        if (this == obj){
            return true;
        }

        if (obj instanceof StudentList) {
            StudentList slt = (StudentList) obj;
            //&&���a��b����true �򷵻�true
            //�Ƚ���������������Ƿ���ͬ ǰ��ageΪ������������ ����nameΪ������������
            return this.age == age
                    &&
                    this.name.equals(slt.name);
        }
        return false;
    }*/

}
