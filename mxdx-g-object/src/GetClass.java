public class GetClass {
    public static void main(String[] args) {
        StudentList s=new StudentList("xiaohuia",13);
        Class clazz =s.getClass();   //获取对象的字节码文件
        String name=clazz.getName(); //获取名称
        System.out.println(name);
    }
}
