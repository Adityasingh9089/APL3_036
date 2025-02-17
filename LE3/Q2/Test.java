public interface Testable {
    void display();
}

public class Test implements Testable {
  
    public void display() {
        System.out.println("Display method in Test");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}



//When you compile this class, it will compile successfully without any errors 
//because the Test class provides an implementation for the display method as required by the Testable interface.