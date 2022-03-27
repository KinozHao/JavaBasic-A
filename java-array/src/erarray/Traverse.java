package erarray;
//二维数组的遍历
public class Traverse {

	public static void main(String[] args) {
		int [][] a={{1,2,3},{10,20,30},{1,3,5}};
		for(int x=0;x<a.length;x++){//获取到每个二维数组中的一维数组
			for(int y=0;y<a[x].length;y++){//获取到每个一维数组中的元素
				System.out.print(a[x][y]+ " ");/**二维数组在打印中是使用到了for的嵌套循环模式**/
			}
		System.out.println();
		}

	}

}
