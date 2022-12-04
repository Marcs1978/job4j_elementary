package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MainTest {
    public static void main(String[] args) {
        short s = 1500;
        char c = (char) s;
        double d = c;
System.out.println("Результат вычисления: "+ d);
}
}
