public class BonusMilesService {
    public int calculate(int price, int miles) {

        int miles_bonus = price / miles;
        //System.out.println(miles_bonus);
        return miles_bonus;
    }
}

