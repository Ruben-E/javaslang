package nl.rubenernst.javaslang.examples;

import nl.rubenernst.javaslang.data.Address;
import nl.rubenernst.javaslang.data.User;
import nl.rubenernst.javaslang.data.UserRepository;

import java.util.Optional;

public class OptionJava8 {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        Optional<User> userOptional = userRepository.findOneOptional("id");
        if(userOptional.isPresent()) {
            userOptional.get();
        }

        String street = userOptional.flatMap(User::getAddressOptional)
                .map(Address::getStreet)
                .orElseGet(() -> "");

        System.out.println(street);
    }
}
