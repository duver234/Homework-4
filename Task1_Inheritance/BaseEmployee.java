class BaseEmployee extends Employee {
    private int baseSalary;

    public BaseEmployee(String name, String lastName, int SSN, int baseSalary) {
        super(name, lastName, SSN);
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void print() {
        super.print();
        System.out.println("    Base Salary: " + baseSalary);
    }
}