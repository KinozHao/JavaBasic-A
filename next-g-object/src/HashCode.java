/**
 * @author kinoz
 * @date 2022/4/9 - 17:53
 * @apiNote ���彲���ڷ��䲿��
 */
public class HashCode {
    public static void main(String[] args) {
        Object ob=new Object();         //New Object
        int hashCode=ob.hashCode();     //Types:Int
        //Print twice have the same addnums
        System.out.println(hashCode);   //Print result is a addnums
        System.out.println(hashCode);   //Print result is a addnums
    }
}
