class TelcoAllowance implements UsagePromo
{
    @Override
    public String showAllowance(String telcoName, double money)
    {
        return telcoName + " offers a data plan for \u20B1" + money + " per month.";
    }
}