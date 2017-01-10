package nl.rubenernst.javaslang.examples;

import nl.rubenernst.javaslang.data.Address;
import nl.rubenernst.javaslang.data.User;
import nl.rubenernst.javaslang.data.UserRepository;

public class OptionJava {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        String street = "";
        User user = userRepository.findOne("id");
        if (user != null) {
            Address address = user.getAddress();
            if (address != null) {
                street = address.getStreet();
            }
        }
    }
}
