package nl.rubenernst.javaslang.examples;

import nl.rubenernst.javaslang.data.Address;
import nl.rubenernst.javaslang.data.IbanChecker;
import nl.rubenernst.javaslang.data.User;
import nl.rubenernst.javaslang.data.UserRepository;

public class LegacyCodeJava {

    public static void main(String[] args) {
        String iban = "";
        try {
            iban = IbanChecker.check("NL12");
        } catch (Exception e) {
            // Do stuff
        }
    }


}
