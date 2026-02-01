package pages;
import org.ini4j.Ini;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class ScooterMainPage {

    private WebDriver driver;

    public ScooterMainPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By scooterLabel = By.cssSelector("div.Header_Logo__23yGT a.Header_LogoScooter__3lsAR");
    private final By yandexLabel = By.cssSelector("div.Header_Logo__23yGT a.Header_LogoYandex__3TSOI");
    private final By createOrderButton = By.xpath("//div[@class='Home_FinishButton__1_cWm']//button[text()='Заказать']");

    private final By OrderStatusButton = By.cssSelector("div.Header_Nav__AGCXC button.Header_Link__1TAG7");

    public void clickSendOrderButton() {
        driver.findElement(createOrderButton).click();
    }

    public void ScrollTocSendOrderButton() {
        WebElement element = driver.findElement(createOrderButton);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});",
                element
        );
    }





















}
