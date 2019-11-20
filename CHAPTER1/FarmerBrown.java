import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.*;

public class FarmerBrown
{
    public static void main(String[] args)
    {
        for (int sheep = 1; sheep <= 100; sheep++)
        {
            for (int goats = 1; goats <= 100; goats++)
            {
                for (int chicks = 1; chicks <= 100; chicks++)
                {
                     if (10*sheep + 3.5*goats + 0.5*chicks == 100 && sheep+goats+chicks == 100)
                     {
                         out.println(sheep + " sheep, " + goats + " goats, " + chicks + " chickens.");

                     }
                }
            }
        }
        //10 sheep, 3.50 goats, 0.5 chicken
    }
}