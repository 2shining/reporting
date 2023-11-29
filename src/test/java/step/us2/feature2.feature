Feature: Gestion des utilisateurs

  Scenario: Créer un nouvel utilisateur
    Given qu'un utilisateur non enregistré est sur la page d'inscription
    When l'utilisateur saisit son nom d'utilisateur "JohnDoe" et son mot de passe "MotDePasse123"
    And clique sur le bouton d'inscription
    Then le système devrait afficher un message de succès d'inscription

  Scenario: Connexion d'un utilisateur existant
    Given qu'un utilisateur enregistré est sur la page de connexion
    When l'utilisateur saisit son nom d'utilisateur "UtilisateurExistant" et son mot de passe "MotDePasseSecret"
    And clique sur le bouton de connexion
    Then le système devrait rediriger l'utilisateur vers son tableau de bord
