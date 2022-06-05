import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithBlankEmailAndPassword {
    public void loginWithBlank(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\gouri\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.asda.com/");
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/button")).click();
        System.out.println("The System Shows:Enter your email or phone number & Enter your password");
    }
}
