public class PersonalDetails {
    public static void changeName(String name) {
        System.out.println(name);

    }

    //static method
    public static void main(String args[]) {
        PersonalDetails personaldetail = new PersonalDetails();
        changeName("Gaurang Patel");
        System.out.println("Address: 8,Epsom Close");
        System.out.println("My Birthdate is 8th April 1989");
        System.out.println("contact no is 0765432267");
    }

}