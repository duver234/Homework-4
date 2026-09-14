class BaseEmployee extends Employee {
    private int baseSalary;

    public BaseEmployee(String name, String lastName, int SSN, int baseSalary) {
        super(name, lastName, SSN);
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}