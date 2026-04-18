import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

    @Test
    @Description("Abrir Google e validar título")
    public void abrirGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        System.out.println("Título: " + driver.getTitle());

        driver.quit();
    }
}
