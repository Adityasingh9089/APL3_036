class Car{
    String name;
    int speed;
    void setDetails(int a ,String b){
        speed =a ;
        name = b;
    }
    void printcar(){
        System.out.println("name of car: "+name);
                System.out.println("Speed of car: "+speed);

    }
}

public class LE0
{
	public static void main(String[] args) {

    Car obj = new Car();
    obj.setDetails(89,"Thar");
    obj.printcar();

	}
}