import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;
public class RC4UserInput {
public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
System.out.print("Enter plaintext: ");
String plainText = sc.nextLine();
System.out.print("Enter secret key: ");
String key = sc.nextLine();
// Create RC4 key
SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "RC4");
// Initialize RC4 cipher
Cipher cipher = Cipher.getInstance("RC4");
cipher.init(Cipher.ENCRYPT_MODE, secretKey);
// Encrypt
byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
System.out.println("RC4 Encrypted Text: " + encryptedText);
sc.close();
}
}
