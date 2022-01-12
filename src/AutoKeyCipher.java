import java.util.*;
public class AutoKeyCipher {
	private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter message: ");
		String msg = sc.nextLine();
		msg.toUpperCase();
		String key = "L";
		String enc = autoEncryption(msg, key);
		System.out.println("Key : "+ key);
		System.out.println("Plaintext : " + msg);
		System.out.println("Encrypted : " + enc);
		System.out.println("Decrypted : " + autoDecryption(enc, key));
        sc.close();

	}

	public static String autoEncryption(String msg, String key)
	{
		int len = msg.length();

		// generating the keystream
		String newKey = key.concat(msg);
		newKey = newKey.substring(0, newKey.length() - key.length());
		String encryptMsg = "";

		// applying encryption algorithm
		for (int x = 0; x < len; x++) {
			int first = alphabet.indexOf(msg.charAt(x));
			int second = alphabet.indexOf(newKey.charAt(x));
			int total = (first + second) % 26;
			encryptMsg += alphabet.charAt(total);
		}
		return encryptMsg;
	}

	public static String autoDecryption(String msg, String key)
	{
		String currentKey = key;
		String decryptMsg = "";

		// applying decryption algorithm
		for (int x = 0; x < msg.length(); x++) {
			int get1 = alphabet.indexOf(msg.charAt(x));
			int get2 = alphabet.indexOf(currentKey.charAt(x));
			int total = (get1 - get2) % 26;
			total = (total < 0) ? total + 26 : total;
			decryptMsg += alphabet.charAt(total);
			currentKey += alphabet.charAt(total);
		}
		return decryptMsg;
	}
}
