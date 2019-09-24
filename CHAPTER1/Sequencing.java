import java.util.Scanner;
/*variables dont hold formula*/
public class Sequencing
{
    public static void main( String[] args)
    {
        Scanner input = new Scanner(System.in);
        double price, salesTax, total;

        System.out.println("How much is purchase?");
        price = input.nextDouble();

        salesTax = price * 0.0825;

        total = price + salesTax;

        System.out.println("price: " + price);
        System.out.println("sales tax: " + salesTax);
        System.out.println("total: " + total);


    }



}