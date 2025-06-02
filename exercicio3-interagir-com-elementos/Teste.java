import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercicio3 {
    @Test
    public void buscarSeleniumNoGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement campoBusca = driver.findElement(By.name("q"));
        campoBusca.sendKeys("Selenium WebDriver");
        campoBusca.sendKeys(Keys.RETURN);
        driver.quit();
    }
}