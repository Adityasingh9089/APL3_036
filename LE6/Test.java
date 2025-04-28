class Test
{
    public static void main(String args[])
    {
        Offering offering=new Coffee();
        offering=new Ice_cream(offering);
        offering =new Ice_cream(offering);
        System.out.println(offering.getName()+" "+offering.getPrice());
    }
}