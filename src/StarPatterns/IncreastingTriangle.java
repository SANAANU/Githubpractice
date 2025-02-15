package StarPatterrs;

public class IncreastingTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p = 5; 
		for(int a=1;a<=p;a++) {
			
			for(int b=1; b<=a;b++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}

}

//outer for loop represent the row count
//Inner row represent the column count
