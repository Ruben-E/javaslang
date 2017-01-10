package nl.rubenernst.javaslang.data;

import javaslang.control.Option;

import java.util.Optional;

public class UserRepository {
    public User findOne(String id) {
        return new User(id, new Address("Test"));
    }

    public Optional<User> findOneOptional(String id) {
        return Optional.of(new User(id, new Address("Test")));
    }

    public Option<User> findOneOption(String id) {
        return Option.of(new User(id, new Address("Test")));
    }
}