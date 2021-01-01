package com.example.mylibrary;

public class MyMath {

    public  static  int sum(int ... x){
        int sum=0;
        for (int i : x) {
            sum+=i;
        }
        return sum;
    }
    public  static  int sub(int ... y){
        int sub = 0;
        for (int i : y) {
            sub -= i;
        }
        return sub;
    }

    int percent(int x, int percent) {
        return (x * percent) / 100;
    }

    public static boolean isNumber(Object object) {
        return object instanceof Number;
    }
    public  static Exception  throwError(){
        throw  new NumberFormatException("some mistakes occured");
    }

    public static int lacoste() {
        return 1;
    }

    public static void perl() {
        System.out.println("fuller");
    }

}
