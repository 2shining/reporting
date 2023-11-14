Feature: Gestion des tâches dans l'application Gestionnaire de Tâches Pro

  Scenario: Création d'une nouvelle tâche
    Given L'utilisateur est sur la page d'accueil
    When L'utilisateur crée une nouvelle tâche avec le titre "Réunion d'équipe"
    Then La tâche "Réunion d'équipe" doit apparaître dans la liste des tâches

  Scenario: Modification d'une tâche existante
    Given L'utilisateur est sur la page de gestion des tâches
    When L'utilisateur modifie la tâche "Réunion d'équipe" en changeant la date d'échéance
    Then La tâche modifiée doit apparaître avec la nouvelle date d'échéance

  Scenario: Collaboration sur un projet
    Given L'utilisateur est sur la page de gestion des projets
    And Le projet "Projet Client X" existe
    When L'utilisateur invite un collaborateur au projet
    Then Le collaborateur doit être ajouté avec succès au projet

  Scenario: Rappels pour les tâches
    Given L'utilisateur a créé une tâche avec une date d'échéance
    When La date d'échéance de la tâche approche
    Then L'utilisateur doit recevoir une notification de rappel

  Scenario: Intégration avec Google Calendar
    Given L'utilisateur est sur la page des paramètres
    When L'utilisateur connecte l'application à Google Calendar
    Then Les tâches doivent être synchronisées avec le calendrier Google

