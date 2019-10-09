import java.util.Scanner;

public class EnterPIN
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int pin, entry, attempts = 1;
        double balance;
        String password, passwordInput;

        password = "asamn";
        pin = 13337;
        balance = 0 + (double)(1000000 * Math.random());

        System.out.println("ATTEMPT: " + attempts);
        System.out.print("ENTER YOUR PASSWORD: ");
        passwordInput = input.next();

        while (!passwordInput.equals(password))
        {
            if (attempts >= 3)
            {
                break;
            }
            attempts++;
            System.out.print("\nATTEMPT: " + attempts);
            System.out.println("\nINCORRECT\nENTER YOUR PASSWORD: ");
            passwordInput = input.next();
        }
        if (attempts >= 3 && !passwordInput.equals(password))//activates on third try without !=
        {
            System.out.println("\nSECURITY BREACH! SELF-DESTRUCT ACTIVATED!");
        }

        else
        {
            System.out.print("\nPASSWORD CORRECT\n");
            System.out.println("ATTEMPT: " + attempts);
            System.out.print("PLEASE ENTER YOUR PIN: ");
            entry = input.nextInt();
            while (entry != pin)
            {
                if (attempts >= 3)
                {
                    break;
                }
                attempts++;
                System.out.print("\nATTEMPT: " + attempts);
                System.out.println("\nINCORRECT\nENTER YOUR PIN: ");
                entry = input.nextInt();
                }
                if (attempts >= 3 && entry != pin)//activates on third try without !=
                {
                    System.out.println("\nSECURITY BREACH! SELF-DESTRUCT ACTIVATED!");
                }
                else
                {
                    System.out.println("PIN ACCEPTED. BALACE: $" + balance);
                }
        }

    }

}