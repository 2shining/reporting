README - Configuration du Projet
Ce projet utilise Maven pour la gestion des dépendances et le cycle de vie du développement. Voici une liste des
dépendances et des composants nécessaires pour exécuter le projet avec succès :

Dépendances Maven
JUnit (4.13.2)

Pour les tests unitaires.
xml
Copy code
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
Cucumber (7.14.0)

Pour la rédaction des scénarios de tests en langage naturel Gherkin.
xml
Copy code
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.14.0</version>
</dependency>

<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>7.14.0</version>
    <scope>test</scope>
</dependency>
Selenium (4.13.0)

Pour l'automatisation des tests d'interface utilisateur.
xml
Copy code
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.13.0</version>
</dependency>

<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-api</artifactId>
    <version>4.13.0</version>
</dependency>

<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-chrome-driver</artifactId>
    <version>4.13.0</version>
</dependency>
Cucumber Reporting (5.7.7)

Pour générer des rapports détaillés à partir des résultats des tests Cucumber.
xml
Copy code
<dependency>
    <groupId>net.masterthought</groupId>
    <artifactId>cucumber-reporting</artifactId>
    <version>5.7.7</version>
</dependency>
WebDriverManager (5.0.3)

Pour gérer automatiquement les pilotes des navigateurs WebDriver.
xml
Copy code
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.0.3</version>
    <scope>test</scope>
</dependency>
Gherkin (27.0.0)

La syntaxe Gherkin pour écrire des scénarios de tests.
xml
Copy code
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>gherkin</artifactId>
    <version>27.0.0</version>
</dependency>
Configuration du Projet
Version de Java (Source/Target) : 21
xml
Copy code
<maven.compiler.source>21</maven.compiler.source>
<maven.compiler.target>21</maven.compiler.target>
Plugins Maven
Surefire Plugin (3.0.0-M5)

Pour exécuter les tests unitaires pendant le cycle de construction.
xml
Copy code
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.0.0-M5</version>
    <configuration>
        <includes>
            <include>**/Runner.class</include>
        </includes>
    </configuration>
</plugin>
Cucumber Reporting Plugin (5.7.6)

Pour générer des rapports Cucumber pendant la phase de vérification.
xml
Copy code
<plugin>
    <groupId>net.masterthought</groupId>
    <artifactId>maven-cucumber-reporting</artifactId>
    <version>5.7.6</version>
    <executions>
        <execution>
            <id>execution</id>
            <phase>verify</phase>
            <goals>
                <goal>generate</goal>
            </goals>
            <configuration>
                <!-- Configurations supplémentaires ici -->
            </configuration>
        </execution>
    </executions>
</plugin>
Exécution du Projet
Assurez-vous d'avoir Java (version 21) installé sur votre machine.
Assurez-vous que votre environnement de développement prend en charge Maven.
Exécutez les tests en utilisant la commande Maven : mvn clean verify.
Rapports de Tests
Les rapports de tests Cucumber seront générés dans le répertoire target après l'exécution des tests.
Remarque
Assurez-vous que votre environnement est configuré pour l'exécution de tests avec Selenium, en particulier pour le
navigateur Chrome.

Clonage du Projet avec IntelliJ IDEA
Si vous utilisez IntelliJ IDEA et que le projet est déjà sur GitHub, vous pouvez le cloner directement depuis l'IDE en suivant ces étapes :

1. Ouvrir IntelliJ IDEA
Ouvrez IntelliJ IDEA sur votre machine.

2. Aller à la Section "VCS"
Dans la barre de menu en haut, cliquez sur "VCS", puis sélectionnez "Get from Version Control..."

3. Copier l'URL du Repository
Copiez l'URL du repository GitHub. L'URL ressemblera à quelque chose comme https://github.com/2shinign/reporting.git.

4. Coller l'URL dans IntelliJ IDEA
Dans la fenêtre "Get from Version Control", collez l'URL du repository dans le champ "URL".

5. Choisir le Répertoire de Destination
Choisissez le répertoire local où vous souhaitez que le projet soit cloné.

6. Cloner le Projet
Cliquez sur le bouton "Clone" pour cloner le projet.

7. Importer en tant que Projet Maven
Une fois le clonage terminé, IntelliJ IDEA détectera probablement automatiquement que le projet est un projet Maven. Si ce n'est pas le cas, vous pouvez importer le projet en tant que projet Maven.

8. Exécuter les Tests
Assurez-vous que votre environnement est configuré pour exécuter les tests, puis exécutez les tests depuis l'IDE.

C'est tout ! Vous avez maintenant cloné le projet et pouvez travailler dessus directement depuis IntelliJ IDEA.
