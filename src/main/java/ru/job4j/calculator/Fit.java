package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height1 = 187;
        double man = Fit.manWeight(height1);
        short height2 = 170;
        double woman = Fit.womanWeight(height2);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 110 is " + woman);

    }
}
