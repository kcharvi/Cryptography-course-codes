//import java.util.*;
//public class RSA {
//   public static void main(String args[])
//    {
//	    Scanner sc=new Scanner(System.in);
//	    int p, q,  z, d = 0, e, i;
//	    double n;
//        String msg ="";
//        int c;
//        String msgback = "";
//        p = 167; q =113;
// //PRIME NUMBERS TAKEN
//        n = p * q;
//        //Euler Totient
//        z = (p - 1) * (q - 1);
//        System.out.println("the value of p = " + p);
//        System.out.println("the value of q = " + q);
//        System.out.println("the value of p*q = " + n);
//        System.out.println("the value of z = " + z);
//  
//         //e is for public key exponent
//        //for (e = 2; e < z; e++)if (gcd(e, z) == 1)break;
//        System.out.println("the value of e (public key expo) = " + 343);
//         e=201;
////         d;
////        for (i = 0; i <= 343; i++) {
////            int x = 1 + (i * z);
////            // d is for private key exponent
////            if (x % e == 0) {
////                d = x / e;
////                break;
////            }
////        }
//        int k=0;
//        while(true) {
//        	double x = 1 + (k * 18592);
//          // d is for private key exponent
//          if (x % e == 0.000) {
//              d = (int) (x / e);
//              break;
//           }
//          k++;
//          }
//        System.out.println("Value of k: "+k);
//        
//        System.out.println("the value of d = " + d);
//        
//        System.out.println("Enter Meassage to Encrypt");
//        msg=sc.next();
//        
//        char ch[]=msg.toCharArray();
//        ArrayList<Integer> cipher = new ArrayList<>(); 
//        
//        System.out.println("Encrypting message (value of (MSG)^e mod n) : ");
//        for(int idx=0;idx<ch.length;idx++) {
//        	c = (int) ((int)(Math.pow((int)((ch[idx])-65)%26, e)) % n);
//        	System.out.print(c+ " ");
//        	cipher.add(c);        	
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println("Decrypting message (value of (CIPHER)^d mod n) :");
//        int m;
//        for(Integer idx: cipher) {
//        	m=(int) ((int)(Math.pow((int)(idx)%65, d)) % n);
//        	System.out.print(m+" ");
//        	msgback=msgback+(char)(m+65);
//        }
//        System.out.println();
//        
//    }
//  
//    public static int gcd(int e, int z)
//    {
//        if (e == 0)
//            return z;
//        else
//            return gcd(z % e, e);
//    }
//}
////import java.util.*;
////public class RSA {
////   public static void main(String args[])
////    {
////int e=343;
////        	int d;
////       	 int k=1;
////       	 while(true) {
////        		double x = 1 + (k * 158400);
////        		//System.out.println(x);
////          // d is for private key exponent
////                 if (x % e == 0 && (x%e)==(int)(x%e)) {
////         	     d = (int) (x / e);
////         	     break;
////          		 }
////         	    k++;
////         	 }
////        System.out.println("Value of k: "+k);
////}
////}

public class RSA {
   public static void main(String args[])
    {
	   		int e=35;
        	int k=0;
       	 while(true) {
        		double x = 1 + (k * 192);
          // d is for private key exponent
                 if (x % e == 0.000) {
         	     break;
          		 }
         	    k++;
         	 }
        System.out.println("Value of k: "+k);
}
}
