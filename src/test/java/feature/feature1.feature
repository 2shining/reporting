Feature: Utilisation d'une calculatrice
  Pour éviter des erreurs de calcul
  En tant qu'utilisateur
  Je veux pouvoir utiliser une calculatrice de base

  Scenario: Addition de deux nombres
    Given la calculatrice est allumée
    When je saisis "2 + 2"
    Then le résultat affiché devrait être 4

  Scenario: Soustraction de deux nombres
    Given la calculatrice est allumée
    When je saisis "5 - 3"
    Given la calculatrice est allumée