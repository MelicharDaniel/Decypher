package melichar.cipher;

public class MonoalphabeticCipher implements Cipher {

	private String secretAlphabet;
	
	public MonoalphabeticCipher()
	{
		
	}
	
	public String getSecretAlphabet()
	{
		return this.secretAlphabet;
	}
	
	protected void setSecretAlphabet(String secretAlphabet)
	{
		this.secretAlphabet = secretAlphabet;
	}

	@Override
	public String encrypt(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deencrypt(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
