package guru.qa.tests.properties;

import config.CredentilalsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class OwnerTests {

    CredentilalsConfig config = ConfigFactory.create(CredentilalsConfig.class);
    @Test
    @Tag("owner")
    void someTest1() {
        String login = config.login();
        String password = config.password();

        System.out.println("Login: " + login);
        System.out.println("Password: " + password);

        String message = format ("I logged in as %s with password %s", login, password);
        System.out.println("Message: " + message);
    }
}
