import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Register_User {
    public static void main(String[] args) {
        WebDriver wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://uat-student.edunaa.com/");
        wd.manage().window().maximize();
        wd.findElement(By.xpath("//div[@class=\"nav-bar-right\"]//a[2]")).click();
        wd.findElement(By.name("fName")).sendKeys("Nikeeta");
        wd.findElement(By.name("mName")).sendKeys("S");
        wd.findElement(By.name("lName")).sendKeys("Soni");
        wd.findElement(By.name("email")).sendKeys("jamey@yopmail.com");
        wd.findElement(By.name("password")).sendKeys("Qwerty@123");
        wd.findElement(By.name("confirmPassword")).sendKeys("Qwerty@123");
        wd.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[5]/div[1]/div/div/form/div[2]/button")).click();
        wd.findElement(By.xpath("//input [@aria-label=\"Please enter verification code. Digit 1\"]")).sendKeys("1");
        wd.findElement(By.xpath("//input[@aria-label=\"Digit 2\"]")).sendKeys("5");
        wd.findElement(By.xpath("//input[@aria-label=\"Digit 3\"]")).sendKeys("7");
        wd.findElement(By.xpath("//input[@aria-label=\"Digit 4\"]")).sendKeys("3");
        wd.findElement(By.xpath("//input[@aria-label=\"Digit 5\"]")).sendKeys("8");
        wd.findElement(By.xpath("//input[@aria-label=\"Digit 6\"]")).sendKeys("3");
        wd.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/form/div[5]/div[1]/div/div[2]/button")).click();
        wd.quit();
    }
}
