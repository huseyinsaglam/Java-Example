package com._16_stringJoiner;

import java.util.StringJoiner;

public class Example {

    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner("-");
        joiner.add("Logan");
        joiner.add("Magneto");
        joiner.add("Rogue");
        joiner.add("Storm");
        System.out.println(joiner);

        StringJoiner mystring = new StringJoiner("-", "(", ")");

        // Joining multiple strings by using add() method
        mystring.add("Negan");
        mystring.add("Rick");
        mystring.add("Maggie");
        mystring.add("Daryl");

        // Displaying the output String
        System.out.println(mystring);
    }
}
