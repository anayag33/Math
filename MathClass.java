package com.company;

public class MathClass {
    // Constants (Final Static Variables)
    public static final double E = 2.72;
    public static final double PI = 3.14;
    // Static/Class Variables
    private static int count = 0;
    // Nonstatic/Instance Variables
    // Constructors
    public MathClass(){

    }
    // Getters/Setters
    public static int getCount(){
        return count;
    }
    // Static Methods
    public static double abs(double value){
        count ++;
        double rv = 0;
        if(value<0){
            rv = 0-(value);
        }
        if(value>=0){
            rv = value;
        }
        return rv;
    }
    // Return a String such as "|-2|"
    public static String abs(int value){
        count ++;
        String rv = "|"+ value +"|";
        return rv;
    }
    // Nonstatic Methods
    public double absNS(double value){
        count ++;
        double rv = 0;
        if(value<0){
            rv = 0-(value);
        }
        if(value>=0){
            rv = value;
        }
        return rv;
    }
    public String absNS(int value){
        count ++;
        String rv = "|"+ value +"|";
        return rv;
    }
    //Ex, sqrtNS(5) => 2, sqrtNS(8) => 2, sqrtNS(9) => 3.
    public int sqrtNS(int value){
        count ++;
        int rv = 0;
        for (int i = 0; i<=value; i++){
            for (int j = i; j<=i; j++){
                if(i*j==value)
                    rv = i;
                else if (value>i*i && value<(i+1)*(i+1)){
                    rv = i;
                }
            }
        }
        return rv;
    }

}
