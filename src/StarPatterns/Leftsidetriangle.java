package StarPatterrs;

public class Leftsidetriangle {

	public static void main(String[] args) {
	
		int a=5; 
		for(int i=1;i<=a;i++) {
			for(int j=i;j<=a;j++)
			{
				System.out.print("  ");
			}
			for(int h=1;h<=i;h++ )
			{
				System.out.print("* ");
			}
			
		System.out.println();	
		}

	}

}
