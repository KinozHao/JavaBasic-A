package erarray;

public class Sum {
	/**
	 * 需求：公司年销售额总和
	 * 某公司按照季度和月份统计的数据如下：（单位：万元）
	 * 第一季度：22，66，44
	 * 第二季度：77，33，88
	 * 第三季度：25，45，65
	 * 第四季度：11，66，99
	 */
	public static void main(String[] args) {
		int [][]arr={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int last=0;			//定义变量记录每次相加的结果
		for(int j=0;j<arr.length;j++){	//获取每一个一维数组
			for(int k=0;k<arr[j].length;k++){//获取每一个一维数组中的元素
				last+=arr[j][k];		//累加
			}
		}
		System.out.println(last);

	}
	private static void sumExam() {	//总和问题
		//求总和
		//静态初始化
		int num [][] = {{3,5,8},{12,9},{7,0,6,4}};
		int sum = 0; //记录总和
		for (int i = 0; i <num.length ; i++) {
			for (int j = 0; j <num[i].length ; j++) {
				sum+=num[i][j];
			}
		}
		System.out.println("总和为:"+sum);
	}

}
