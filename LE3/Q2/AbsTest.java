public interface Testable {
    void display();
}

public abstract class AbsTest implements Testable {
    
}


//1.The AbsTest class will compile successfully without any errors.

//2.This is because AbsTest is an abstract class, and it is not required to provide an implementation for the display method. The display method remains abstract in the AbsTest class.

//3.Note that the display method in the Testable interface is public by default, so any implementation of display must also be public