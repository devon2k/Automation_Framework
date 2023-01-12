package pages;

import org.openqa.selenium.By;
import static utils.automation.*;

public class HomePage implements CanCheckVisibility {

    private String url = "https://ailab.acr.org/";

                  //fields
    //private By loc_home_tab = By.xpath("//div[@id='root']/div[@class='css-q0pzru']/div[@class='layout-viewport']/header/div/div/a[@href='/']");
   // private By loc_contact_tab = By.ByCssSelector("a > button");
                  private By loc_home_tab = By.xpath("//a/span[text()='Home']");
    private By loc_enter_button = By.cssSelector("a > button");
    private By loc_page_banner = By.xpath("(//h1)[1]");

    //method
    public void openWebsite() {
        visit(url);
        pause(2);
    }

    @Override
    public boolean pageDisplayed() {
        click(loc_enter_button);
        pause(2);
        System.out.println("Checking Contact Page: ");
        return false;
    }
}
