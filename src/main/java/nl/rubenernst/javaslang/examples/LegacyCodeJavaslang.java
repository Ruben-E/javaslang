package nl.rubenernst.javaslang.examples;

import javaslang.control.Try;
import nl.rubenernst.javaslang.data.IbanChecker;

import static javaslang.Function1.lift;

public class LegacyCodeJavaslang {

    public static void main(String[] args) {
        String iban = lift(IbanChecker::check)
                .apply("NL12")
                .getOrElse("");

        iban = Try.of(() -> IbanChecker.check("NL12"))
                .getOrElse("");
    }


}
