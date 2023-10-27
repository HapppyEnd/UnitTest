/*
В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и
возвращает сумму с учетом скидки.
Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount
получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
Не забудьте написать тесты для проверки этого поведения.
 */
public class Calculator {

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if(discountAmount < 0 || discountAmount >= 100){
            throw new ArithmeticException("Неправильно указан размер скидки");
        }
        if(purchaseAmount <= 0){
            throw new ArithmeticException("Цена не может быть отрицательной");
        }
        return purchaseAmount - purchaseAmount * ((double)discountAmount / 100);
    }

}

