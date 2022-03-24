package Day3;

public class Switchcase {
	public static void main(String[] args) {
		String comment;
		int v =(int)(1);
		switch (v) {
		case 0: comment = "case 0";
				break;
		case 1: comment = "case 1";
				break;
		case 2: comment = "case 2";
				break;

		default:comment = "oops...something went wrong";
			break;
		}
		System.out.println(comment);
	}
}
