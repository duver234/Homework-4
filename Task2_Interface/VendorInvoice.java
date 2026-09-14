class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice(String vendorName, double amountDue) {
        this.vendorName = vendorName;
        this.amountDue = amountDue;
    }

    @Override
    public double calculatePayment() {
        return amountDue;
    }

    @Override
    public String getPayeeName() {
        return vendorName;
    }

    public void print() {
        System.out.println("Vendor: " + vendorName);
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Amount Due: $" + amountDue + "\n");
    }



    // "Get" functions
    public String getVendorName() {
        return vendorName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }



    // "Set" functions
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setAmountDue(double amountDue) {
        if (amountDue < 0) {
            throw new IllegalArgumentException("Amount due cannot be negative.");
        }
        
        this.amountDue = amountDue;
    }

}