import java.io.File;
import java.net.URL;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;

class Address
{
    String street;
    String city;
    String state;
    int zip;
}

public class MailingAddresses
{
    public static void main(String[] args)
    {
        Address first, second, third;

        first = new Address();
        first.street = "191 Marigold Lane";
        first.city = "Miami";
        first.zip = 33179;

        second = new Address();
        second.street = "420 Grove Street";
        second.city = "";


    }



}