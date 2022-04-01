package StepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Hooks  {

    public static WebDriver driver;

    @Before
    public static void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\selenium\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        //  driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.of(5L, ChronoUnit.SECONDS));

    }
    @After
    public  static void  tearDown(){
        driver.close();
    }
    }

