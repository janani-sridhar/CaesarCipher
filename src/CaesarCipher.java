/**
 *  Utilizes a Caesar Cipher to encrypt messages, testing the ShiftedAlpha Class.
 * @Janani Sridhar, June 4th, 2016
 */

import java.io.*;

public class CaesarCipher {

	public static void main(String[] args) {

		String buffer = new String();
		int key = 0;
		
		try {
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Please enter phrase: ");
			buffer = br.readLine();
			
			System.out.println("Please enter key: ");
			key = Integer.parseInt(br.readLine());
		}
		
		 catch (Exception e) {
			
		}

		
		ShiftedAlpha sa = new ShiftedAlpha (key);
		sa.shiftIt(key, buffer);

	}

}