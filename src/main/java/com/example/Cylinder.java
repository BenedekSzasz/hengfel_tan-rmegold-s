package com.example;

import java.util.InputMismatchException;

public class Cylinder {
    
    public static double calcSurface(double radius, double height) {
        if (radius<=0) {
            throw new InputMismatchException("Hiba! A sugár nagyobb kell legyen mint 0!");
        }
        if (height<=0) {
            throw new InputMismatchException("Hiba! A magasságnak nagyobbnak kell lennie mint 0!");
        }
        return (2*Math.PI*Math.pow(radius, 2))+ (2*Math.PI*radius*height);
    }
}
