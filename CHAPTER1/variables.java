import java.util.Scanner;

public class variables
{
    public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);

        int x,y,z;
        double a,b,c;
        String name, middleName, lastName;

        x = 60;
        y = -20;
        z = -80085;

        a = 534.53;
        b = 3.6665445664353433;
        c = 464.0;

        System.out.println("enter name");
        name = input.next();

        System.out.println("enter middle name");
        middleName = input.next();

        System.out.println("enter last name");
        lastName = input.next();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(x + y + z + a + b + c);
        System.out.println(name + " " + middleName + " " + lastName);

    }





}