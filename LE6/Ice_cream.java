class Ice_cream extends Decorator
{
    Ice_cream(Offering offering)
    {
        this.offering=offering;
    }
    
    String getName()
    {
        return offering.getName()+"with Ice-cream ";
    }
    int getPrice()
    {
        return offering.getPrice();
    }
}