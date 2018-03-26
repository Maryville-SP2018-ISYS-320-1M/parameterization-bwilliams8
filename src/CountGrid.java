/*
	ISYS 320
	Name(s): Brian Williams
	Date: 3/25/2018
*/

public class CountGrid {
	
	public static void main(String[] args) {
		printGrid(4, 6);
	}
	
	public static void printGrid(int row, int column) {
		for(int count = 1; count <= row; count++) {
			int max = count + row * (column - 1);
			for(int number = count; number <= max; number += row) {
				System.out.print(number);
				if(number != max) {
					System.out.print(" ");
				}
			}
		System.out.println();
	}

		
}
	
	
}