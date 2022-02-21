import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MobileTest {
    @Test
    public void checkMobilePayment() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://next.privat24.ua/mobile");

        driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);

        By phoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
        driver.findElement(phoneNumber).sendKeys("931305246");

        By amount = By.xpath("//input[@data-qa-node='amount']");
        driver.findElement(amount).sendKeys("1");

        By numberdebitSource = By.xpath("//input[@data-qa-node='numberdebitSource']");
        driver.findElement(numberdebitSource).sendKeys("4006895689048337");

        By expDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
        driver.findElement(expDate).sendKeys("03/23");

        By cvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        driver.findElement(cvv).sendKeys("480");

        By firstNamedebitSource = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        driver.findElement(firstNamedebitSource).sendKeys("Peter");

        By lastNamedebitSource = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        driver.findElement(lastNamedebitSource).sendKeys("Strogs");

        By submit = By.xpath("//button[@data-qa-node='submit']");
        driver.findElement(submit).sendKeys("click next page");


        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        By button = By.xpath("//button[contains(text(), 'Сплатити')]");
        driver.findElement(button).sendKeys("click next page");












    }
}
