package lesson5.homework;

public class MainHw {
    public static void main(String[] args) {
        System.out.println(recPow(2,10));
    }

    static int recPow(int a, int b) {
        if (b == 1) {
            return a;
        }
        return recPow(a, b - 1) * a;
    }


}
