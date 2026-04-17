import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleTest {

    @Test
    public void abrirGoogle() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // importante pro CI

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");

        System.out.println("Título: " + driver.getTitle());

        driver.quit();
    }
}
