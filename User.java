import java.util.ArrayList;

public class User {
    private int UserID;
    private String FirstName;
    private String LastName;
    private int age;
    private ArrayList<Book> Loans;
    private String Profile;
    private boolean AbleToLoan;

    public User(int UserID, String FirstName, String LastName, int age, String Profile) {
        this.UserID = UserID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.Profile = Profile;
    }
    public int getID(){
        return this.UserID;
    }

    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getFirstName(){
        return this.FirstName;
    }

    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public String getLastName(){
        return this.LastName;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void displayInfo(){
        System.out.println("ID: " + this.UserID);
        System.out.println("FirstName: " + this.FirstName);
        System.out.println("LastName: " + this.LastName);
        System.out.println("Age: " + this.age);
        System.out.println("Profile: " + this.Profile);

    }


}
