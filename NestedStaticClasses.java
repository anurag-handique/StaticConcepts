package StaticConcepts;

/*
 Static Classes: Java allows nested classes to be declared as static.
  A static nested class is associated with the outer class rather than
  instances of the outer class. It can be accessed directly without
  creating an instance of the outer class.
 */
public class NestedStaticClasses {

    public static void main(String[] args) {
        System.out.println("in the main class");
    }

    static class nested {
        static void main(String[] args) {
            System.out.println("in nested class");
        }
    }
}
