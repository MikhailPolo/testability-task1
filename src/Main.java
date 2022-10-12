public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 900;
        int miles = service.bonus(price);
        System.out.println(miles);
    }
}