/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author ASUS
 */
class A {
    void callthis() {
        System.out.println("Inside Class A's Method!");
    }
}

class B extends A {
    void callthis() {
        System.out.println("Inside Class B's Method!");
    }
}

class C extends A {
    void callthis() {
        System.out.println("Inside Class C's Method!");
    }
}

class DynamicDispatch {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;

        ref = b;
        ref.callthis();

        ref = c;
        ref.callthis();

        ref = a;
        ref.callthis();
    }
}