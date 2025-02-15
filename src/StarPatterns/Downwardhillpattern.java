package StarPatterrs;

public class Downwardhillpattern {

	public static void main(String[] args) {
	
		int n =5; 
		for(int i =1; i<=n;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			
		for(int k=i;k<=5;k++)
		{
			System.out.print("* ");
		}
			
		for(int h=i;h<n;h++) {
			
			System.out.print("* ");
		}
			System.out.println();
		}

	}

}
