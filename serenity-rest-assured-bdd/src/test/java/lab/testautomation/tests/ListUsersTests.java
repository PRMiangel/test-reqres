package lab.testautomation.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class ListUsersTests {

    @Test
    public void verifyThatAllUsers() {
        SerenityRest.when().get("http://192.168.99.100:32769/").then().assertThat().statusCode(200);
    }
}
