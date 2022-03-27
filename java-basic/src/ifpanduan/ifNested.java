package ifpanduan;
//ifµÄÇ¶Ì×ÓÃ·¨
public class ifNested {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		if(a>b){
			if(a>c){
				System.out.println(a+"is the max");
			}else{
				System.out.println(c+"is the max");
			}
		}else{
			if(b>c){
				System.out.println(b+"it was the max");
			}else{
				System.out.println(c+"is the max one");
			}
		}
	}

}
