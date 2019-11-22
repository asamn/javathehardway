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
        Address first, second, third, fourth;

        first = new Address();
        first.street = "191 Marigold Lane";
        first.city = "Miami";
        first.state = "FL";
        first.zip = 33179;

        second = new Address();
        second.street = "420 Grove Street";
        second.city = "Crafton";
        second.state = "PA";
        second.zip = 15205;

        third = new Address();
        third.street = "2693 Lost Lane";
        third.city = "Hickory";
        third.state = "NC";
        third.zip = 28601;

        fourth = new Address();
        fourth.street = "1333 Hugh Street";
        fourth.city = "Butte";
        fourth.state = "MO";
        fourth.zip = 80085;

        out.println(first.street + "\n" + first.city + ", " + first.state + " " + first.zip + "\n");
        out.println(second.street + "\n" + second.city + ", " + second.state + " " + second.zip + "\n");
        out.println(third.street + "\n" + third.city + ", " + third.state + " " + third.zip + "\n");
        out.println(fourth.street + "\n" + fourth.city + ", " + fourth.state + " " + fourth.zip + "\n");

    }

}