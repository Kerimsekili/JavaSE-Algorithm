package com.javase.algorithms.stringtokenizerexample;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String s = "I love Java Very MUCH.";

        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());

        System.out.println();

        st = new StringTokenizer(s,"a");
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());

        System.out.println();

        st = new StringTokenizer(s,"a",true);
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
