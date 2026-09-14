class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void print() {
        System.out.println("Freelancer: " + firstName + " " + lastName);
        System.out.println("Payment Due: $" + calculatePayment() + "\n");
    }

    @Override
    public double calculatePayment() {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            double overtimeRate = hourlyRate * 1.5;
            return (hourlyRate * 40) + (overtimeRate * overtimeHours);
        }
        else {
            return hourlyRate * hoursWorked;
        }
    }



    // "Get" functions
    @Override
    public String getPayeeName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }



    // "Set" Functions
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }
        
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        
        this.hoursWorked = hoursWorked;
    }
}