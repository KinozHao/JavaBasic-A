package aboutsuper;

/**
 * @author kinoz
 * @date 2022/4/4 - 18:25
 * @apiNote super的具体使用，以及和属性，方法，构造器的关系
 */
public class DoctorView {
    public static void main(String[] args) {
        Doctor doc = new Doctor();  //子类构造器会去访问父类构造器,若这个构造器有输出语句则会输出
        doc.aboutEat();

        System.out.println("------------------------------");

        Doctor doc2 = new Doctor("李大伟",20,"眼科主任");
        doc2.docInfo();
    }

}
