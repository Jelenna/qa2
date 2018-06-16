 import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class WebTestDelfi {

    private final String DELFI_NEWS = "http://rus.delfi.lv/";
    private final String ARTICLE = "Завод за 1 лат. Экономист Эдмунд Крастиньш готовит книгу о том, как делили промышленность Латвии в 1990-х";
    private final By NEWS_TITLE = By.xpath(".//a[@class='top2012-title']");


    @Test
    public void pageTest2 () {

        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(DELFI_NEWS);

        List<WebElement> mainArticle = new ArrayList<WebElement>();
        mainArticle = driver.findElements(NEWS_TITLE);

        boolean isArticleFound = false;
        for (int i = 0; i < mainArticle.size(); i++) {
            if (mainArticle.get(i).getText().equals(ARTICLE)) {
                isArticleFound = true;
                break;
            }

        }
        Assert.assertTrue("No NEWS here!", isArticleFound);
       // driver.quit();

    }
}
