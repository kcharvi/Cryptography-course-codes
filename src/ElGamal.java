import java.math.*;
import java.util.*;
import java.security.*;
import java.io.*;

public class ElGamal
{
    public static void main(String[] args) throws IOException
    {
        BigInteger p, b, c, secretKey;
        Random sc = new SecureRandom();
        secretKey = new BigInteger("3");
        // public key calculation
        System.out.println("Private Key d = " + secretKey);
        p = BigInteger.probablePrime(5, sc);
        b = new BigInteger("3");
        c = b.modPow(secretKey, p);
        System.out.println("Prime Number p = " + p);
        System.out.println("E1 = " + b);
        System.out.println("E2 = " + c);
        // Encryption
        System.out.print("Enter your message: ");
        Scanner scan=new Scanner(System.in);
		String s = scan.next();
        BigInteger X = new BigInteger(s);
        BigInteger r = new BigInteger(5, sc);
        BigInteger EC = X.multiply(c.modPow(r, p)).mod(p);
        BigInteger brmodp = b.modPow(r, p);
        System.out.println("Plaintext = " + X);
        System.out.println("Random Number r = " + r);
        System.out.println("\nEncryption Status: ");
        System.out.println("E1^r mod p :  C1 = " + brmodp);
        System.out.println("(PlainText x E2^r)mod p :  C2 = " + EC);
        // Decryption
        BigInteger crmodp = brmodp.modPow(secretKey, p);
        BigInteger d = crmodp.modInverse(p);
        BigInteger ad = d.multiply(EC).mod(p);
        System.out.println("\n\nc^r mod p = " + crmodp);
        System.out.println("Inverse(C1^d) = " + d);
        System.out.println("Decryption Status: " + ad);
        System.out.println("(C2 x Inverse(C1^d))mod p  \n PlainText= " + ad);
        scan.close();
    }
}