package org.example.task2;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] a = new String[10];
        for (int i=0; i<10; i++ ) {
            a[i] = "qw";
        }
        Character[] b = new Character[10];
        for (int i=0; i<10; i++ ) {
            b[i] = 12;
        }
        Object[] c = {new String("qwe"), (Double).3, new ArrayList<Character>()};
        Object[] e = {new String("qwe"), (Float).3f, new ArrayList<String>()};

        System.out.println(compareArray(a, b));
        System.out.println(compareArray(c, e));


    }

    public static <T> Boolean compareArray(T[] a, T[] b) {
        if (a.length == b.length) {
            for (int i = 0 ; i < a.length ; i++) {
                if (!a[i].getClass().equals(b[i].getClass())) {
                    return false;
                }
            }
        }else return false;
        return true;
    }

}
