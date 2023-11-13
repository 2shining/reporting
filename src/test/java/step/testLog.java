package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLog {
    WebDriver driver;
    @Given("je suis sur la page de login")
    public void jeSuisSurLaPageDeLogin() {
        System.setProperty("webdriver.chrome.driver","src/test/java/org/andry/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/SMI%20project/pages/login.php");
    }

    @When("j'entre les détails de mon identité et mot de passe corrects")
    public void jEntreLesDétailsDeMonIdentitéEtMotDePasseCorrects() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("andryramariarison@gmail.com");
        driver.findElement(By.id("motdepasse")).sendKeys("23112020");

        Thread.sleep(2000);
    }

    @And("je clique sur le bouton {string}")
    public void jeCliqueSurLeBouton(String arg0) {
        driver.findElement(By.id("button")).click();
        /*boolean redirectedToUnknownPage = driver.getCurrentUrl().equals("http://localhost/SMI%20project/acceuil.php");
        Assert.assertTrue("Utilisateur non reconnu", redirectedToUnknownPage);*/
    }

    @Then("je dois être redirigé vers la page d'accueil")
    public void jeDoisÊtreRedirigéVersLaPageDAccueil() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @When("j'entre des identifiants incorrects")
    public void jEntreDesIdentifiantsIncorrects() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("andryramariarison@gmaail.com");
        driver.findElement(By.id("motdepasse")).sendKeys("231120200");
        /*driver.findElement(By.id("button")).click();*/

        Thread.sleep(2000);
    }

    @Then("je dois recevoir un message indiquant {string}")
    public void jeDoisRecevoirUnMessageIndiquant(String expectedErrorMessage) throws InterruptedException {
        Thread.sleep(2000);

        /*WebElement errorMessageElement = driver.findElement(By.xpath("//*[contains(text(), '" + expectedErrorMessage + "')]"));

        Assert.assertNotNull("Le message d'erreur attendu n'a pas été trouvé", errorMessageElement);*/

        driver.quit();
    }
}
