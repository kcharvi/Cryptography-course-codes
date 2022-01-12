public class VignereCipher {
	public static void main(String...s){
		char msg[] = {'C','R','P','T','O','G','R','A','P','H','Y'};
		char key[] = {'C','H','A','R','V','I'};
		int msgLen = msg.length, i, j;
		
		char newKey[] = new char[msgLen];
		char encryptedMsg[] = new char[msgLen];
		char decryptedMsg[] = new char[msgLen];
		
		//generate new key in cyclic manner equal to the length of original message
		for(i = 0, j = 0; i < msgLen; ++i, ++j){
			if(j == key.length)
				j = 0;
			
			newKey[i] = key[j];
		}
		
		//Encryption
		for(i = 0; i < msgLen; ++i)
			encryptedMsg[i] = (char)(((msg[i] + newKey[i]) % 26) + 'A');
	
		//Decryption
		for(i = 0; i < msgLen; ++i)
			decryptedMsg[i] = (char)((((encryptedMsg[i] - newKey[i]) + 26) % 26) + 'A');
		
		System.out.println("Original Message: " + String.valueOf(msg));		//String.valueOf() converts character array to String
		System.out.println("Key: " + String.valueOf(key));
		System.out.println("Generated Key: " + String.valueOf(newKey));
		System.out.println("\nEncrypted Message: " + String.valueOf(encryptedMsg));
		System.out.println("\nDecrypted Message: " + String.valueOf(decryptedMsg));
	}
}