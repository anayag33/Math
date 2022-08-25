package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Math.E = " + Math.E);
        System.out.println("MathClass.E = " + MathClass.E);
        System.out.println("Math.PI = " + Math.PI);
        System.out.println("MathClass.PI = " + MathClass.PI);
        MathClass m = new MathClass();
        // You can access static variables through objects and class.
        // But you cannot access nonstatic variables through the class.
        System.out.println("m.E = " + m.E);
        System.out.println("m.PI = " + m.PI);
        System.out.println("Math.abs(4.0) = " + Math.abs(4.0));
        System.out.println("MathClass.abs(4.0) = " + MathClass.abs(4.0));
        System.out.println("Math.abs(4) = " + Math.abs(4));
        System.out.println("MathClass.abs(4) = " + MathClass.abs(4));

        MathClass m2 = new MathClass();
        System.out.println("m2.absNS(4.0) = " + m2.absNS(4.0));
        System.out.println("m2.abs(4.0) = " + m2.abs(4.0));
        System.out.println("m2.absNS(4) = " + m2.absNS(4));
        System.out.println("m2.abs(4) = " + m2.abs(4));

        // Calling nonstatic methods from the class is illegal.
        // What are the illegal method calls?
        // Write these as comments in your code.
        // Illegal:

        // ________MathClass.absNS(4.0)_____________________

        // ________MathClass.absNS(4)_____________________

        System.out.println("m2.sqrtNS(1) = " + m2.sqrtNS(1));
        System.out.println("m2.sqrtNS(4) = " + m2.sqrtNS(4));
        System.out.println("m2.sqrtNS(9) = " + m2.sqrtNS(9));
        System.out.println("m2.sqrtNS(140) = " + m2.sqrtNS(140));

        // Calling nonstatic methods from the class is illegal.
        // What are the illegal method calls?
        // Write these as comments in your code.
        // Illegal:

        // ________MathClass.sqrtNS(4)_____________________

        // ________MathClass.sqrtNS(140)___________________

        MathClass m3 = new MathClass();
        for(int i=0; i<10; i++)
            System.out.println("m3.sqrtNS(" + i + ") = " + m3.sqrtNS(i));
        // Guess what this will print out before running:
        System.out.println("MathClass.getCount() = " + MathClass.getCount());
        System.out.println("m3.getCount() = " + m3.getCount());

    }
}
