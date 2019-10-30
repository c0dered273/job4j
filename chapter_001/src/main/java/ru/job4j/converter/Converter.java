package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int outRE = rubleToEuro(140);
        int expRE = 2;
        boolean resultRE = outRE == expRE;
        System.out.println("140 rubles are " + outRE + " euro. Test result: " + resultRE);
        int outRD = rubleToDollar(240);
        int expRD = 4;
        boolean resultDE = outRD == expRD;
        System.out.println("240 rubles are " + outRD + " dollars. Test result: " + resultDE);
        int outER = euroToRuble(14);
        int expER = 980;
        boolean resultER = outER == expER;
        System.out.println("14 euros are " + outER + " rubles. Test result: " + resultER);
        int outDR = dollarToRuble(24);
        int expDR = 1440;
        boolean resultDR = outDR == expDR;
        System.out.println("24 dollars are " + outDR + " rubles. Test result: " + resultDR);

    }
}