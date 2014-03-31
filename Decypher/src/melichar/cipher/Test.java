package melichar.cipher;

public class Test {
        public static void main (String [] args) {
                String wort = "ISYVKJRUXEDZQMCTPLOFNBWGAH";
                SubstitutionCipher kc = new SubstitutionCipher(wort);
                System.out.println(kc.getSecretAlphabet());
                wort = "Melichar";
                System.out.println(kc.encrypt(wort));
                wort = "QKZXYUIL";	// = test encr
                System.out.println(kc.decrypt(wort));
        }
}