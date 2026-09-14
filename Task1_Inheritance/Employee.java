public class Employee {
    private String name;
    private String lastName;
    private int SSN;

    private Employee(String name, String lastName, int SSN) {
        this.name = name;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return String.valueOf(SSN);
    }
}