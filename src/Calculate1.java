// create program using or passing Argunments.
/*Write a program and create four method for calculator addition,subtraction,
Multiplication, and division & call in main method.
 */

public class Calculate1
{
    static int c;

    //create instance method
    public void addition(int a, int b)
    {
        c= a+b;
        System.out.println("Addition is " +c);

    }
    public void substraction(int a, int b)
    {
        c=a-b;
        System.out.println("Substraction is "+c);
    }
    //create static method
    public static void multification(int a, int b)
    {
        c=a*b;
        System.out.println("multiplication is "+c);

    }
    public static void division(int a, int b)
    {
        c=a/b;
        System.out.println("Division is "+c);
    }
    //main method
    public static void main(String args[])
    {


        //instance method calling in main method so we creating new object as calculate.
        Calculate1 calculate = new Calculate1(); //creating new object
        calculate.addition(10,5);      //calling using object.
        calculate.substraction(10,5);
        multification(10,5);   //calling without object.
        division(10,5);

    }

}

