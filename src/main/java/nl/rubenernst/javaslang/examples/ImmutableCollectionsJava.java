package nl.rubenernst.javaslang.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ImmutableCollectionsJava {
    public static void main(String[] args) {
        List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList<String>());
        unmodifiableList.add("id");
    }
}
