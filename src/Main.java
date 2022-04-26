public class Main {
    public static void main(String[] args) {
        int cash = 100;
        int bonus = 100;
        int replenishment = 1100;
        int bonuscash;
        if (replenishment > 1000) {
            bonuscash = (replenishment / bonus);
        } else {
            bonuscash = 0;
        }
        System.out.println("Итоговый счет: " + (cash + replenishment + bonuscash) + " рублей");
        System.out.println(bonuscash + " бонусных рублей");


    }
}
