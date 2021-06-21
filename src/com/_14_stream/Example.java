package com._14_stream;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Maggie");
        names.add("Michonne");
        names.add("Rick");
        names.add("Merle");
        names.add("Governor");
        //forEach - the output would be in any order
        System.out.println("Print using forEach");
        names.stream()
                .filter(f->f.startsWith("M"))
                .parallel()
                .forEach(n->System.out.println(n));

        /* forEachOrdered - the output would always be in this order:
        çıktı her zaman sıra ile oluşur
         * Maggie, Michonne, Merle
         */
        System.out.println("Print using forEachOrdered");
        names.stream()
                .filter(f->f.startsWith("M"))
                .parallel()
                .forEachOrdered(n->System.out.println(n));
    }

}
