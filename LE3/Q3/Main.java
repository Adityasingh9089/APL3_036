
public interface Flyable {
    void fly();
}

public interface Quackable {
    void quack();
}

public interface Squeakable {
    void squeak();
}

public interface Mute {
    void mute();
}


public interface Swimmable {
    void swim();
}

public class RubberDuck implements Swimmable, Squeakable {
    public void swim() {
        System.out.println("RubberDuck is swimming.");
    }

    public void squeak() {
        System.out.println("RubberDuck is squeaking.");
    }
}

public class WoodenDuck implements Swimmable, Mute {
    public void swim() {
        System.out.println("WoodenDuck is swimming.");
    }

    public void mute() {
        System.out.println("WoodenDuck is mute.");
    }
}

public class RedHeadDuck implements Swimmable, Flyable, Quackable {
    public void swim() {
        System.out.println("RedHeadDuck is swimming.");
    }

    public void fly() {
        System.out.println("RedHeadDuck is flying.");
    }

    public void quack() {
        System.out.println("RedHeadDuck is quacking.");
    }
}

public class LakeDuck implements Swimmable, Flyable, Quackable {
    public void swim() {
        System.out.println("LakeDuck is swimming.");
    }

    public void fly() {
        System.out.println("LakeDuck is flying.");
    }
    public void quack() {
        System.out.println("LakeDuck is quacking.");
    }
}


public class Main {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        rubberDuck.swim();
        rubberDuck.squeak();

        woodenDuck.swim();
        woodenDuck.mute();

        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}

