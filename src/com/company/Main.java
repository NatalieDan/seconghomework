package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isSum(10,3));
        checkPositive(-9);
        System.out.println(isNegative(99)? "Negative" : "Positive");
        String s="Enot";
        printString(s,5);
        System.out.println(isVis(900)? "Leap" : "NotLeap");
    }

    static boolean isSum(int a, int b){
        return (a+b)>=10 && (a+b)<=20;
    }

    static void checkPositive(int a){
        System.out.println(a>=0 ? "Positive" : "Negative");
    }

    static boolean isNegative(int a){
        return a<0;
    }

    static void printString(String s,int a){
        for(int i=0;i<a;i++){
            System.out.println(s);
        }
    }

    static boolean isVis(int a){
        return (a%4 == 0 && a%100 != 0) || a%400 == 0;
    }
}
