import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercicio5 {
    @Test
    public void navegacaoEntrePaginas() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String titulo1 = driver.getTitle();

        driver.navigate().to("https://about.google/");
        String titulo2 = driver.getTitle();

        driver.navigate().back();
        Assertions.assertEquals(titulo1, driver.getTitle());

        driver.navigate().forward();
        Assertions.assertEquals(titulo2, driver.getTitle());

        driver.navigate().refresh();
        driver.quit();
    }
}