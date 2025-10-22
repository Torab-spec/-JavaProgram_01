abstract class Parent {

    public Parent() {
        System.out.println("I am parent class constructor");
    }

    public void sayHello() {
        System.out.println("Hello parent abstract class...");
    }

    // greet is abstract method | which is declared , but it has no body or not implemented || only declared
    abstract public void greet();


}

class Child extends Parent {
    @Override
    // Here the greet method is implement which is declared in abstract class
    public void greet() {
        System.out.println("Good morning abstract method...");
    }

    public void welcome() {
        System.out.println("Welcome child concrete class ...");
    }
}

abstract class Child1 extends Parent {
    public void sayHi() {
        System.out.println("Hi child1 abstract class...");
    }
}

public class CWH_Lec_53 {
    public static void main(String[] args) {

//        Parent parent = new Parent() ;  //Not allowed
//        Child child = new Child();  // Allowed
//        child.sayHello();
//        child.greet();
//        child.welcome();

//        Child1 child1 = new Child1(); // Not allowed

        // DMD between abstract parent class and concrete child class

        Parent dmd = new Child();
        dmd.sayHello();
        dmd.greet();
//        dmd.welcome();  //not allowed

    }
}



