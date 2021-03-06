import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Booking_task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");

        WebElement direction = driver.findElement(By.id("ss"));
        direction.sendKeys("Moscow");

        WebElement period = driver.findElement(By.xpath("//*[@data-mode='checkin']"));
        period.click();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        Date tenDays = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 5);
        Date fifteenDays = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String datePlusThreeDays = dateFormat.format(tenDays);
        String datePlusTenDays = dateFormat.format(fifteenDays);
        WebElement date1 = driver.findElement(By.xpath(String.format("//*[@data-date='%s']", datePlusThreeDays)));
        date1.click();
        WebElement date2 = driver.findElement(By.xpath(String.format("//*[@data-date='%s']", datePlusTenDays)));
        date2.click();

        WebElement search = driver.findElement(By.xpath("//*[@class='sb-searchbox__button ']"));
        search.click();
        TimeUnit.SECONDS.sleep(6);

        Actions builder = new Actions(driver);

        WebElement adults = driver.findElement(By.cssSelector("#group_adults"));
        builder.click(adults).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

        WebElement rooms = driver.findElement(By.cssSelector("#no_rooms"));
        builder.click(rooms).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

        WebElement newSearch = driver.findElement(By.xpath("//*[@class='sb-searchbox__button ']"));
        newSearch.click();
        TimeUnit.SECONDS.sleep(6);

        WebElement myBudget = driver.findElement(By.xpath("//*[@data-id='pri-1']"));
        myBudget.click();
        String budgetUpTo = myBudget.getText().substring(myBudget.getText().indexOf("-")).replaceAll("[^0-9]+", "");
        System.out.println("Budget per night " + budgetUpTo);
        int budgetPerNight = Integer.parseInt(budgetUpTo);
        TimeUnit.SECONDS.sleep(6);

        WebElement first = driver.findElement(By.xpath("(//*[contains(@class,'bui-price-display')]/div[2]/div)[1]"));
        String priceOfFirstElement = first.getText().replaceAll("[^0-9]+", "");
        int hotelPerNight = Integer.parseInt(priceOfFirstElement) / 5;
        System.out.println("Price per night " + hotelPerNight);

        Assert.assertTrue("Mistake", hotelPerNight <= budgetPerNight);
        driver.quit();
    }
}