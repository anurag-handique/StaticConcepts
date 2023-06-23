package StaticConcepts;

class StaticVariable {
    
    static String sharedVariable;
    String instanceVariable;

    public void setNames(String sharedName, String instanceName) {
        sharedVariable = sharedName;
        instanceVariable = instanceName;
    }

    public void displayNames() {
        System.out.println("SharedVariable: "+sharedVariable);
        System.out.println("InstanceVariable: "+instanceVariable);
    }
}
