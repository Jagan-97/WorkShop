package org.example.WorkShop;

import java.util.Scanner;
public class Validate{
    static Scanner sc = new Scanner(System.in);
    public static boolean ValidateMethod(String ValidateAplha){
    String Validate1="[A-Z][a-z]{3,}[$&+,:;=?@#|'<>.-^*()%!][0-9]{6,}";
    boolean result = ValidateAplha.matches(Validate1);
    return result;
    }
}