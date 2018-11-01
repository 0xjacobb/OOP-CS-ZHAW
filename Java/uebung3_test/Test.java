package uebung3_test;

public class Test {
	
	public static void main(String[] args) {
		int[] intarr = new int[4];
		
		for (int i = 0; i < 8; i++) {
			
			try {
				intarr[i] = i;
				System.out.println(intarr[i]);
			}
			
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Fehler im Array");	
			}
		}
	}
}
