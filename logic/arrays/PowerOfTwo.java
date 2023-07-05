package logic.arrays;       // SUBMITTED

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 10245123;
        System.out.println(power(num));
//        System.out.println("Multiplication is: " + multiple(num));
    }

    private static boolean power(int num) {
        return num > 0 && (num & (num - 1) )== 0;
    }


}
