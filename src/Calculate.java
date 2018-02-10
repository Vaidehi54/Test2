// create program without using or passing Argunments.

/*Write a program and create four method for calculator addition,subtraction,
Multiplication, and division & call in main method.
 */

public class Calculate {

  static int a=10;
  static int b=5;
  static int c;

    //create instance method
    public void addition()
    {
        c= a+b;
        System.out.println("Addition is " +c);

    }
    public void substraction()
    {
        c=a-b;
        System.out.println("Substraction is "+c);
    }
    //create static method
    public static void multification()
    {
        c=a*b;
        System.out.println("multiplication is "+c);

    }
    public static void division()
    {
        c=a/b;
        System.out.println("Division is "+c);
    }
    //main method
    public static void main(String args[])
    {


        //instance method calling in main method so we creating new object as calculate.
        Calculate calculate = new Calculate(); //creating new object
        calculate.addition();
        calculate.substraction();
        multification();
        division();

    }

}

