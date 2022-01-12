import java.util.*;
public class Affine_Cipher {
    static String s;
    static int num;
    static char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M',
    				   'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
    public static int gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
        // base case 
        if (a == b) 
            return a; 
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    } 
    
    public static int[] con(String n)
    {      //This method basically converts the name of the person to array of capital letters
           // like if input name is charvi---> it returns: [C H A R V I]
        int num[]=new int[n.length()];
        char te[]=new char[n.length()];
        for(int i=0;i<n.length();i++){
            te[i]=n.charAt(i);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<te.length;j++){
                if(te[j]==arr[i]){
              num[j]=i;
                }
            }
        }  
        return num;
    }
    
    public static String encmsg(int ar[]){  
    	//After getting the numbers, convert them to letters(the encrypted name)
        String dec="";
        char charr[]=new char[ar.length];
        for(int i=0;i<ar.length;i++){
            charr[i]=arr[ar[i]];
            dec=dec+Character.toString(charr[i]);
        }
        return dec;
    }
    
    
    public static int[] kg(String a)//key generation method
    {   
    	// this method basically generates two keys: 9 and last letter of our name's number
        int key[]=new int[2];
        try{
            char temp1=a.charAt(a.length()-1);
            key[0]=9;
            //because there should be multiplicative inverse of mod 26 
            //so we should take number 9
            for(int i=0;i<arr.length;i++){
                if(temp1==arr[i]){
                    key[1]=i;
                }
            }
            System.out.println("\n\nEncrytion keys for this name\n"+key[0]+" "+key[1]+
            		"\nWe are taking 9 as default key a \n and b will be number "
            		+ "of the last letter of the name given\n");
            
        }
        catch(Exception e)
        { 
            System.out.println("Enter valid name");System.exit(0);
            
        }
        return key;
    }
    
    public static int[] enc(int a[],int k[]){ 
    	//encrypting my name (aX + b) numbers using Affine cipher
        int dec[]=new int[a.length];            
        for(int i=0;i<a.length;i++){
            dec[i]=((k[0]*a[i])+k[1])%26;  //AFFINE ENCRYPTION
        }
        return dec;
    }
    
    public static int[] decr(int a[],int k[]){
        int dec[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            if(a[i]<k[1]){
                dec[i]=(k[0]*(a[i]-k[1]))%26;
                dec[i]=dec[i]+26;
            }
            else{
                dec[i]=(k[0]*(a[i]-k[1]))%26;
            }
        }
        return dec;
    }
    
    public static int modInverse(int a, int m) 
    { 
        a = a % m; 
        for (int x = 1; x < m; x++) 
           if ((a * x) % m == 1) 
              return x; 
        return 1; 
    } 
    
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word (may be your name) to encrypt");
        String name=sc.nextLine();
        name=name.toUpperCase();
        if(name==""){System.exit(0);}
        
        int N[]=con(name); //capital letters name array N
        
        int key[]=kg(name);
        // sending array of name, generated key as 9 and last letter of the name number
        int de[]=enc(N,key); 
        
        //this below for loop is just for our reference
        for (int charvi= 0 ; charvi<de.length; charvi++)System.out.print(de[charvi]+" ");
        
        System.out.println();
        String decry=encmsg(de);
        System.out.println(decry);
        System.out.println();
        sc.close();
    } 
} 
