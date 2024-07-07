public class Main {
    private String Password; // restricted access

    // Getter - returns value
    public String getName() {
        return Password;
    }

    // Setter - sets the value
    public void setName(String NewPassword) {
        this.Password = NewPassword;
    }

    public static void main(String[] args) {
        Main OurPassword = new Main();
        OurPassword.Password = "password123";
        System.out.println("The Password is......" + OurPassword.Password);
    }

    /*
     * Better control of class attributes and methods
     * Class attributes can be made read-only (if you only use the get method), or
     * write-only (if you only use the set method)
     * Flexible: the programmer can change one part of the code without affecting
     * other parts
     * Increased security of data
     */
}