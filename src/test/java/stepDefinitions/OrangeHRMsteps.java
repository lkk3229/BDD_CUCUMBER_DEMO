package stepDefinitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OrangeHRMsteps {

    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        // Setup WebDriver for Chrome, using WebDriverManager for automatic driver management
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        // Navigate to the OrangeHRM demo homepage
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("I verify that the logo is present on the page")
    public void i_verify_that_the_logo_present_on_page() {
        // Verify if the logo is displayed on the page
        WebElement logo = driver.findElement(By.xpath("//*[@id='divLogo']/img"));
        Assert.assertTrue("Logo is not displayed on the page", logo.isDisplayed());
    }

    @And("close browser")
    public void close_browser() {
        // Close the browser
        driver.quit();
    }
}
