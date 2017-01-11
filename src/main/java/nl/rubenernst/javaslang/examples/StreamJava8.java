package nl.rubenernst.javaslang.examples;

import nl.rubenernst.javaslang.data.UserRepository;

import java.util.stream.Collectors;

public class StreamJava8 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        userRepository.findAll().stream()
                .filter(user -> {
                    try {
                        return user.validate();
                    } catch (Exception e) {
                        return false;
                    }
                });
    }
}
