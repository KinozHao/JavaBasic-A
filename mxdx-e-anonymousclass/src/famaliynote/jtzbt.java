package famaliynote;

public class jtzbt {
    public static void main(String[] args) {
            int balance = 10000;
            boolean fg = true;
            String details = "收支\t账户金额\t收支金额\t说   明\n";
        while (fg){
            System.out.println("------------家庭收支记账软件--------------\n");
            System.out.println("             1 收支明细");
            System.out.println("             2 登记收入");
            System.out.println("             3 登记支出");
            System.out.println("             4 退出");
            System.out.print("             请选择<1-4>:");
            char selection = utility.readMenuSelection();

                switch (selection){
                    case '1':
                        System.out.println("------------当前收支明细表--------------");
                        System.out.println(details);
                        System.out.println("--------------------------------------");
                        break;
                    case '2':
                        System.out.println("本次收入金额:");
                        int addMoney = utility.readNumber();
                        System.out.println("本次收入说明:");
                        String addInfo = utility.readString();

                        balance += addMoney;
                        details +=("收支\t"+balance+"\t"+addMoney+"\t\t"+addInfo+"\n");
                        break;

                    case '3':
                        System.out.println("本次支出金额:");
                        int minusMoney = utility.readNumber();
                        System.out.println("本次支出说明:");
                        String minusInfo = utility.readString();

                        if (balance>= minusMoney){
                            balance -= minusMoney;
                            details +=("收支\t"+balance+"\t"+minusMoney+"\t\t"+minusInfo+"\n");
                        }else {
                            System.out.println("支出超出账户额度,支出失败");
                        }
                        break;
                    case '4':
                        System.out.println("是否确定退出Y/N?");
                        char isexit = utility.readConfirmSelection();
                        if (isexit == 'Y'){
                            fg = false;
                        }
                        break;
                }
            }
    }
}
