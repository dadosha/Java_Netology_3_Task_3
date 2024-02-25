public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1_000_000;
        double percentage = 9.99;
        int countMonth = 12;
        int monthPayment = service.calculate(creditAmount, percentage, countMonth);
        System.out.println("При кредите суммой " + creditAmount + " рублей. Годовой процентной ставкой " + percentage
                + ". Сроком на " + countMonth + " месяцев. Ежемесячный платеж - " + monthPayment);

        countMonth = 24;
        monthPayment = service.calculate(creditAmount, percentage, countMonth);
        System.out.println("При кредите суммой " + creditAmount + " рублей. Годовой процентной ставкой " + percentage
                + ". Сроком на " + countMonth + " месяцев. Ежемесячный платеж - " + monthPayment);

        countMonth = 36;
        monthPayment = service.calculate(creditAmount, percentage, countMonth);
        System.out.println("При кредите суммой " + creditAmount + " рублей. Годовой процентной ставкой " + percentage
                + ". Сроком на " + countMonth + " месяцев. Ежемесячный платеж - " + monthPayment);
    }
}