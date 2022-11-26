class Main {
    public static void main(String[] args) {
        // Intance of java
        User user = new User();
        user.Name = "Jaime Valencia";
        user.Document = "1105792813";
        user.Email = "jaime@algo.com";

        user.printname();

        // Intance of java
        User partner = new User();
        partner.Name = "María Pérez";
        partner.Document = "1105793458";
        partner.Email = "maria@algo.com";

        partner.printname();
    }
}