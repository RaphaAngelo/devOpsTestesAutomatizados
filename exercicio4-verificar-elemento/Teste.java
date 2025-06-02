import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercicio4 {
    @Test
    public void verificarLinkSelenium() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver", org.openqa.selenium.Keys.RETURN);

        try {
            WebElement link = driver.findElement(By.partialLinkText("Selenium"));
            Assertions.assertTrue(link.isDisplayed());
        } catch (NoSuchElementException e) {
            Assertions.fail("Link do Selenium não encontrado!");
        } finally {
            driver.quit();
        }
    }
}