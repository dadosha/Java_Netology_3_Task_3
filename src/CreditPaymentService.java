public class CreditPaymentService {

    /*
    P = S * (i + i / ( (1+i)^n - 1))
    где
    P – ежемесячный платёж
    S – сумма кредита
    n – количество месяцев
    i – ежемесячная процентная ставка:

    i = (Yp / 100) / 12
    Yp – размер годовой процентной ставки
     */
    public int calculate(int creditAmount, double percentage, int countMonth) {
        double i = (percentage / 100) / 12;
        return (int) (creditAmount * (i + i / (Math.pow(1 + i, countMonth) - 1)));
    }
}
