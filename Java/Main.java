class Main {
    public static void main(String[] args) {
        // Intance of java
        User user = new User("Jaime Valencia", "1105792813", "jaime@algo.com");
        user.setId(1);
        user.printname();

        // Intance of java
        User seller = new UserSeller("María Pérez", "1105793458", "maria@algo.com");
        seller.setId(2);
        seller.printname();
    }
}