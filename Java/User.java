public class User {
    // Attributes
    private Integer Id;
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
        // In case of heredity the potting is very useful
        // this.Id = 3;
    }

    void printname() {
        System.out.println("Name: " + Name + " " + Id);
    }

    // Setters and getters (It's a trap for heredity)
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        if (Document == "1105792813") {
            Id = id;
        } else {
            System.out.println("Permission denied");
        }

    }

}
