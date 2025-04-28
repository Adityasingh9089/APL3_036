class Rum extends Decorator
{
    Rum(Offering offering)
    {
        this.offering=offering;
    }
    String getName()
    {
        return offering.getName()+"with Rum is";
    }
    int getPrice()
    {
        return offering.getPrice();
    }
}