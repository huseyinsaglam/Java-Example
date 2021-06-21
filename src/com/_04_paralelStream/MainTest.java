package com._04_paralelStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MainTest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<List<Integer>> list1 = Optional.ofNullable(list);

        System.out.println(" 1- PARALEL STREAM = MultıThread yapıda stream oluşturmamıza yaramaktadır. " +
                "Burada dikkat edilmesi gereken, eğer sıralı bir şekilde işliyorsak sırası bozulabilmektedir. " +
                "Yani kaynak çalışırken eğer ilk önce bitenin ilk eleman olmasını istiyorsak paralel Stream kullanamayız.\n" +
                "\n" +
                "Paralel Stream kulandığımızda kaynak içerisinde elemanlar aynı anda birden fazla şekilde operasyonlara tabi tutulurlar," +
                " yani bir sonraki elemanın işleme girmesi için şuanki elemanın işlemden çıkması gerekmemektedir." +
                "Aşagıdaki verilen kod örneği çalıştırıldığından farkedileceği üzere her çalışmada ekrana yazılan verinin sırası değişmektedir. " +
                "Sıranın bozulması dezavantaj gibi dursada performans açısından paralel olarak veriyi işlemek avantaj sağlayacaktır.");
        list1.ifPresent( list2 -> list2.parallelStream().filter(p -> (p%2)==1).forEach(System.out::println));

        System.out.println("2- STREAM = ");
        list1.ifPresent( list2 -> list2.stream().filter(p -> (p%2)==1).forEach(System.out::println));

        System.out.println("3- STREAM PARALEL = ");
        list1.ifPresent( list2 -> list2.stream().parallel().filter(p -> (p%2)==1).forEach(System.out::println));
    }

}
