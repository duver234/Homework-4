class CommisionEmployee extends Employee {
    private int commissionRate;
    private int grossSales;

    public CommisionEmployee(String name, String lastName, int SSN, int commissionRate, int grossSales) {
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

    public void print() {
        super.print();
        System.out.println("    Commission Rate: " + commissionRate);
        System.out.println("    Gross Sales: " + grossSales);
    }
}