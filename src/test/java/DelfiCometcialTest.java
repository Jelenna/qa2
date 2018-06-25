import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class DelfiCometcialTest {
    private final String SITE_ADDRESS = "http://rus.delfi.lv/";
    private final By TEST_COMBLOCK = By.name("adoContainer_mkqqmgprmnukkootpkmgmpgl");

    @Test
    public void delfiComercialTest() {

        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(SITE_ADDRESS); //4TOBI NE KOVIRJATSJA VO VSEM KODE

        List<WebElement> listOfElements = new ArrayList<WebElement>(); //avoska dlja kartohi
        listOfElements = driver.findElements(TEST_COMBLOCK); //najti mnozhestvennoe chislo kartohi
        //listOfElements.isEmpty(); //boolean true/false
        Assert.assertTrue("No Commercial Found", !listOfElements.isEmpty()); //ili assertFalse //assert eto proverka

    }
}