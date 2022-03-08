package Springboot;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Springboot {
    public static void main(String[] args) {


        //Windows
        System.setProperty("webdriver.chrome.driver","C:\\Users\\swood\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Linux
/*
        WebDriver driver = new FirefoxDriver();
*/

        driver.get("http://localhost");
        driver.manage().window().setSize(new Dimension(1366, 728));

    }
}
