public class TelcoPromo {
    public static void main(String[] args)
    {
        TelcoSubscription smart = new Telco("Smart", 15, 500, false);
        TelcoSubscription globe = new Telco("Globe", 10, 450, true);
        TelcoSubscription ditto = new Telco("Ditto", 8, 400, true);

        UsagePromo promo = new TelcoAllowance();
        UsagePromo unli = (UsagePromo) new UnliCallTextPackage();

        smart.accept(promo);
        globe.accept(promo);
        ditto.accept(promo);

        System.out.println();

        smart.accept(unli);
        globe.accept(unli);
        ditto.accept(unli);
    }
}