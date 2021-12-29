package course1.lesson3;

public class LogicApp {

    public static void main(String[] args) {
        // ИЛИ  ||  |    +
        // 0 0 -> 0
        // 0 1 -> 1
        // 1 0 -> 1
        // 1 1 -> 1
        // И    &&  &   *
        // 0 0 -> 0
        // 0 1 -> 0
        // 1 0 -> 0
        // 1 1 -> 1
        // НЕ   !

        int a = 0;
        if (isPositive(a) && !isZero(a) || !isPositive(a)) {
            System.out.println("Положительно и не 0");
        }



        if (!isPositive(a) || isZero(a)) {

        }
    }


    public static boolean isPositive(int val) {
        return val >= 0;
    }


    public static boolean isZero(int val) {
        return val == 0;
    }
}
