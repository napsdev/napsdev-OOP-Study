public class User {
    // Attributes
    Integer Id;
    String Document;
    String Type;
    String Name;
    String Password;
    String Email;
    String Address;

    // Methods

    // Construct method whit parameters requerid
    public User(String Name, String Document, String Email) {
        this.Name = Name;
        this.Document = Document;
        this.Email = Email;
    }

    void printname() {
        System.out.println("Name: " + Name);
    }

}
