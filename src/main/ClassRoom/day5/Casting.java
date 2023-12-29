package day5;

public class Casting {
    public static void main(String[] args) {
//        implicit casting
        int int1 = 10;
        double double1 = int1;
        System.out.println("int= " + int1);
        System.out.println("double= " + double1);

        long long1 = 393;
        short short1 = (short) long1;
        System.out.println(long1);
        System.out.println(short1);
    }
}
