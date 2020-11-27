package com.company;
public class block6_z8 {
    public static void task8() {
        System.out.println(rim_num(16));
    }
    public static String rim_num(int n) {
        String res = "";
        if (n>0 && n<=3999) {
            while (n >= 1000) {
                res += "M";
                n -= 1000;
            }
            while (n >= 900) {
                res += "CM";
                n -= 900;
            }
            while (n >= 500) {
                res += "D";
                n -= 500;
            }
            while (n >= 400) {
                res += "CD";
                n -= 400;
            }
            while (n >= 100) {
                res += "C";
                n -= 100;
            }
            while (n >= 90) {
                res += "XC";
                n -= 90;
            }
            while (n >= 50) {
                res += "L";
                n -= 50;
            }
            while (n >= 40) {
                res += "XL";
                n -= 40;
            }
            while (n >= 10) {
                res += "X";
                n -= 10;
            }
            while (n == 9) {
                res += "IX";
                n -= 9;
            }
            while (n >= 5) {
                res += "V";
                n -= 5;
            }
            while (n == 4) {
                res += "IV";
                n -= 4;
            }
            while (n >= 1) {
                res += "I";
                n -= 1;
            }
        }
        else System.out.println("Несоответствующее число!");
        return res;
    }
}
