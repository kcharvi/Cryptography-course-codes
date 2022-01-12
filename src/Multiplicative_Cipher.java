import java.util.*;
public class Multiplicative_Cipher {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int shift,i,n;
		String str,str1="",str2="";
		
		System.out.println("Enter the plaintext");
		str=sc.next();
		str=str.toLowerCase();
		n=str.length();
		char ch1[]=str.toCharArray();
		char ch3,ch4;
		System.out.println("Enter the key");
		shift=sc.nextInt();
		
		System.out.println();		
		System.out.println("Encrypted text is");
		//Encryption	
		for(i=0;i<n;i++)
		{
			if(Character.isLetter(ch1[i]))
			{
				ch3=(char)(((int)ch1[i]*shift-97)%26+97);
				str1=str1+ch3;
			}
			else if(ch1[i]==' ')str1=str1+ch1[i];		
		}
		System.out.println(str1);

		//Calculation of multiplicative inverse
		int q=0;
		for(i=0;i<26;i++)
    		{
        		if(((i*26)+1)%shift==0)
        		{		q=((i*26)+1)/shift;
            			break;
        		}
    		}

		//DECRYPTION
		System.out.println();
		System.out.println("Decrypted text is");
		char ch2[]=str1.toCharArray();
		for(i=0;i<str1.length();i++)
		{
			if(Character.isLetter(ch2[i]))
			{
				ch4=(char)(((int)ch2[i]*q-97)%26+97);
				str2=str2+ch4;
			}
    		else if(ch2[i]==' ')str2=str2+ch2[i];
		}
		System.out.println(str2);
		sc.close();

	}
}