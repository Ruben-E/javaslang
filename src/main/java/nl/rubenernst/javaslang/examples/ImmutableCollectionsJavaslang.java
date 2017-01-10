package nl.rubenernst.javaslang.examples;

import javaslang.collection.List;

public class ImmutableCollectionsJavaslang {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        List<Integer> list1 = list.prepend(0);

        System.out.println(list);
        System.out.println(list1);
    }
}
