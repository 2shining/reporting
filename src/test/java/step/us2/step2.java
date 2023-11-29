package step.us2;// Pour Java avec Cucumber et Selenium

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class step2 {
    private WebDriver driver; // Supposons que le pilote Selenium WebDriver est utilisé

    @Given("qu'un utilisateur non enregistré est sur la page d'inscription")
    public void userIsOnRegistrationPage() {
        // Code pour naviguer vers la page d'inscription
    }

    @When("l'utilisateur saisit son nom d'utilisateur {string} et son mot de passe {string}")
    public void userEntersCredentials(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @When("clique sur le bouton d'inscription")
    public void userClicksRegisterButton() {
        WebElement registerButton = driver.findElement(By.id("registerButton"));
        registerButton.click();
    }

    @Then("le système devrait afficher un message de succès d'inscription")
    public void registrationSuccessMessageDisplayed() {
        WebElement successMessage = driver.findElement(By.id("successMessage"));
        assertTrue(successMessage.isDisplayed());
    }

    // Les méthodes pour les étapes du deuxième scénario sont similaires
    // ...

    @Then("le système devrait rediriger l'utilisateur vers son tableau de bord")
    public void userIsRedirectedToDashboard() {
        String currentUrl = driver.getCurrentUrl();
        assertEquals("URL du tableau de bord attendu", "expected_dashboard_url", currentUrl);
    }

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
