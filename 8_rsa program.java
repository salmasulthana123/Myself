import java.math.BigInteger;
import java.util.Scanner;
public class RSAExample {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Step 1: Choose two prime numbers
System.out.print("Enter prime number p: ");
BigInteger p = sc.nextBigInteger();
System.out.print("Enter prime number q: ");
BigInteger q = sc.nextBigInteger();
// Step 2: Calculate n and phi
BigInteger n = p.multiply(q);
BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
// Step 3: Choose public key e
System.out.print("Enter public key e (1 < e < phi and gcd(e,phi)=1): ");
BigInteger e = sc.nextBigInteger();
// Step 4: Calculate private key d
BigInteger d = e.modInverse(phi);
System.out.println("\nPublic Key (e, n): (" + e + ", " + n + ")");
System.out.println("Private Key (d, n): (" + d + ", " + n + ")");
// Message input
System.out.print("\nEnter message (number form): ");
BigInteger message = sc.nextBigInteger();
// Encryption: C = M^e mod n
BigInteger cipher = message.modPow(e, n);
System.out.println("Encrypted message: " + cipher);
// Decryption: M = C^d mod n
BigInteger decrypted = cipher.modPow(d, n);
System.out.println("Decrypted message: " + decrypted);
sc.close();
}
}
