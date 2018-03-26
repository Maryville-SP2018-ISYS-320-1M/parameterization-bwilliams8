/*
	ISYS 320
	Name(s): Brian Williams
	Date: 3/25/2018
*/

/*
 1. Your output prediction:
   15, 42
   10, 25
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
   Yes / partially. I expected it to print as if they were coordinates, but in order for that to happen, the sentence method would need the string to include a comma.
 
 */

public class P1_MysteryNums {
    public static void main(String[] args) {
        int x = 15;
        sentence( x, 42 );
        
        int y = x - 5;
        sentence( y, x + y);
    }
    
    public static void sentence( int num1, int num2 ) {
        System.out.println( num1 + " " + num2 );
    }



}
