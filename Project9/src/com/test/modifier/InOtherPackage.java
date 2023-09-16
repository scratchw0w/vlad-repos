package com.test.modifier;

import com.project9.ModifierTest;

public class InOtherPackage extends ModifierTest {
    public void print(){
        System.out.println("In other package");
    }
    public static void main(String[] args) {
        publicField = 5;
        protectedField = 6;
        ModifierTest modifierTest = new InOtherPackage();
        modifierTest.print();
    }
}
