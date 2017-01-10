package nl.rubenernst.javaslang.examples;

import nl.rubenernst.javaslang.data.Address;
import nl.rubenernst.javaslang.data.User;
import nl.rubenernst.javaslang.data.UserRepository;

import java.util.Optional;

public class OptionJavaslang {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        String street = userRepository.findOneOption("id")
                .flatMap(User::getAddressOption)
                .map(Address::getStreet)
                .getOrElse("");

        System.out.println(street);
    }
}
