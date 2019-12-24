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
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result: " + passed);

        int in1 = 180;
        int expected1 = 3;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("180 rubles are 3. Test result: " + passed1);

        int in2 = 10;
        int expected2 = 700;
        int out2 = euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("10 eur are 700. Test result: " + passed2);

        int in3 = 8;
        int expected3 = 480;
        int out3 = dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("8 dollars are 240. Test result: " + passed3);
        /* int euro = rubleToEuro(140);
        int usd = rubleToDollar(180);
        int ruble1 = euroToRuble(10);
        int ruble2 = dollarToRuble(8);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + usd + " usd.");
        System.out.println("10 euro are " + ruble1 + " ruble.");
        System.out.println("8 usd are " + ruble2 + " ruble.");*/
    }
}