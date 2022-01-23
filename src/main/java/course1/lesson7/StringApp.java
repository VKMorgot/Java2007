package course1.lesson7;

import java.util.Arrays;
import java.util.Locale;

public class StringApp {

    public static void main(String[] args) {
        String str = "String";
        System.out.println(Arrays.toString(str.toCharArray()));

        String str2 = new String(str.toCharArray());


        str.toUpperCase();

        System.out.println(str + " "+ str.toUpperCase());

        System.out.println(str.startsWith("S"));

        String stringUpper = "STrInG";
        System.out.println(str.equals(stringUpper));// false
        System.out.println(str.equalsIgnoreCase(stringUpper)); //true

       String s =  1 +" " + 2 + " smth else  "+ 3;

       StringBuilder stringBuilder = new StringBuilder(str);
       stringBuilder.append(1).append(" ").append(2);



       String newString = stringBuilder.toString();

        System.out.println(newString);


    }
}
