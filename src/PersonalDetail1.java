public class PersonalDetail1 {
    //create instance method
    public void changeName(String name)
    {
        System.out.println(name);

    }
    //create static method
    public static void Address(String add)
    {
        System.out.println(add);
    }
    public static void Birthday(String bday)
    {
        System.out.println(bday);
    }
    //main method
    public static void main(String args[])
    {
        //instance method calling in main method so we creating new object as personaldetail.
        PersonalDetail1 personaldetail = new PersonalDetail1(); //creating new object
        personaldetail.changeName("Gaurang Patel");
        personaldetail.Address("Address: 8,Epsom Close");
        personaldetail.Birthday("My Birthdate is 8th April 1989");
       // System.out.println("contact no is 0765432267");
    }

}
