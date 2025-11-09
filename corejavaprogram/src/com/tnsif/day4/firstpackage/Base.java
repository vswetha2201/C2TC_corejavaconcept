package com.tnsif.day4.firstpackage;

public class Base {
    // Variables
    int varDefault = 10;          // default
    public int varPublic = 20;    // public
    private int varPrivate = 30;  // private
    protected int varProtected = 40; // protected

    // Methods
    void methodDefault() {
        System.out.println("Default access Base class");
        System.out.println("Default Variable: " + varDefault);
    }

    public void methodPublic() {
        System.out.println("Public access Base class");
        System.out.println("Public Variable: " + varPublic);
    }

    private void methodPrivate() {
        System.out.println("Private access Base class");
        System.out.println("Private Variable: " + varPrivate);
    }

    protected void methodProtected() {
        System.out.println("Protected access Base class");
        System.out.println("Protected Variable: " + varProtected);
    }

    // Public method to access private members
    public void accessPrivate() {
        System.out.println("Accessing private variable inside Base: " + varPrivate);
        methodPrivate();
    }
}
