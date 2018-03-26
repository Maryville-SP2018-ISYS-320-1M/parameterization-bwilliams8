/*
	ISYS 320
	Name(s): Brian Williams
	Date: 3/25/2018
*/

/*
 4. Your output prediction:
  
  //Touch your head to your eye
   * I'm a bit confused about the syntax. I believe that as below i've reconstructed what the output is going to be, however the syntax eludes me and this is what i originally believed the first line to be.
  Touch your eye to your head
  Touch your head to your eye
  Touch your shoulders to your elbow
  Touch your eyes and ears to your eyes and ears
  Touch your toes to your toes
  Touch your shoulders to your knees + toes
  
 */

/*
 6. Were you correct? Explain if you were not (what did you learn?)
 	All correct barring the last one, which is simply "knees toes".
 
 */

public class P4_MysteryTouch {
    public static void main(String[] args) {
        String head = "shoulders";
        String knees = "toes"; 
        String elbow = "head";
        String eye = "eyes and ears";
        String ear = "eye"; 
        
        touch(ear, elbow);
        touch(elbow, ear); 
        touch(head, "elbow"); 
        touch(eye, eye);
        touch(knees, "Toes"); 
        touch(head, "knees " + knees );
    }
    
    public static void touch(String elbow, String ear) { 
        System.out.println( "touch your " + elbow + " to your " + ear );
    }


}
