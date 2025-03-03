public class Telco implements TelcoSubscription//Concrete Visitable Class
{
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(String telcoName, int dataAllowance, double promoPrice, boolean unliCallText)
    {
        this.telcoName = telcoName;
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    public String getTelcoName()
    {
        return telcoName;
    }
    public double getPromoPrice()
    {
        return promoPrice;
    }
    public boolean getUnliCallText()
    {
        return unliCallText;
    }

    @Override
    public void accept(UsagePromo promo) {
        System.out.println(promo.showAllowance(telcoName, promoPrice));
    }

    @Override
    public void accept(UnliCallTextOffer unliPackage) {
        System.out.println(unliPackage.showUnliCallsTextOffer(telcoName, unliCallText));
    }
}
