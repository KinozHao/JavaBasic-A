package famaliynote;

public class jtzbt {
    public static void main(String[] args) {
            int balance = 10000;
            boolean fg = true;
            String details = "��֧\t�˻����\t��֧���\t˵   ��\n";
        while (fg){
            System.out.println("------------��ͥ��֧�������--------------\n");
            System.out.println("             1 ��֧��ϸ");
            System.out.println("             2 �Ǽ�����");
            System.out.println("             3 �Ǽ�֧��");
            System.out.println("             4 �˳�");
            System.out.print("             ��ѡ��<1-4>:");
            char selection = utility.readMenuSelection();

                switch (selection){
                    case '1':
                        System.out.println("------------��ǰ��֧��ϸ��--------------");
                        System.out.println(details);
                        System.out.println("--------------------------------------");
                        break;
                    case '2':
                        System.out.println("����������:");
                        int addMoney = utility.readNumber();
                        System.out.println("��������˵��:");
                        String addInfo = utility.readString();

                        balance += addMoney;
                        details +=("��֧\t"+balance+"\t"+addMoney+"\t\t"+addInfo+"\n");
                        break;

                    case '3':
                        System.out.println("����֧�����:");
                        int minusMoney = utility.readNumber();
                        System.out.println("����֧��˵��:");
                        String minusInfo = utility.readString();

                        if (balance>= minusMoney){
                            balance -= minusMoney;
                            details +=("��֧\t"+balance+"\t"+minusMoney+"\t\t"+minusInfo+"\n");
                        }else {
                            System.out.println("֧�������˻����,֧��ʧ��");
                        }
                        break;
                    case '4':
                        System.out.println("�Ƿ�ȷ���˳�Y/N?");
                        char isexit = utility.readConfirmSelection();
                        if (isexit == 'Y'){
                            fg = false;
                        }
                        break;
                }
            }
    }
}
