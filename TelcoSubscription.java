public interface TelcoSubscription //Visitable Interface
{
    public String getTelcoName();
    public double getPromoPrice();
    public boolean getUnliCallText();
    void accept(UsagePromo promo, double price);
    void accept(UnliCallTextOffer unliPackage, boolean unliCallText);

    void accept(UsagePromo promo);
}
