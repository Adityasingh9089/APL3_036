class Singleton
{
private static Singleton uniqueInstance;
private Singleton(){}
public static Singleton getInstance()
{
    if(uniqueInstance==null)
        uniqueInstance=new Singleton();
    return uniqueInstance;
}
}


public class Lazy{
    public static void main(Strings[] args)
    {
        Singleton S1=new Singleton();
    }
}