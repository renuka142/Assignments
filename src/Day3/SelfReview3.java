package Day3;

public class SelfReview3 {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		for(short i=0;i<5;i++) {
			if((++a>2)||(++b>2)) {
				a++;
			}
		}
		System.out.println(a+" "+b);
	}
}
