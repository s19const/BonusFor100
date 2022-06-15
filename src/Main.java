public class Main {
    public static void main(String[] args) {

        int amount = 100;  // Исходный счет
        int addition = 1100; // Сумма пополнения
        int resultBonus = addition / 100;

        if (addition <= 1000) {
            System.out.println(amount + addition);
        } else {
            System.out.println(amount + addition + resultBonus);
        }
    }
}
