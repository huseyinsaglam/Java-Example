package com._11_stream;

import java.util.List;
import java.util.function.Predicate;

public class Example1 {

    public static void main(String[] args) {

        Predicate<Student> p1 = p -> p.stuName.startsWith("A");
        Predicate<Student> p2 = s -> s.stuAge < 40;
        Predicate<Student> p3 = s -> s.stuAge < 40 && s.stuName.startsWith("P");

        List<Student> list = Student.getStudents();

        // allMatch () yöntemi, akımın tüm öğeleri, verilen yüklem, aksi takdirde yanlış döndürür

        boolean b1 = list.stream().allMatch(p1);
        System.out.println("list.stream().allMatch(p1): "+b1);

        boolean b2 = list.stream().allMatch(p2);
        System.out.println("list.stream().allMatch(p2): "+b2);

        boolean b3 = list.stream().allMatch(p3);
        System.out.println("list.stream().allMatch(p3): "+b3);

        // noneMatch () yöntemi, akış elemanlarından hiçbiri verilen yüklemle eşleşmezse true değerini döndürür

        boolean a1 = list.stream().noneMatch(p1);
        System.out.println("list.stream().noneMatch(p1): "+a1);

        boolean a2 = list.stream().noneMatch(p2);
        System.out.println("list.stream().noneMatch(p2): "+a2);

        // anyMatch () yöntemi herhangi bir Akış öğesinin eşleşip eşleşmediğini kontrol eder

        boolean c3 = list.stream().anyMatch(p1);
        System.out.println(c3);
        boolean c4 = list.stream().anyMatch(p2);
        System.out.println(c4);
    }
}
