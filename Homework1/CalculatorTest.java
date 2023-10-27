import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
class CalculatorTest {
    @Test
    void testCalculateDiscount() {
        assertThat(Calculator.calculateDiscount(1000, 20)).isEqualTo(800.0);
    }
    @Test
    void testCalculateDiscountZero() {
        assertThat(Calculator.calculateDiscount(1000, 0)).isEqualTo(1000.0);
    }
    @Test
    void testDiscountIsNegative(){
        assertThatThrownBy(() -> {
            Calculator.calculateDiscount(1000, -1);
        }).hasMessage("Неправильно указан размер скидки");
    }
    @Test
    void testDiscountHundred(){
        assertThatThrownBy(() -> {
            Calculator.calculateDiscount(1000, 100);
        }).hasMessage("Неправильно указан размер скидки");
    }
    @Test
    void  testDiscountMoreThanHundred(){
        assertThatThrownBy(() -> {
            Calculator.calculateDiscount(1000, 150);
        }).hasMessage("Неправильно указан размер скидки");
    }
    @Test
    void  testPurchaseAmountIsNegative(){
        assertThatThrownBy(() -> {
            Calculator.calculateDiscount(-1, 10);
        }).hasMessage("Цена не может быть отрицательной");
    }
}