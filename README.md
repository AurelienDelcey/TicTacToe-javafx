# TicTacToe JavaFX

![Java](https://img.shields.io/badge/Java-17-blue)
![JavaFX](https://img.shields.io/badge/JavaFX-20.0.2-green)
![JUnit](https://img.shields.io/badge/JUnit-5.10.0-red)
![Mockito](https://img.shields.io/badge/Mockito-5.6.0-orange)
![Maven](https://img.shields.io/badge/Maven-3.9.0-blueviolet)

## Présentation
TicTacToe est une application de morpion développée en Java avec JavaFX pour l’interface graphique.  
Le projet est conçu avec une architecture claire et modulaire, séparant la logique du jeu, le modèle et l’interface utilisateur.

Il inclut des tests unitaires avec JUnit 5 et Mockito.

## Fonctionnalités
- Jeu à deux joueurs (O et X) sur une grille 3x3
- Détection automatique des victoires et des matchs nuls
- Gestion des tours de jeu
- Bouton RESET pour recommencer une partie
- Interface graphique JavaFX 
- Tests unitaires complets de la logique du jeu

## Structure du projet
- `ticTacToe.Model` : classes représentant le modèle du jeu (`Grid`, `ButtonState`, `GameState`, `Turn`)
- `ticTacToe.Logic` : logique du jeu (`TicTacToeLogic`, `GameStateHolder`, `TurnStateHolder`)
- `ticTacToe.UserInterface` : interface graphique JavaFX
- `ticTacToe` : classe principale `TicTacToeApplication`
- tests unitaires `TicTacToeLogicTest`

## Technologies utilisées
- Java 17
- JavaFX 20
- Maven
- JUnit 5
- Mockito 5

## Installation et exécution
Cloner le projet et se placer dans le dossier :
```
git clone https://github.com/AurelienDelcey/TicTacToe-javafx.git
cd TicTacToe-javafx
```
Compiler et lancer l'application :

```mvn clean javafx:run```

Exécuter les tests unitaires :

```mvn test```

## Utilisation
- Lancer l'application
- Cliquer sur les cases pour placer un O ou un X selon le tour
- La partie se termine automatiquement lorsqu'un joueur gagne ou en cas de match nul
- Cliquer sur RESET pour recommencer une nouvelle partie

## Points techniques
- Séparation claire entre modèle, logique et interface
- Architecture modulaire
- Utilisation des propriétés JavaFX pour la communication entre logique et interface
- Tests unitaires de la logique via Mockito
- Gestion des dépendances avec Maven

## Auteur
Aurélien Delcey  
Email : aurelien.delcey@gmail.com  
GitHub : https://github.com/AurelienDelcey

## Licence
Ce projet est sous licence MIT. Vous êtes libre de le réutiliser, le modifier et le distribuer.
