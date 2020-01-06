package com.zerobank.step_definitions;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigation {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
        WebElement signInButton = Driver.get().findElement(By.id("signin_button"));
        signInButton.click();
        String username = ConfigurationReader.getProperty("username");
        Driver.get().findElement(By.id("user_login")).sendKeys(ConfigurationReader.getProperty("username"));
        Driver.get().findElement(By.id("user_password")).sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        String expectedTitle = "Zero - Account Summary";
        Assert.assertEquals(expectedTitle, Driver.get().getTitle());
    }

    @When("the user clicks on {string} link on the {string} page")
    public void the_user_clicks_on_link_on_the_page(String string, String string2) {
        //string = Savings
        Assert.assertEquals(string2,Driver.get().getTitle());
        WebElement element = Driver.get().findElement(By.linkText(string));
        element.click();

    }

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String string) {
        Assert.assertEquals(string,Driver.get().getTitle());
    }

    @Then("Account dropdown should have {string} selected")
    public void account_dropdown_should_have_selected(String string) {

            Select select = new Select(Driver.get().findElement(By.id("aa_accountId")));
            WebElement DropDownElement = select.getFirstSelectedOption();
            String DropDownElementText = DropDownElement.getText();
            Assert.assertEquals(string,DropDownElementText);
        }
    }
