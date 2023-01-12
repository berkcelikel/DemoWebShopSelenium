package DemoWebShop;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class demowebshop extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement loginButton=driver.findElement(By.className("ico-login"));
        loginButton.click();

        WebElement emailInput=driver.findElement(By.xpath("//input[@autofocus='autofocus']"));
        emailInput.sendKeys("denemeberk@gmail.com");

        WebElement paswordInput=driver.findElement(By.xpath("//input[@name='Password']"));
        paswordInput.sendKeys("1234berk");

        WebElement loginButton1=driver.findElement(By.xpath("//input[contains(@class, 'login-button')]"));
        loginButton1.click();

        WebElement addToCardButton=driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]"));
        addToCardButton.click();

        WebElement clickShoppingCard=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='ico-cart'])[1]")));
        clickShoppingCard.click();

        WebElement selectCountry=driver.findElement(By.cssSelector("select[name='CountryId']"));
        Select selectcountry=new Select(selectCountry);
        selectcountry.selectByVisibleText("Turkey");

        WebElement zipCode=driver.findElement(By.cssSelector("input[name='ZipPostalCode']"));
        zipCode.clear();
        zipCode.sendKeys("168 00");

        WebElement clickTermsOfService=driver.findElement(By.id("termsofservice"));
        clickTermsOfService.click();

        WebElement clickCheckOut=driver.findElement(By.id("checkout"));
        clickCheckOut.click();

        WebElement company=driver.findElement(By.xpath("//input[@name='BillingNewAddress.Company']"));
        company.sendKeys("Key");

        WebElement city=driver.findElement(By.xpath("//input[@name='BillingNewAddress.City']"));
        city.sendKeys("Istanbul");

        WebElement address1=driver.findElement(By.xpath("//input[@name='BillingNewAddress.Address1']"));
        address1.sendKeys("Avcılar");

        WebElement address2=driver.findElement(By.xpath("//input[@name='BillingNewAddress.Address2']"));
        address2.sendKeys("avrupa");

        WebElement zip=driver.findElement(By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']"));
        zip.sendKeys("16800");

        WebElement phoneNumber=driver.findElement(By.xpath("//input[@name='BillingNewAddress.PhoneNumber']"));
        phoneNumber.sendKeys("5555555555");

        WebElement faxNumber=driver.findElement(By.xpath("//input[@name='BillingNewAddress.FaxNumber']"));
        faxNumber.sendKeys("1234");

        WebElement selectCountry1=driver.findElement(By.xpath("//select[@name='BillingNewAddress.CountryId']"));
        Select selectcountry1=new Select(selectCountry1);
        selectcountry1.selectByVisibleText("Turkey");

        WebElement continueAddressButton=driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
        continueAddressButton.click();

        WebElement continueShippingButton=driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        continueShippingButton.click();

        WebElement continueShippingMethodButton=driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
        continueShippingMethodButton.click();

        WebElement continuePaymentButton1=driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
        continuePaymentButton1.click();

        WebElement continuePaymentInfoButton=driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
        continuePaymentInfoButton.click();

        WebElement continuePaymentButton2=driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
        continuePaymentButton2.click();

        WebElement successMessage=driver.findElement(By.cssSelector("div[class='section order-completed']>div>strong"));

        Assert.assertTrue(successMessage.getText().equals("Your order has been successfully processed!"));

        WebElement lastContinueButton=driver.findElement(By.cssSelector("input[value='Continue']"));
        lastContinueButton.click();


    }
}
