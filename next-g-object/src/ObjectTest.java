import objtest.Order;

/**
 * @author kinoz
 * @date 2022/4/9 - 17:53
 * @apiNote object��ĸ���
 */
public class ObjectTest {
    public static void main(String[] args) {
        Order order = new Order(30,"��");
        Order orders = new Order(30,"��");
        System.out.println(order.equals(orders));

        //��ȡOrder��ĸ������
        System.out.println(order.getClass().getSuperclass());
    }
}

