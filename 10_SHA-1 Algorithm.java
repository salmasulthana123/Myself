import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
public class SHA1Digest {
public static void main(String[] args) {
try {
// Get user input or use default message
Scanner sc = new Scanner(System.in);
System.out.print("Enter the message: ");
String message = sc.nextLine();
// Create MessageDigest instance for SHA-1
MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
// Compute hash (message digest)
byte[] messageBytes = message.getBytes();
byte[] digestBytes = sha1.digest(messageBytes);
// Convert byte array to hexadecimal string
StringBuilder hexString = new StringBuilder();
for (byte b : digestBytes) {
hexString.append(String.format("%02x", b));
}
// Output
System.out.println("Message: " + message);
System.out.println("SHA-1 Digest: " + hexString.toString());
} catch (NoSuchAlgorithmException e) {
System.err.println("SHA-1 algorithm not found!");
}
}
}
