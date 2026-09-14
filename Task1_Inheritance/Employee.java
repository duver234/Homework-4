public class Employee {
    private String name;
    private String lastName;
    private int SSN;

    public Employee(String name, String lastName, int SSN) {
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

    public void print() {
        System.out.println("Employee: " + name + " " + lastName);
        System.out.println("    SSN: " + SSN);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
}