package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {

    // Categories: Women
    @FindBy(xpath = "//*[@id='footer']/div/section[2]/h4")
    private WebElement titleCategories;

    // Information: Specials...
    @FindBy(xpath = "//*[@id='block_various_links_footer']/h4")
    private WebElement titleInformation;

    // My Account: My Orders...
    @FindBy(xpath = "//*[@id='footer']/div/section[5]/h4")
    private WebElement titleMyAccount;

}
