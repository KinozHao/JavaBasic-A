package erarray;
public class Initialization {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        System.out.println(arr[0]); //adds  一维
        System.out.println(arr);    //adds 二维
        System.out.println(arr[0][0]);  //0
        System.out.println("**********************");

        String arr2[][] = new String[2][3];
        System.out.println(arr2[0]);    //adds 会带上java.lang.String
        arr2[1][1] = "go";
        System.out.println(arr2[1][1]);
        System.out.println("**********************");

        double arr3[][] = new double[3][];
        System.out.println(arr3[2]);
        //System.out.println(arr3[2][3]);     //java.lang.NullPointerException

        //dynamicUsed();


    }

    private static void dynamicUsed() {
        double arr4[][] = new double[4][4];     //1创建二维数组
        double arr44[] = {1.3,23.4,53.4,32,2,74,25};    //2创建一维数组
        arr4[0] = arr44;        //3把一位数组赋值给二维数组的第一个空间
        //4 二维数组的遍历
        for (int i = 0; i <arr4.length ; i++) {
            for (int j = 0; j <arr4[i].length ; j++) {
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }
    }
}
