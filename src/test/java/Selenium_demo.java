import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_demo {
    public static void main (String[] args) {
        WebDriver wd = new ChromeDriver();
        wd.get("https://admin.qa.wellityhealth.app");
        wd.manage().window().maximize();
        wd.findElement(By.id("email")).sendKeys("wellity-admin@yopmail.com");
        wd.findElement(By.id("password")).sendKeys("Qwerty@123");
        wd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/form/button")).click();
        wd.quit();


    }
}
