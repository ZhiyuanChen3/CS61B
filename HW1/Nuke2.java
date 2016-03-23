/* Nuke2.java */

import java.io.*;
public class Nuke2{

	public static void main(String[] args) throws Exception {

		BufferedReader keyboard;
		String inputLine;

		keyboard = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please enter a string:");
		System.out.flush();

		/* Potentially cause exception so plz add "throws Exception" */
		inputLine = keyboard.readLine();

		/* Print the same string with its 2nd char. removed
                 * substring(int beginIndex, int endIndex) 
                 * substring produced should start from beginIndex to endIndex-1
                 */
		String head = inputLine.substring(0, 1);
		String tail = inputLine.substring(2, inputLine.length());
		System.out.println(head + tail);
	}

}
