package erarray;

public class Sum {
	/**
	 * ���󣺹�˾�����۶��ܺ�
	 * ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£�����λ����Ԫ��
	 * ��һ���ȣ�22��66��44
	 * �ڶ����ȣ�77��33��88
	 * �������ȣ�25��45��65
	 * ���ļ��ȣ�11��66��99
	 */
	public static void main(String[] args) {
		int [][]arr={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int last=0;			//���������¼ÿ����ӵĽ��
		for(int j=0;j<arr.length;j++){	//��ȡÿһ��һά����
			for(int k=0;k<arr[j].length;k++){//��ȡÿһ��һά�����е�Ԫ��
				last+=arr[j][k];		//�ۼ�
			}
		}
		System.out.println(last);

	}
	private static void sumExam() {	//�ܺ�����
		//���ܺ�
		//��̬��ʼ��
		int num [][] = {{3,5,8},{12,9},{7,0,6,4}};
		int sum = 0; //��¼�ܺ�
		for (int i = 0; i <num.length ; i++) {
			for (int j = 0; j <num[i].length ; j++) {
				sum+=num[i][j];
			}
		}
		System.out.println("�ܺ�Ϊ:"+sum);
	}

}
