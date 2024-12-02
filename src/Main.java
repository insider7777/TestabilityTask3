public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        // Параметры кредита
        int loanAmount = 1_000_000;
        double annualRate = 9.99;

        int payment1Year = service.calculate(loanAmount,annualRate, 12);
        System.out.println("Ежемесячный платёж (1 год): " + payment1Year + " ₽");

        int payment2Years = service.calculate(loanAmount, annualRate, 24);
        System.out.println("Ежемесячный платёж (2 года): " + payment2Years + " ₽");

        int payment3Years = service.calculate(loanAmount, annualRate,36);
        System.out.println("Ежемесячный платёж (3 года): " + payment3Years + " ₽");


    }
}
