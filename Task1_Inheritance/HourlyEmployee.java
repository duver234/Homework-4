class HourlyEmployee extends Employee {
    private int wage;
    private int hoursWorked;

    public HourlyEmployee(String name, String lastName, int SSN, int wage, int hoursWorked) {
        super(name, lastName, SSN);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public int getWage() {
        return wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}