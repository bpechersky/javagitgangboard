import java.sql.SQLOutput;
import java.util.Scanner;

public class Javaexercises {
    public static void main(String[] args) {
        Javaexercises javaexercises = new Javaexercises();
//        int diff21 = javaexercises.diff21(24);
//        System.out.println(diff21);
//        boolean parrotTrouble1 = javaexercises.parrotTrouble1(true,6);
//        System.out.println("if talking is " + true + " and hour is " + 6 + " then result is " + parrotTrouble1);
//        boolean parrotTrouble12 = javaexercises.parrotTrouble1(true,7);
//        System.out.println("if talking is " + true + " and hour is " + 7 + " then result is " + parrotTrouble12);
//
//        boolean parrotTrouble13 = javaexercises.parrotTrouble1(false,6);
//        System.out.println("if talking is " + false + " and hour is " + 7 + " then result is " + parrotTrouble13);
//
//        boolean parrotTrouble11 = javaexercises.parrotTrouble(true,8);
//        System.out.println("if talking is " + true + " and hour is " + 8     + " then result is " + parrotTrouble11);
        javaexercises.notString("candy");
        javaexercises.notString("not bad");
        javaexercises.notString("x");

        StringBuilder sb = new StringBuilder("kitty");
        String substring = sb.deleteCharAt(0).toString();
        System.out.println(substring);
        String dog = "dog";


    }


    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            System.out.println(str);
            return str;
        }
        System.out.println("not " + str);
        return "not " + str;
    }
    public  int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        System.out.println(hour);
        System.out.println(talking);
        return (talking && (hour < 7 || hour > 20));
        // Need extra parenthesis around the || clause
        // since && binds more tightly than ||
        // && is like arithmetic *, || is like arithmetic +
    }

    public boolean parrotTrouble1(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }
        else{
            return false;
        }
    }


}