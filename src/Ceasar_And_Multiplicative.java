import java.util.Scanner;

public class Ceasar_And_Multiplicative {
	private static void Encryption(String message,int key) {
    	char ch;
    	String encryptedMessage = "";
		for(int i = 0; i < message.length(); ++i){
			ch = message.charAt(i);			
			if(ch >= 'a' && ch <= 'z'){
	            ch = (char)(ch + key);	            
	            if(ch > 'z')ch = (char)(ch - 'z' + 'a' - 1);	            
	            encryptedMessage += ch;
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch + key);	            
	            if(ch > 'Z')ch = (char)(ch - 'Z' + 'A' - 1);
	            encryptedMessage += ch;
	        }
	        else {
	        	encryptedMessage += ch;
	        }
		}
		
		System.out.println("Encrypted Message = " + encryptedMessage);
		Decryption(encryptedMessage,key);
	}
	public static void Decryption(String message,int key){
		String decryptedMessage = "";
		char ch; 
		for(int i = 0; i < message.length(); ++i){
			ch = message.charAt(i);			
			if(ch >= 'a' && ch <= 'z'){
	            ch = (char)(ch - key);	            
	            if(ch < 'a')ch = (char)(ch + 'z' - 'a' + 1);
	            decryptedMessage += ch;
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch - key);
	            if(ch < 'A')ch = (char)(ch + 'Z' - 'A' + 1);
	            decryptedMessage += ch;
	        }
	        else {
	        	decryptedMessage += ch;
	        }
		}
		
		System.out.println("Decrypted Message = " + decryptedMessage);
	}
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        String message;
		int key;
			
		System.out.println("Enter a message: ");
		message = sc.nextLine();
		System.out.println("Enter key: ");
		key = sc.nextInt();
		Encryption(message,key);
        sc.close();

    } 
}
