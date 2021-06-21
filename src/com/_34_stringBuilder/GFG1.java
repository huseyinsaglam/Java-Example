package com._34_stringBuilder;

// Java code to illustrate StringBuilder

public class GFG1 {
    public static void main(String[] argv)
            throws Exception
    {

        // create a StringBuilder object
        // usind StringBuilder() constructor
        StringBuilder str
                = new StringBuilder();

        str.append("ABCGFG");

        // print string
        System.out.println("String = "
                + str.toString());

        // create a StringBuilder object
        // usind StringBuilder(CharSequence) constructor
        StringBuilder str1
                = new StringBuilder("AAAABBBCCCC");

        // print string
        System.out.println("String1 = "
                + str1.toString());

        // create a StringBuilder object
        // usind StringBuilder(capacity) constructor
        StringBuilder str2
                = new StringBuilder(10);

        // print string
        System.out.println("String2 capacity = "
                + str2.capacity());

        // create a StringBuilder object
        // usind StringBuilder(String) constructor
        StringBuilder str3
                = new StringBuilder(str1.toString());

        // print string
        System.out.println("String3 = "
                + str3.toString());


        String s1 = "merhaba java" ;
        System.out.println("maskeleme =  " + printMask(s1));
        char [] ch = s1.toCharArray ();
        System.out.println("toCharArray" + ch.toString());
        for ( int  i = 0 ; i <ch.length; i ++) {
            System.out.print (ch [i]);
        }
    }

    public static String printMask(String s){
        StringBuilder sb=new StringBuilder("");
        char[] chars =s.toCharArray();
        for (char aChar : chars) {
            sb.append("*");
        }
        return sb.toString();
    }

}
