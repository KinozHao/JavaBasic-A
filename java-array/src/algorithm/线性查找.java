package algorithm;
//���Բ���=��������
public class ���Բ��� {
	public static void main(String[] args) {
		//1 ����һλ����
		int arr[] = {23, 57, 98, 32, 21};
		//2 Ҫ���ҵ�ֵ
		int arrvalue = 23;
		//3 �����﷨�ж�
		boolean isFlag = true;
		//4 ���������Ԫ�ضԱ�
		for (int i = 0; i < arr.length; i++) {
			//5 �ж��Ƿ��Ӧ
			//if (dest.equals(datas[i])){     //String��������ʹ��equals���������бȽ�
			if (arr[i] == arrvalue){
				System.out.println("The index is:"+i);
				isFlag = false;
				break;
			}
		}
		// 6 ������ӦisFlag�ǲ����ִ��������
		if (isFlag){
			System.out.println("not find the index.");
		}

	}

}
