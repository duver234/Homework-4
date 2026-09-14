import java.util.ArrayList;

class Driver {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<Payable>();

        Freelancer freeLancer1 = new Freelancer("John", "Doe", 50.0, 20);
        Freelancer freeLancer2 = new Freelancer("Jane", "Smith", 60.0, 15);

        VendorInvoice vendorInvoice1 = new VendorInvoice("Evil Supplies", 500.0);
        VendorInvoice vendorInvoice2 = new VendorInvoice("Good Services", 750.0);

        payables.add(freeLancer1);
        payables.add(freeLancer2);
        payables.add(vendorInvoice1);
        payables.add(vendorInvoice2);

        double totalPayout = 0.0;

        for (Payable payable : payables) {
            payable.print();
            double payment = payable.calculatePayment();
            totalPayout += payment;
        }
        System.out.println("Total Payout: $" + totalPayout);
    }
}