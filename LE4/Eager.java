/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Singleton
{
private static Singleton uniqueInstance=new Singleton();
private Singleton(){}
public static Singleton getInstance()
{
    return uniqueInstance;
}
}

public class Eager{
    public static void main(Strings[] args)
    {
           Singleton S1=new Singleton();
    }
}