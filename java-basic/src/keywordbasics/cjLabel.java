package keywordbasics;
//控制跳转标号
public class cjLabel {

	public static void main(String[] args) {
		fory: for(int a=1;a<=10;a++){//enter就是标号，只要是合法的标识符即可
			System.out.println("so a="+a);
			fore: for(int b=1;b<=10;b++){
				http://www.baidu.com  /*前者http是一个合法标号 后者为一个单行注释*/
				System.out.println("so b="+b);
				break fory;
			}
		}

	}

}
