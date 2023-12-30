import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class socialLogin {
   /* @Test
    public void BT() {
        WebDriver wd = new ChromeDriver();
        wd.get("https://uat-student.edunaa.com/");
        wd.manage().window().maximize();
        System.out.println("before test");
    }*/

    @Test
    public void BM() {
        WebDriver wd = new ChromeDriver();
        wd.get("https://uat-student.edunaa.com");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.findElement(By.xpath("//div[@class=\"nav-bar-right\"]//a[1]")).click();
        wd.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[5]/div[1]/div/div[1]/form/div[5]/button[1]")).click();
    }
        /*wd.findElement(By.className("social-login-btn-containt")).click();
        wd.switchTo().window("4690F1F3DCF194D267260B33A901A431");
        /*
        Set<String> handles = wd.getWindowHandles();
        System.out.println(handles);

        wd.findElement(By.xpath("//div[@class=\"nav-bar-right\"]//a[1]")).click();
         */

    }