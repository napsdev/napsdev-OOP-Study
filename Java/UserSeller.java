class UserSeller extends User {

    private Integer Id;

    public UserSeller(String Name, String Document, String Email) {
        super(Name, Document, Email);
    }

    // Example Polymorphism
    @Override
    public void setId(Integer id) {
        if (Document == "1105793458") {
            this.Id = id;
        } else {
            System.out.println("Permission denied");
        }
    }

    @Override
    void printname() {
        System.out.println("Name: " + Name + " " + Id);
    }

}
