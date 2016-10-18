import java.util.Scanner;


public class QuadraticFormula
{
   public static void main(String args[])
   {
       Scanner scanner = new Scanner( System.in );
       
       System.out.println( "Quadratic Formula Calculator" );
           
       double a,b,c, x1, x2;              
       System.out.println( "ax^2 + bx + c");
       
       System.out.println( "Enter a");
       a = scanner.nextDouble();
       
       System.out.println( "Enter b");
       b = scanner.nextDouble();
       
       System.out.println( "Enter c");
       c = scanner.nextDouble();
       
       x1 = ( -b + Math.sqrt(b*b-4*a*c));
       x2 = (2*a);
       
       System.out.println( "Answer: "+ (x1/x2));
       
       
       

       scanner.close();
       
   }
}