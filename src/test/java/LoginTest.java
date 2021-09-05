import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {

    private PageLogin loginPage;

    @BeforeEach
    public void beforeEach() {
        this.loginPage = new PageLogin();
    }

    @AfterEach
    public void afterEach() {
        this.loginPage.close();
    }

    @Test
    public void shouldLoginTheApplicationNormally(){
        loginPage.fillLoginForm("usertest1", "123");
        loginPage.submitLogin();
        Assert.assertEquals("Welcome Jhon!", loginPage.getMessageLogin());
    }

    @Test
    public void createNewUser(){
        loginPage.fillNewUserData();
    }

}
