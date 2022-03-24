package Day3;

public class TwoDArrayDemo {
	public static void main(String[] args) {
		int one[][]= {{1,1,1},{1,1,1}};
		int two[][] = {{2,2,2},{2,2,2}};
		int sum[][] = new int[2][3];
		
		for(int i=0 ;i<2;i++) {
			for(int j=0 ;j<3 ;j++)
				sum[i][j] = one[i][j] + two[i][j];
		}
		for(int i=0 ;i<2;i++) {
			for(int j=0 ;j<3 ;j++)
				System.out.print(sum[i][j]);
			System.out.println();
		}
	}
}
