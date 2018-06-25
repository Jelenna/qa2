import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTest {

    private final String DELFI_PAGE = "http://rus.delfi.lv/";
    private final By NEWS_NAME = By.xpath("//a[@class='top2012-title']");


    @Test

    public void pageTest() {

        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(DELFI_PAGE);

        WebElement newsName = driver.findElement(NEWS_NAME);
        newsName.click();

        //newsName.sendKeys("Test");
        Assert.assertEquals("Во время учений на полигоне в Адажи произошел пожар: загорелся лес - DELFI", driver.getTitle());
        driver.quit();

    }

    @Test

    public void pageTest2() {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(DELFI_PAGE);

        WebElement newsName = driver.findElement(NEWS_NAME);
        newsName.click();
        //newsName.sendKeys("Test");
        Assert.assertEquals("Во время учений на полигоне в Адажи произошел пожар: загорелся лес - DELFI", driver.getTitle());

        driver.quit();
    }


}
