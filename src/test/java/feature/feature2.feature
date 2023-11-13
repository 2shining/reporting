Feature: Gestion des utilisateurs

  Scenario: Créer un nouvel utilisateur
    Given que l'utilisateur est sur la page d'inscription
    When l'utilisateur remplit le formulaire avec les informations suivantes:
      | Nom     | John Doe    |
      | Email   | john@example.com |
      | Mot de passe | secret123 |
    And l'utilisateur clique sur le bouton "S'inscrire"
    Then l'utilisateur devrait être redirigé vers la page de connexion
    And le message "Inscription réussie" devrait être affiché

  Scenario: Connexion d'un utilisateur existant
    Given que l'utilisateur est sur la page de connexion
    When l'utilisateur saisit les informations de connexion suivantes:
      | Email   | john@example.com |
      | Mot de passe | secret123 |
    And l'utilisateur clique sur le bouton "Se connecter"
    Then l'utilisateur devrait être redirigé vers son tableau de bord
    And le message "Connexion réussie" devrait être affiché
