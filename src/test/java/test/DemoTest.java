package test;

import org.testng.annotations.Test;
import pages.CanCheckVisibility;
import utils.Browser;
import pages.HomePage;


@Test
public class DemoTest {
    public void canOpen() {
        Browser.openBrowser();
        //Test Site
        new HomePage().openWebsite();
        CanCheckVisibility vis;

        vis = new HomePage();
        vis.pageDisplayed();

        Browser.closeBrowser();
    }
}