import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercicio2 {
    @Test
    public void verificarTituloGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Assertions.assertEquals("Google", driver.getTitle());
        driver.quit();
    }
}