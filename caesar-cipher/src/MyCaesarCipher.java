/* *****************************************************************************
 *              ALL STUDENTS COMPLETE THESE SECTIONS
 * Title:            (program's title)
 * Files:            (list of source files)
 * Semester:         Spring 2021
 * 
 * Author:           (your name and email address)
 * 
 * Description:		 (a short description of the program)
 * 
 * Written:       	 (date)
 * 
 * Credits:          (list anyone or any resource that helped you write your program)
 **************************************************************************** */


/**
 * (Write a succinct description of this class here.  You should avoid 
 * wordiness and redundancy.  If necessary, additional paragraphs should 
 * be preceded by <p>, the html tag for a new paragraph.)
 *
 * <p>Bugs: (a list of bugs and other problems)
 *
 * @author (your name)
 */
import java.util.Scanner;
public class CaesarCipher {
	
	/**         
     * (Write a succinct description of this method here.  If necessary, 
     * additional paragraphs should be preceded by <p>, the html tag for 
     * a new paragraph.) For the main method, its enough to say something like
     * "Main entry point for the program" or "Does [x]" where x is a simple
     * description of the program.
     * 
     * this program is meant to cipher a message that you input with a key that you also imput
     * it does this by assigning numbers to the alphabet and then adding the key to thoes numbers
     * and the larger number also coresponds to a letter in the alphabet and then it outputs 
     * the encripted message
     * 
     * https://www.edureka.co/blog/character-array-in-java/
     *
     * @param args (Describe expected command-line arguments (if any) here; 
     * 			   if none expected, write "No command-line arguments expected")
     */
    public static void main(String[] args) {
    	
    	// YOUR CODE HERE
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter an int:");
    	int key = in.nextInt();
    	
    	Scanner message = new Scanner(System.in);
    	System.out.println("Write message lower case and no spaces");
    	
    	String Amessage = message.nextLine();
    	
    	char[] array = Amessage.toCharArray();
    	for(char TheMessage : array) {
    		int a = 0;
        	int b = 1;
        	int c = 2;
        	int d = 3;
        	int e = 4;
        	int f = 5;
        	int g = 6;
        	int h = 7;
        	int i = 8;
        	int j = 9;
        	int k = 10;
        	int l = 11;
        	int m = 12;
        	int n = 13;
        	int o = 14;
        	int p = 15;
        	int q = 16;
        	int r = 17;
        	int s = 18;
        	int t = 19;
        	int u = 20;
        	int v = 21;
        	int w = 22;
        	int x = 23;
        	int y = 24;
        	int z = 25;
    		for (int ab=0; ab < TheMessage.length; ab++) {
    			char[] NewMessage = new char[TheMessage.length];
    			NewMessage[ab] = TheMessage[ab] + key;
    			if (NewMessage[ab] <= 25) {
    				char[] finalMessage = new char[NewMessage.length];
    				finalMessage[ab] = NewMessage[ab];
    			}
    			else {
    				finalMessage[ab] = NewMessage[ab] - 25;
    			}
    			
    				System.out.println(finalMessage);
    		
    				
    		}
    				
    		}
    	
      
    	
    	
    	  
    }
    
}