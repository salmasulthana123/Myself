import java.io.*;
import java.util.*;

public class SubstitutionCipher {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zyxwvutsrqponmlkjihgfedcba";

        System.out.print("Enter any string: ");
        String str = br.readLine().toLowerCase(); // Ensure lowercase to match `a` and `b`
        
        String decrypt = "";
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            int j = a.indexOf(c);
            if (j != -1) { // Check if character exists in the alphabet
                decrypt = decrypt + b.charAt(j);
            } else {
                decrypt = decrypt + c; // Preserve non-alphabet characters
            }
        }

        System.out.println("The encrypted data is: " + decrypt);
    }
}
