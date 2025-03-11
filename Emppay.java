package employee;

public class Emp {
    // Declare variables
    private String name;
    private int empid;
    private String category;
    private double bpay;
    private double hra;
    private double da;
    private double npay;
    private double pf;
    private double grosspay;
    private double incometax;
    private double allowance;

    // Constructor
    public Emp(String name, int empid, String category, double bpay) {
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
    }

    // Method to calculate allowance
    private void calculateAllowance() {
        allowance = 0.10 * bpay;
    }

    // Method to calculate DA
    private void calculateDA() {
        da = 0.05 * bpay;
    }

    // Method to calculate HRA
    private void calculateHRA() {
        hra = 0.09 * bpay;
    }

    // Method to calculate PF
    private void calculatePF() {
        pf = 0.11 * bpay;
    }

    // Method to calculate Gross Pay
    private void calculateGrossPay() {
        grosspay = bpay + hra + da + allowance;
    }

    // Method to calculate Net Pay
    private void calculateNetPay() {
        npay = grosspay - pf - incometax;
    }

    // Method to calculate Income Tax (For demonstration purposes, let's assume a fixed tax rate)
    private void calculateIncomeTax() {
        incometax = 0.1 * grosspay; // Assume a flat 10% income tax rate
    }

    // Method to perform calculations and print values
    public void calculateAndPrint() {
        calculateAllowance();
        calculateDA();
        calculateHRA();
        calculatePF();
        calculateGrossPay();
        calculateIncomeTax();
        calculateNetPay();

        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Basic Pay: " + bpay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Allowance: " + allowance);
        System.out.println("PF: " + pf);
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("Income Tax: " + incometax);
        System.out.println("Net Pay: " + npay);
    }
}
// Emppay.java
import employee.Emp;

public class Emppay {
    public static void main(String[] args) {
        // Create an object of Emp class
        Emp e = new Emp("John Doe", 1001, "Regular", 50000);

        // Call the method to perform calculations and print values
        e.calculateAndPrint();
    }
}