package Assignment;

public class UserInput {
	public static void main(String[] args) {
		int num,itt;
		num= Integer.parseInt(args[0]);//2
		itt = Integer.parseInt(args[1]);//10
		for(int i=1 ;i<=Integer.parseInt(args[1]);i++) {
			System.out.println(i*2);
		}
	}
}
