public class CpndInterest {
    class Loan {
        public static double TAmount(double principal, double rate, int year, int n) {
            double r = rate / 100;
            double C = principal * Math.pow(1 + r / n, n * year);
            return C;
        }
    }

    public static void main(String[] args) {
        double principal = 500000;
        double rate = 18;
        int year = 3;
        int n = 12;

        double totalAmount = Loan.TAmount(principal, rate, year, n);

        System.out.printf("The Tamount paid after %d years with all cpnd interest combined: %.2f frw", year,
                totalAmount);
}

}
    

