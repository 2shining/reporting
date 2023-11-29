Feature: Connexion à un système

  @tag1
  Scenario: Connexion réussie
    Given je suis sur la page de login
    When j'entre les détails de mon identité et mot de passe corrects
    And je clique sur le bouton "Log In"
    Then je dois être redirigé vers la page d'accueil

  @tag2
  Scenario: Connexion refusée avec identifiants incorrects
    Given je suis sur la page de login
    When j'entre des identifiants incorrects
    And je clique sur le bouton "Log In"
    Then je dois recevoir un message indiquant "Utilisateur non reconnu"
