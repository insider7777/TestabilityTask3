public class CreditPaymentService {
    public int calculate(int loanAmount, double annualRate, int months) {
        // Перевод годовой ставки в месячную
        double monthlyRate = annualRate / 12 / 100;

        // Расчёт аннуитетного платежа
        double payment = loanAmount *
                (monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1);

        // Приведение результата к целому числу
        return (int) payment;
    }
}
