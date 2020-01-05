package com.zerobank.step_definitions;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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
}
