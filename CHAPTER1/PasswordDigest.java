/*import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;
import java.util.Scanner;
import static java.lang.System.*;

public class PasswordDigest
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(in);
        String pass, convertedPass;

        MessageDigest digest = MessageDigest.getInstance("SHA-256"); //gets converter

        out.println("Password: ");
        pass = input.next();

        digest.update(pass.getBytes("UTF-8"));
        convertedPass = DatatypeConverter.printHexBinary(digest.digest());

        out.println(convertedPass);
    }
}
//CS50 compiler error
*/