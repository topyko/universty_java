
/**
 * Write a description of class Milliseconds here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Milliseconds
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ("This program reads an integer which " +
            "represents Milliseconds and converts it to days, " +
            "hours, minutes and seconds. ");
        Scanner ms = new Scanner(System.in);
        System.out.print("Enter the Number you want: ");
        long ms1 = ms.nextLong();
        int s = (int) (ms1 / 1000) % 60 ;
        int m = (int) ((ms1 / (1000*60)) % 60);
        int h   = (int) ((ms1 / (1000*60*60)) % 24);
        int d = (int) (ms1 / (1000*60*60*24));
        // d_days_h:m:s_hours
        System.out.printf("%d days %d:%d:%d hours", d,h,m,s);		
        //System.out.println(d+"days "+h+":"+"m"+"s"+"hours");	
        
   
    } // end of method main
} 
//end of class Milliseconds

