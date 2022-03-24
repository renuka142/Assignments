package Day3;

public class Assignment8 {
	static int i=22;
	static int j=14000;
	static boolean k;
	static boolean l;
	public static void main(String[] args) {
		i=35;
		j=14000;
		Assignment8 class1 = new Assignment8();
		k=class1.Method1(i);
		l=class1.Method2(j);
		if(k==true && l==true) {
			System.out.println("is a new employee");
		}else {
			System.out.println("is not a new employee");
		}
		
	}
	public static boolean Method1(int i) {
		if(i>20 && i<30) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean Method2(int j) {
		if(j>=14000 && j<20000)
			return true;
		else
			return false;
	}
}
