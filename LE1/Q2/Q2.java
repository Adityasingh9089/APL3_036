class Mother{
    int show(int a,int b){
        System.out.println("Hello World");
        return 0;
    }
}
class Child extends Mother{
    int show(int a,int b){
        System.out.println("Hello JUET");
        return 0;
    }
}
public class Application
{
	public static void main(String[] args) {
		Mother m= new Mother ( );
        m.show(7,8); // show of Mother is called
        Child ch=new Child ( ); 
        ch. show (7,8); // show ( ) inherited in Child from Mother is called
	}
}