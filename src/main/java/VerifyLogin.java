import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyLogin {

    public void login(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\gouri\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.asda.com/");
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/ul/li[4]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/div[1]/div/div/input")).sendKeys("1test@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Abcd@1234");
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/form/button")).click();
       // WebElement test1=driver.findElement(By.id("FxSoODccdFgJqUZ"));
        //Actions actions=new Actions(driver);
//gigitactions.clickAndHold(test1).build().perform();

    }
}
