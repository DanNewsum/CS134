import java.util.Scanner;


public class AreaOfCircle
{
   public static void main(String args[])
   {
       Scanner scanner = new Scanner( System.in );
       
       System.out.println( "Area of Cicle Calculator" );
           
       double pi, r, area;
       pi = 3.14;
       
       System.out.print( "What is the radius: ");
       r = scanner.nextDouble();
       
       area = pi * Math.pow(r, 2);
       
       System.out.print( "Radius: "+ area);
       
      
       
       
       scanner.close();
       
   }
}