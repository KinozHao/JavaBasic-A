package keyword.thls;

/**
 * @author kinoz
 * @date 2022/3/28 - 19:49
 * @apiNote 关于男孩女孩的测序h
 */
public class SexTest {
    public static void main(String[] args) {
        Boy by = new Boy("Jack",22);
        by.shout();

        Girl gl = new Girl("Kim",22);
        gl.marry(by);

        Girl gl2 =new Girl("Lisa",17);
        int compare = gl.compare(gl2);
        if (compare > 0){
            System.out.println(gl.getName()+" big");
        }else  if (compare < 0){
            System.out.println(gl2.getName()+" big");
        }else{
            System.out.println("same age");
        }
    }
}
