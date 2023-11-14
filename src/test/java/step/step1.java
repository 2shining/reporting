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