/*
	ISYS 320
	Name(s): Brian Williams
	Date: 3/25/2018
*/

public class P8_NumberPrinter {
	
	public static void main(String[] args) { 
		printNumbers(50);
		printStepRange(5, 2);
	}

	public static void printNumbers(int max) {
		for(int count = 1; count <= max; count++)
			System.out.print("[" + count + "] ");

	}
	
	public static void printStepRange(int max, int step) {
		for(int count = 1; count <= max; count += step)
			System.out.print("[" + count + "] ");
	}
	

}

