package shunxianFlower;
//使用循环结构for输出水仙花一共有几个数
public class wfForHow {
	public static void main(String[] args) {
		int go=0;
		for(int i=100;i<1000;i++){
		int ge=i %10;
		int shi=i / 10 % 10;
		int bai=i/100;
		if(i == ge*ge*ge+shi*shi*shi+bai*bai*bai){
			go++;
	}
	}
		System.out.println(go);
	}

}
