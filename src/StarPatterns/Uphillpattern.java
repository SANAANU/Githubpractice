package StarPatterrs;

public class Uphillpattern {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++) {
		
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<i;k++) {
				System.out.print("* ");
			}
			for(int h=1;h<=i;h++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
