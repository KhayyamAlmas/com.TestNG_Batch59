package tests.day17_pom;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_YeniDriverIlkClass {

    @Test (groups = "grup1")
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");
        /*
        Bugune kadar TestBase classına extends ederek kullandıgımız driver yerine bundan sonra
        Driver classından kullanacagımız getDriver static methodunu kullanacagız.

        Driver.getDriver()    in
        driver               out
         */
        Driver.getDriver().get("https://www.duolingo.com");
        Driver.getDriver().get("https://www.facebook.com");
        Driver.closeDriver();
    }
}
