import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Booking_task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");

        WebElement direction = driver.findElement(By.id("ss"));
        direction.sendKeys("Париж");

        WebElement period = driver.findElement(By.xpath("//*[@data-mode='checkin']"));
        period.click();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        Date threeDays = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        Date tenDays = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String datePlusThreeDays = dateFormat.format(threeDays);
        String datePlusTenDays = dateFormat.format(tenDays);
        WebElement date1 = driver.findElement(By.xpath(String.format("//*[@data-date='%s']", datePlusThreeDays)));
        date1.click();
        WebElement date2 = driver.findElement(By.xpath(String.format("//*[@data-date='%s']", datePlusTenDays)));
        date2.click();

        WebElement guests = driver.findElement(By.xpath("//*[@id='xp__guests__toggle']"));
        guests.click();

        WebElement adults = driver.findElement(By.xpath("//*[@aria-describedby='group_adults_desc'][2]"));
        adults.click();
        adults.click();

        WebElement rooms = driver.findElement(By.xpath("//*[@aria-describedby='no_rooms_desc'][2]"));
        rooms.click();

        WebElement search = driver.findElement(By.xpath("//*[@class='sb-searchbox__button ']"));
        search.click();
        Thread.sleep(6000);

        WebElement budget = driver.findElement(By.xpath("//*[@data-id='pri-5']"));
        budget.click();
        String budgetFrom = budget.getText().replaceAll("[^0-9]+", "");
        System.out.println("Budget " + budgetFrom);
        int budgetPerNight = Integer.parseInt(budgetFrom);
        Thread.sleep(6000);

        WebElement lowest = driver.findElement(By.xpath("//*[@class=' sort_category   sort_price ']"));
        lowest.click();
        Thread.sleep(6000);

        WebElement MinFromMax = driver.findElement(By.xpath("//*[@data-hotelid][1]//div[contains(@class,'bui-price-display__value prco-inline-block-maker-helper')]"));
        String minPriceFromMax = MinFromMax.getText().replaceAll("[^0-9]+", "");
        int hotelPerNight = Integer.parseInt(minPriceFromMax) / 7;
        System.out.println("Minimum price " + hotelPerNight);

        Assert.assertTrue("Mistake", hotelPerNight >= budgetPerNight);
    }
}