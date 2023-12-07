package step.us;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass; // Ajoutez cette ligne
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class step1 {
    WebDriver driver;

    @Given("je suis sur la page de login")
    public void jeSuisSurLaPageDeLogin() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/step/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost//Projet Quebec//Login-MAJ.php");
    }

    @When("j'entre les détails de mon identité et mot de passe corrects")
    public void jEntreLesDétailsDeMonIdentitéEtMotDePasseCorrects() throws InterruptedException {
        driver.findElement(By.id("ut")).sendKeys("Andry");
        driver.findElement(By.id("mtd")).sendKeys("23112020");

        Thread.sleep(2000);
    }

    @And("je clique sur le bouton {string}")
    public void jeCliqueSurLeBouton(String arg0) {
        driver.findElement(By.id("button")).click();
    }

    @Then("je dois être redirigé vers la page d'accueil")
    public void jeDoisÊtreRedirigéVersLaPageDAccueil() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @When("j'entre des identifiants incorrects")
    public void jEntreDesIdentifiantsIncorrects() throws InterruptedException {
        driver.findElement(By.id("ut")).sendKeys("andryramariarison@gmaail.com");
        driver.findElement(By.id("mtd")).sendKeys("231120200");

        Thread.sleep(2000);
    }

    @Then("je dois recevoir un message indiquant {string}")
    public void jeDoisRecevoirUnMessageIndiquant(String expectedErrorMessage) throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    // Méthode pour récupérer le nom de la classe
    private static String getClassName() {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        return className.substring(className.lastIndexOf('.') + 1);
    }

    public static File getReportDirectory() {
        String className = getClassName();
        return new File("target/maven-cucumber-report/" + className);
    }

    @AfterClass
    public static void generateReports() throws IOException {
        File reportOutputDirectory = getReportDirectory();
        // Le reste de votre code pour la configuration et la génération de rapports
    }
}
