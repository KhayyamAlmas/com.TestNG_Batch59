package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

    BrcPage brcPage=new BrcPage();

    @Test
    public void yanlisSifre() throws InterruptedException {

        // Bir test method olustur positiveLoginTest()
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        // login butonuna bas
        brcPage.ilkLoginButonu.click();

        // test data user email: customer@bluerentalcars.com
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));

        // test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));

        // login butonuna bas
        brcPage.ikinciLoginButonu.click();

        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());

        Driver.closeDriver();

        // bu class'da 2 test methodu daha olusturun
        // biri yanlisKullanici
        // digeri de yanlis sifre ve kullanic adi
    }
}
