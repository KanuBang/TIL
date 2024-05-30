package javaAlgorithm.UTILS;

public class NumToString {
    public static void main(String[] args) {
        int i = 1234;
        String i1 = String.valueOf(i);
        String i2 = Integer.toString(i);

        double d = 1.23;
        String d1 = String.valueOf(d);
        String d2 = Double.toString(d);

        float f = 1.23f;
        String f1 = String.valueOf(f);
        String f2 = Float.toString(f);

        long l = 123l;
        String l1 = String.valueOf(l);
        String l2 = Long.toString(l);

        short s = 123;
        String s1 = String.valueOf(s);
        String s2 = Short.toString(s);
    }
}
