class CommissionEmployee extends Employee {
    private int commissionRate;
    private int grossSales;

    public CommissionEmployee(String name, String lastName, int SSN, int commissionRate, int grossSales) {
        super(name, lastName, SSN);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }
}