package erarray;
//��ά����ı���
public class Traverse {

	public static void main(String[] args) {
		int [][] a={{1,2,3},{10,20,30},{1,3,5}};
		for(int x=0;x<a.length;x++){//��ȡ��ÿ����ά�����е�һά����
			for(int y=0;y<a[x].length;y++){//��ȡ��ÿ��һά�����е�Ԫ��
				System.out.print(a[x][y]+ " ");/**��ά�����ڴ�ӡ����ʹ�õ���for��Ƕ��ѭ��ģʽ**/
			}
		System.out.println();
		}

	}

}
