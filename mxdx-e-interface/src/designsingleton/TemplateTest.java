package designsingleton;

/**
 * @author kinoz
 * @date 2022/4/17 - 14:42
 * @apiNote ģ�����ģʽ��һ������
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template template = new SubTemplate();
        template.Code();
        template.spendTime();
    }
}
abstract class Template{
    //����ʱ�����������ȷ����
    public void spendTime() {
        long start = System.currentTimeMillis();
        Code();
        long end = System.currentTimeMillis();

        System.out.println("���ѵ�ʱ��Ϊ��"+(end-start));
    }

    //Code��������ǲ�ȷ���ľ�����Ҫ����ȥʵ��
    public abstract void Code();
}

class SubTemplate extends Template{
    @Override
    public void Code() {
        //���1000���ڵ�����
        for (int i = 2; i < 1000; i++) {
            boolean isFlag = true;
            for (int j = 2;j<Math.sqrt(i);j++){
                if (i % j == 0){
                    isFlag = false;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }
}
