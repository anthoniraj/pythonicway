package hash;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash{
    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static String generateHash(String passcode) throws NoSuchAlgorithmException{
        final MessageDigest digest = MessageDigest.getInstance("SHA-256");
        final byte[] hashBytes = digest.digest(passcode.getBytes(StandardCharsets.UTF_8));
        String shaHex = bytesToHex(hashBytes);
        return  shaHex;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(generateHash("secret@password"));
    }
}