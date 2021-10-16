public class Main {
    public static void main(String[] args) {

        int price = 6000;
        int miles = 20;
        BonusMilesService service = new BonusMilesService();
        int bonus_miles = service.calculate(price, miles);
        System.out.println(bonus_miles);
    }
}
