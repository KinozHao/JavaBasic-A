//equalsMethod解释:
//public boolean equals(Object obj) {
//        return (this == obj);
//    }
//Object类中的equals方法是比较地址值的,没有什么意义,我们需要重写他
//因为我们在开发中通常比较的是对象中的属性值,我们认为相同属性是一个对象
public class EqualsUs {
    public static void main(String[] args) {
        StudentList studentList1=new StudentList("Jony",21);
        StudentList studentList2=new StudentList("Jonys",21);

        boolean num=studentList1.equals(studentList2);    //比较两个对象是否相等

        System.out.println(studentList1 == studentList2);   //比较的是两个地址值
        System.out.println(num);    //重写之后比较的是属性值
    }
}
