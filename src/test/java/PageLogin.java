import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLogin {

    private static final String URL_BASE = "https://petstore.octoperf.com/actions/Catalog.action";
    private WebDriver browser;


    public PageLogin(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        this.browser = new ChromeDriver();
        browser.navigate().to(URL_BASE);
    }

    public void close() {
        this.browser.quit();
    }

    public void fillLoginForm(String username, String password) {
        browser.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();

        browser.findElement(By.name("username")).clear();
        browser.findElement(By.name("password")).clear();
        browser.findElement(By.name("username")).sendKeys(username);
        browser.findElement(By.name("password")).sendKeys(password);
    }

    public void submitLogin() {
        browser.findElement(By.name("signon")).click();
    }

    public String getMessageLogin() {
        return browser.findElement(By.id("WelcomeContent")).getText();
    }

    public void fillNewUserData() {
        browser.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
        browser.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
        browser.findElement(By.name("username")).sendKeys("usertest2");
        browser.findElement(By.name("password")).sendKeys("123");
        browser.findElement(By.name("repeatedPassword")).sendKeys("123");
        browser.findElement(By.name("account.firstName")).sendKeys("Jhon");
        browser.findElement(By.name("account.lastName")).sendKeys("Call");
        browser.findElement(By.name("account.email")).sendKeys("email@email.com");
        browser.findElement(By.name("account.phone")).sendKeys("42394234");
        browser.findElement(By.name("account.address1")).sendKeys("Address");
        browser.findElement(By.name("account.address2")).sendKeys("Address2");
        browser.findElement(By.name("account.city")).sendKeys("New York");
        browser.findElement(By.name("account.state")).sendKeys("NY");
        browser.findElement(By.name("account.zip")).sendKeys("65353");
        browser.findElement(By.name("account.country")).sendKeys("USA");
        browser.findElement(By.name("newAccount")).click();

    }
}
