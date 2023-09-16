package com.project9;

public class ModifierTest {
    private static int privateField;
    static int defaultField;
    protected static int protectedField;
    public static int publicField;

    public void print(){
        System.out.println("In Modifier test");
    }

    public static void main(String[] args) {
        privateField = 1;
        defaultField = 2;
        protectedField = 3;
        publicField = 4;
        ModifierTest modifierTest = new ModifierTest();
        modifierTest.print();
    }
}
