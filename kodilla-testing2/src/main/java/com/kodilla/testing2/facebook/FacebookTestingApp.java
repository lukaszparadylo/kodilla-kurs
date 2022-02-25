package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;


public class FacebookTestingApp {
    public static final String FIRSTNAME = "Jan";
    public static final String LASTNAME = "Kowalski";
    public static final String EMAIL = "Kowalski@com";
    public static final String PASSWORD = "123456";
    public static final String BIRTHDAY = "20";
    public static final Integer BIRTHMONTH = 10;
    public static final String BIRTHYEAR = "2000";
    public static final String WEBSITE = "https://www.facebook.com/";
    public static final String XPATH_ACCEPT_COOKE = "//button[@data-cookiebanner='accept_button']";
    public static final String XPATH_CLICK_REGISTER = "//div[contains(@class, \"_6ltg\")][2]";
    public static final String XPATH_CHEK_SEX ="/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input[@value=2]";


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(WEBSITE);
        driver.findElement(By.xpath(XPATH_ACCEPT_COOKE)).click();
        driver.findElement(By.xpath(XPATH_CLICK_REGISTER)).click();
        TimeUnit.SECONDS.sleep(1);

        driver.findElement(new By.ByName("firstname")).sendKeys(FIRSTNAME);
        driver.findElement(new By.ByName("lastname")).sendKeys(LASTNAME);
        driver.findElement(new By.ByName("reg_email__")).sendKeys(EMAIL);
        driver.findElement(new By.ByName("reg_passwd__")).sendKeys(PASSWORD);

        WebElement selectBirthdayDay = driver.findElement(new By.ByName("birthday_day"));
        Select selectDay= new Select(selectBirthdayDay);
        selectDay.selectByValue(BIRTHDAY);
        WebElement selectBirthdayMonth = driver.findElement(new By.ByName("birthday_month"));
        Select selectMonth = new Select(selectBirthdayMonth);
        selectMonth.selectByIndex(BIRTHMONTH);

        WebElement selectBirthdayYear = driver.findElement(new By.ByName("birthday_year"));
        Select selectYear = new Select(selectBirthdayYear);
        selectYear.selectByValue(BIRTHYEAR);

        driver.findElement(By.xpath(XPATH_CHEK_SEX)).click();
    }
}
