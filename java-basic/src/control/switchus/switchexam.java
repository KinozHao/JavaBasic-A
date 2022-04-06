package control.switchus;

public class switchexam {

	public static void main(String[] args) {
		int a=20;
		switch(a){
			case 10 :
				System.out.println(a+"trues");
				break;
			case 20 :
				System.out.println(a+"false");
				break;
			default :
				System.out.println(a+"is really good");
		}

		int week=8;
		switch(week){
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WES");
			break;
		case 4:
			System.out.println("Tur");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;
			default://this word can be to attention you mistake
				System.out.println("error running try again");
				break;
	}
	}

}
