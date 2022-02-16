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
    	
    	Scanner in2 = new Scanner(System.in);
    	System.out.println("Write message lower case and no spaces");
    	String message = in2.nextLine();
    	
    	char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    	
    	
    	char[] messageArray = new char[message.length()];
    	
    	for (int ab = 0; ab < message.length(); ab++) {
            messageArray[ab] = message.charAt(ab);
    	}

        char[] newMessage = new char[message.length()]; 
        
        
    	for (int bc = 0; bc < messageArray.length; bc++) {
    		for(int cd = 0; cd < alphabet.length; cd++) {
    			if(messageArray[bc]==alphabet[cd]) {	
    				newMessage[bc]= alphabet[cd + key];
    				
    			}
    			
    		}
    		
        
       
 
    			
    				System.out.println(newMessage);
    		
    				
    		}
    				
    		}
    	
      
    	
    	
    	  
    }
    
