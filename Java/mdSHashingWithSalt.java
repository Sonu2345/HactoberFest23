package Java;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Scanner;

public class mdSHashingWithSalt 
{
    public static void main(String[] args)throws NoSuchAlgorithmException, NoSuchProviderException 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password : ");
        String password = sc.next();
        String salt = SaltGenerator();
        
        String securePassword = getSecurePassword(password, salt);

        System.out.println(securePassword);

        String regeneratedPassowrdToVerify = getSecurePassword(password, salt);

        System.out.println(regeneratedPassowrdToVerify);
        sc.close();
    }

    private static String getSecurePassword(String password, String salt) 
    {
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Add password bytes to digest
            md.update(salt.getBytes());
            
            // Get the hash's bytes
            byte[] bytes = md.digest(password.getBytes());
            
            // Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16)
                        .substring(1));
            }
            
            // final password without salt
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }

    // Add salt
    private static String SaltGenerator() throws NoSuchAlgorithmException, NoSuchProviderException 
    {
        // Always use a SecureRandom generator
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "SUN");

        // Create array for salt
        byte[] salt = new byte[16];

        // Get a random salt
        sr.nextBytes(salt);
        return salt.toString();
    }
}