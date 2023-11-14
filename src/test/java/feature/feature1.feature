Feature: Gestion des produits dans un magasin

  Scenario: Ajouter un nouveau produit
    Given que je suis connecté en tant qu'administrateur
    When je vais sur la page d'administration des produits
    And je clique sur "Ajouter un nouveau produit"
    Then je devrais voir le formulaire d'ajout de produit

  Scenario: Modifier le prix d'un produit existant
    Given que je suis connecté en tant qu'administrateur
    When je vais sur la page d'administration des produits
    And je recherche le produit "Ordinateur portable"
    And je clique sur le lien de modification du produit
    And je change le prix à 1200 euros
    Then le prix du produit "Ordinateur portable" devrait être mis à jour

  Scenario: Supprimer un produit
    Given que je suis connecté en tant qu'administrateur
    When je vais sur la page d'administration des produits
    And je recherche le produit "Souris sans fil"
    And je clique sur le bouton de suppression du produit
    Then le produit "Souris sans fil" devrait être supprimé
    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa