package nl.rubenernst.javaslang.examples;

import javaslang.control.Option;
import nl.rubenernst.javaslang.data.User;
import nl.rubenernst.javaslang.data.UserRepository;

import static javaslang.API.*;
import static javaslang.Patterns.None;
import static javaslang.Patterns.Some;

public class PatternMatchingJavaslang {

    public static void main(String[] args) {
        int i = 1;

        String value = Match(i).of(
                Case($(1), "one"),
                Case($(2), "two"),
                Case($(), "other")
        );

        System.out.println(value);

        UserRepository userRepository = new UserRepository();
        Option<User> userOption = userRepository.findOneOption("id");

        String value2 = Match(userOption).of(
                Case(Some($()), "defined"),
                Case(None(), "empty")
        );

        System.out.println(value2);
    }


}
