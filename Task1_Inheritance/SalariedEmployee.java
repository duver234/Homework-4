class SalariedEmployee extends Employee {
    private int weeklySalary;

    public SalariedEmployee(String name, String lastName, int SSN, int weeklySalary) {
        super(name, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }
}