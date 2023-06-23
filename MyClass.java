package StaticConcepts;

class MyClass {
    static int sharedVariable; // Static variable shared among instances

    int instanceVariable; // Instance-specific variable

    public void setValues(int sharedValue, int instanceValue) {
        sharedVariable = sharedValue; // Updating the shared variable
        instanceVariable = instanceValue; // Updating the instance-specific variable
    }

    public void displayValues() {
        System.out.println("Shared Variable: " + sharedVariable);
        System.out.println("Instance Variable: " + instanceVariable);
    }
}
