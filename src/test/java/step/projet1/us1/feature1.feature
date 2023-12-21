Feature: Gestion des Fuseaux Horaires Personnalisé

  En tant qu'utilisateur souhaitant suivre l'heure d'un lieu spécifique,
  Je souhaite pouvoir ajouter un fuseau horaire personnalisé,
  Afin d'inclure l'heure de ce lieu dans ma liste d'affichage.

  Scenario: Ajouter un Fuseau Horaire Personnalisé
    Given L'utilisateur est sur la page de gestion des fuseaux horaires
    When L'utilisateur sélectionne l'option d'ajout d'un nouveau fuseau horaire
    And L'utilisateur entre les informations du fuseau horaire personnalisé
    And L'utilisateur confirme l'ajout du fuseau horaire
    Then Le fuseau horaire personnalisé est ajouté à la liste d'affichage

  Scenario: Vérifier la Validation des Informations du Fuseau Horaire
    Given L'utilisateur est sur la page de gestion des fuseaux horaires
    When L'utilisateur sélectionne l'option d'ajout d'un nouveau fuseau horaire
    And L'utilisateur entre des informations invalides du fuseau horaire personnalisé
    And L'utilisateur tente de confirmer l'ajout du fuseau horaire
    Then Un message d'erreur indiquant des informations invalides est affiché
    And Le fuseau horaire personnalisé n'est pas ajouté à la liste d'affichage
