class ShiftedAlpha {
	
//	Static and Instance Variables
	private int key;
	private String encrCAP = new String();
	private String encrLOW = new String();

	private static String origCAP = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	private static String origLOW = new String("abcdefghijklmnopqrstuvwxyz");

//	Constructor
	public ShiftedAlpha(int key) {
		this.key = key;
		this.encrCAP = alphaCAP(this.key);
		this.encrLOW = alphaLOW(this.key);
	}

//	METHOD 1: alphaCAP -- encrypts the uppercase alphabet
	private String alphaCAP(int key) {

		String encrCAP = origCAP.substring(key, origCAP.length());
		encrCAP += origCAP.substring(0, key);
		return encrCAP;
	}

//	METHOD 2: alphaLOW -- encrypts the lowercase alphabet
	private String alphaLOW(int key) {

		String encrLOW = origLOW.substring(key, origLOW.length());
		encrLOW += origLOW.substring(0, key);
		return encrLOW;
	}

//	METHOD 3: shiftIt -- replaces characters in the original message with encrypted characters
	void shiftIt(int key, String enteredMessage) {
		StringBuilder message = new StringBuilder(enteredMessage);

		for (int i = 0; i < enteredMessage.length(); i++) {
			char c = enteredMessage.charAt(i);
			char a = encryptLetter(c);
			message.setCharAt(i, a);
		}

		System.out.println(message);

	}

//	METHOD 4: encryptLetter -- encrypts character and returns it
	private char encryptLetter(char c) {
		int i;
		char a = '0';

		for (i = 0; i < origCAP.length(); i++) {
			if (Character.isUpperCase(c) && c == origCAP.charAt(i)) {
				a = this.encrCAP.charAt(i);
				break;
			}

			if (Character.isLowerCase(c) && c == origLOW.charAt(i)) {
				a = this.encrLOW.charAt(i);
				break;
			}

			else {
				a = c;
			}

		}

		return a;
	}
	
}
