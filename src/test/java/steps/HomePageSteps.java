package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HomePageSteps {

public WebDriver driver;

    @Given("I navigate to the HomePage")
    public void i_navigate_to_the_home_page() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Claire\\Downloads\\Compressed\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("F:\\Study\\HTML\\Shining Prism\\Login form\\index.html");

    }
    @When("I press the Login button")
    public void i_press_the_login_button() {

    }

    @Then("I will be ringed to my Page")
    public void iWillBeRingedToMyPage() {
    }

    @Given("I navigate to the HomePage{int}")
    public void iNavigateToTheHomePage(int arg0) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Claire\\Downloads\\Compressed\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("F:\\Study\\HTML\\Shining Prism\\Login form\\index.html");
    }

    @When("I press the Login button{int}")
    public void iPressTheLoginButton(int arg0) {
    }

    @Then("I will be ringed to my Page{int}")
    public void iWillBeRingedToMyPage(int arg0) {
    }
}
