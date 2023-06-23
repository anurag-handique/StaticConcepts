package StaticConcepts;

/*

Static Variable: When a variable is declared as static in Java,
    it is shared among all instances of the class.
    This means that changes made to a static variable
    will affect all objects of that class. It's like
    a variable that all objects of the class can access and modify.
 */
public class StaticVariables {

    public static void main(String[] args) {

        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
        MyClass obj4 = new MyClass();


        obj1.setValues(10, 20);
        obj2.setValues(30, 40);
        obj3.setValues(40, 60);
        obj4.setValues(50, 80);

        System.out.println("Values in obj1:");
        obj1.displayValues(); // Shared Variable: 30, Instance Variable: 20

        System.out.println("Values in obj2:");
        obj2.displayValues(); // Shared Variable: 30, Instance Variable: 40

        System.out.println("Values in obj1:");
        obj1.displayValues(); // Shared Variable: 30, Instance Variable: 20

        System.out.println("Values in obj2:");
        obj2.displayValues(); // Shared Variable: 30, Instance Variable: 40

        //div

        System.out.println("Values in obj3:");
        obj3.displayValues();

        System.out.println("Values in obj4:");
        obj4.displayValues();

        System.out.println("Values in obj3:");
        obj3.displayValues();

        System.out.println("Values in obj4:");
        obj4.displayValues();
    }
    /*
    In this code, we have a class called MyClass with a static variable sharedVariable
     and an instance variable instanceVariable. When we create two instances of MyClass (obj1 and obj2)
      and call the setValues() method on each instance, we update both the shared and instance-specific variables.

   Upon displaying the values using the displayValues() method, we can observe that the shared variable sharedVariable
    retains the latest value assigned to it (30), regardless of which instance was used to modify it. However, the instance
     variable instanceVariable maintains its individual values for each instance (20 for obj1 and 40 for obj2).

This example demonstrates how changes to a static variable are reflected across all instances of the class, supporting
 the notion of a shared variable among the class instances.
     */
}
