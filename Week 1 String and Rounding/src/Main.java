/**
 * @author Dan Sedano
 * @version 10/20/19
 * This is the first java program for CST 338. This Program will manipulate 
 * String variables and use the Decimal formatting class.
 **/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main 
{

   //Static Variables
   public static final double MIN_HOURS = 12.0;
   public static final double MAX_HOURS = 20.0;

   public static void main(String[] args) 
   {	

      //Scanner class allows for input
      Scanner in = new Scanner(System.in);

      //Ask for first name input
      System.out.println("Please enter the following with the first letter "
         + "capitalized.\n");

      //Ask for first name input
      System.out.print("Please enter your first name: ");
      String fName = in.nextLine();

      //Asks for last name input
      System.out.print("Please enter your last name: ");
      String lName = in.nextLine();

      //Consecrates the first and last name variables.
      String fullName = fName + " " + lName;	
      System.out.println("\nYour name is: " + fullName);
      System.out.println("The length of your name is: " + (fullName.length()) 
         + " characters (including the space).");

      //prints in upper and lower case
      System.out.println("I'm yelling your name: " + fullName.toUpperCase());
      System.out.println("I'm whispering your name: " + fullName.toLowerCase());

      //formats and prints MIN_HOURS and MAX_HOURS range without decimal
      System.out.printf("\nYou will be spending about %.0f - %.0f "
         + "hours a week on homework.\n", MIN_HOURS, MAX_HOURS);

      //Asks for hours spent on homework
      System.out.println("How much time did you spend last week?");
      System.out.print("Enter hours in a decimal to 3 places: ");
      double inputHours = in.nextDouble();

      //creates a new decimal format to round up to one tenth
      DecimalFormat df = new DecimalFormat(".0");
      System.out.println("You spent " + df.format(inputHours) + 
         " hours on your homework.");	

      //close the scanner class
      in.close();
   }
}

/****************************Output 1******************************
Please enter the following with the first letter capitalized.

Please enter your first name: Dan
Please enter your last name: Sedano

Your name is: Dan Sedano
The length of your name is: 10 characters (including the space).
I'm yelling your name: DAN SEDANO
I'm whispering your name: dan sedano

You will be spending about 12 - 20 hours a week on homework.
How much time did you spend last week?
Enter hours in a decimal to 3 places: 10.452
You spent 10.5 hours on your homework.
 ******************************************************************/

/****************************Output 2******************************
Please enter the following with the first letter capitalized.

Please enter your first name: Helping
Please enter your last name: Otters

Your name is: Helping Otters
The length of your name is: 14 characters (including the space).
I'm yelling your name: HELPING OTTERS
I'm whispering your name: helping otters

You will be spending about 12 - 20 hours a week on homework.
How much time did you spend last week?
Enter hours in a decimal to 3 places: 12.789
You spent 12.8 hours on your homework.
 ******************************************************************/
