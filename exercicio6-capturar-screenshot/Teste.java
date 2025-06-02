import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercicio6 {
    @Test
    public void testeComScreenshot() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.google.com");
            Assertions.assertEquals("Google", driver.getTitle());
        } catch (AssertionError e) {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                Files.copy(src.toPath(), Paths.get("screenshot_falha.png"));
            } catch (IOException io) {
                io.printStackTrace();
            }
            throw e;
        } finally {
            driver.quit();
        }
    }
}