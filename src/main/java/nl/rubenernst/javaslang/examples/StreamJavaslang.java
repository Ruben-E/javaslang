package nl.rubenernst.javaslang.examples;

import javaslang.control.Try;
import nl.rubenernst.javaslang.data.UserRepository;

public class StreamJavaslang {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        userRepository.findAll().stream()
                .filter(user ->
                        Try.of(user::validate)
                                .getOrElse(false));
    }
}
