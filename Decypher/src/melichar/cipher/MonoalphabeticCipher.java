package melichar.cipher;

public class MonoalphabeticCipher implements Cipher {

	private String secretAlphabet;
	
	public MonoalphabeticCipher(String secretAlphabet) {
		this.secretAlphabet = secretAlphabet;
	}
	
	public String getSecretAlphabet() {
		return this.secretAlphabet;
	}
	
	protected void setSecretAlphabet(String secretAlphabet) {
		this.secretAlphabet = secretAlphabet;
	}

	@Override
	public String encrypt(String text) {
        char[] bsarray = secretAlphabet.toCharArray();
        String returntext = "";
        
        for(int i=0; i<text.length(); i++) {
                char buchstabe = text.charAt(i);
                if (buchstabe >= 'a' && buchstabe <= 'z') {
                        returntext = returntext + bsarray[buchstabe - 97];
                } else if (buchstabe >= 'A' && buchstabe <= 'Z') {
                        returntext = returntext + bsarray[buchstabe - 65];
                } else {
                        System.err.println("Fehler: Ein Sonderzeichen oder eine Zahl war im Text.");
                        System.exit(0);
                }
        }
        returntext = returntext.toUpperCase();
        return returntext;
	}

	@Override
	public String decrypt(String text) {
        char[] bsarray = secretAlphabet.toCharArray();
        String returntext = "";
        for (int i=0; i<text.length(); i++) {
                char buchstabe = text.charAt(i);
                if (buchstabe >= 'a' && buchstabe <= 'z') {
                        for (int a = 0; a < bsarray.length; a++) {
                                if (((char) buchstabe - 32) == bsarray[a]) {
                                        returntext = returntext + (char) ('a' - 32 + a);
                                }
                        }
                } else if (buchstabe >= 'A' && buchstabe <= 'Z') {
                        for (int a = 0; a < bsarray.length; a++) {
                                if (buchstabe == bsarray[a]) {
                                        returntext = returntext + (char) ('A' + a);
                                }
                        }
                } else {
                        System.err.println("Fehler: Ein Sonderzeichen oder eine Zahl war im Text.");
                        System.exit(0);
                }
        }
        returntext = returntext.toLowerCase();
        return returntext;
	}
	
}
