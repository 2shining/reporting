package step.projet1.us1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GestionFuseauxHorairesSteps {

    WebDriver driver;

    @Given("l'utilisateur est sur la page de gestion des fuseaux horaires")
    public void lUtilisateurEstSurLaPageDeGestionDesFuseauxHoraires() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/step/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://votre-site.com/page-de-gestion-des-fuseaux-horaires");
    }

    @When("l'utilisateur sélectionne l'option d'ajout d'un nouveau fuseau horaire")
    public void lUtilisateurSelectionneOptionAjoutNouveauFuseauHoraire() {
        driver.findElement(By.id("id-de-l-option")).click();
    }

    @And("l'utilisateur entre les informations du fuseau horaire personnalisé")
    public void lUtilisateurEntreInformationsFuseauHorairePersonnalise() {
        // Votre code pour entrer les informations (si nécessaire)
    }

    @And("l'utilisateur confirme l'ajout du fuseau horaire")
    public void lUtilisateurConfirmeAjoutFuseauHoraire() {
        driver.findElement(By.id("id-du-bouton-confirmer")).click();
    }

    @Then("le fuseau horaire personnalisé est ajouté à la liste d'affichage")
    public void leFuseauHorairePersonnaliseEstAjouteListeAffichage() {
        // Votre code pour vérifier que le fuseau horaire est ajouté (si nécessaire)
    }

    @Then("un message d'erreur indiquant {string} est affiché")
    public void unMessageErreurIndiquantEstAffiche(String expectedErrorMessage) {
        // Votre code pour vérifier le message d'erreur (si nécessaire)
    }

    @Then("le fuseau horaire personnalisé n'est pas ajouté à la liste d'affichage")
    public void leFuseauHorairePersonnaliseNestPasAjouteListeAffichage() {
        // Votre code pour vérifier que le fuseau horaire n'est pas ajouté (si nécessaire)
    }
}