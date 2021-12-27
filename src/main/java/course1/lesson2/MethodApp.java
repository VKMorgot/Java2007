package course1.lesson2;

public class MethodApp {

    public static final String TEMPLATE = "int = %d string = %s\n";

    public static void main(String[] args) {

        int v1 = multiplication(4, 10);
        int v2 = multiplication(5, 6.0);


        PrintUtil.printFormatted("v1 = " + v1 + " v2 = " + v2 + " v3 = " + multiplication(v1, v2));

        PrintUtil.printFormatted("string to format");


        System.out.printf(TEMPLATE, 10, "str");
        System.out.println();
        System.out.printf(TEMPLATE, 113, "st12313r");

        //TEMPLATE = "abc"; // нельзя

    }


    public static int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public static int multiplication(int n1, double n2) {
        return (int) (n1 * n2);
    }

    public static int multiplication(double n1, int n2) {
        return (int) (n1 * n2);
    }

    //можификатор доступа + тип значения + имя + Набор параметров


    //naming - ClassName MyClassName
    //methods, variables - loaerCaseUperCase methodName variableName

    //CONSTANTS  - UPPER_CASE (snake_case)_


    //type - void / real type

    //public - protected - (no modifier) default - private

}
