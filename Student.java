public class Student extends User{
    private int num_loans;

    public Student(int UserID, String FirstName, String LastName, int age, String Profile, int num_loans) {
        super(UserID, FirstName, LastName, age, Profile);
        this.num_loans = num_loans;
    }
    public int getNum_loans() {
        return num_loans;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of loans: " + num_loans);
    }
}
