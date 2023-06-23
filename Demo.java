package StaticConcepts;

public class Demo {
    public static void main(String[] args) {
        
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();

        obj1.setNames("John", "America");
        obj2.setNames("Abinash", "India");
        
        System.out.println("names in obj1: ");
        obj1.displayNames();

        System.out.println("names in obj2: ");
        obj2.displayNames();
         

    }
}
