package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SocialPage {

    private WebDriver driver;

    /**
     * Newsletter
     */
    @FindBy(xpath = "//*[@id='newsletter_block_left']/h4")
    private WebElement titleNewsletter;
    @FindBy(xpath = "//*[@id='newsletter-input']")
    private WebElement emailNewsletter;
    @FindBy(xpath = "//p[contains(@class,'alert')]")
    private WebElement alertNewsletter;

    /**
     * Social links
     */
    @FindBy(xpath = "//*[@id='social_block']/h4")
    private WebElement socialTitle;
    @FindBy(xpath = "//*[@id='social_block']/ul/li[1]/a")
    private WebElement socialFacebook;
    @FindBy(xpath = "//*[@id='social_block']/ul/li[2]/a")
    private WebElement socialTwitter;
    @FindBy(xpath = "//*[@id='social_block']/ul/li[3]/a")
    private WebElement socialYouTube;
    @FindBy(xpath = "//*[@id='social_block']/ul/li[4]/a")
    private WebElement socialGooglePlus;

    public String getNewsletterTitle() {
        return titleNewsletter.getText();
    }
    public String getNewsletterEmail() {
        return emailNewsletter.getText();
    }
    public String getNewsletterAlert() {
        return alertNewsletter.getText();
    }

    public String getSocialTitle() {
        return socialTitle.getText();
    }
    public String getSocialFacebookUrl() {
        return socialFacebook.getAttribute("href");
    }
    public String getSocialTwitterUrl() {
        return socialTwitter.getAttribute("href");
    }
    public String getSocialYouTubeUrl() {
        return socialYouTube.getAttribute("href");
    }
    public String getSocialGooglePlusUrl() {
        return socialGooglePlus.getAttribute("href");
    }

}
