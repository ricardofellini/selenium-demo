import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser {

    @Test
    public void CreateUsername(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
        browser.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
        browser.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
        browser.findElement(By.name("username")).sendKeys("usertest1");
        browser.findElement(By.name("password")).sendKeys("123");
        browser.findElement(By.name("repeatedPassword")).sendKeys("123");
        browser.findElement(By.name("account.firstName")).sendKeys("Jhon");
        browser.findElement(By.name("account.lastName")).sendKeys("Call");
        browser.findElement(By.name("account.email")).sendKeys("email@email.com");
        browser.findElement(By.name("account.phone")).sendKeys("42394234");
        browser.findElement(By.name("account.address1")).sendKeys("Adress");
        browser.findElement(By.name("account.address2")).sendKeys("Adress2");
        browser.findElement(By.name("account.city")).sendKeys("New York");
        browser.findElement(By.name("account.state")).sendKeys("NY");
        browser.findElement(By.name("account.zip")).sendKeys("65353");
        browser.findElement(By.name("account.country")).sendKeys("USA");

        browser.findElement(By.name("newAccount")).click();

        //browser.quit();
    }
}
