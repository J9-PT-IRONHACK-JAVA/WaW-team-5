## WIZARDS AND WARRIORS - README.md


*[Introduction](#introduction)

*[Requierements](#requierements)

*[Description](#description)

*[Configuration](#configuration)

*[User's guide](#users-guide)

*[Troubleshooting](#troubleshooting)

*[Maintainers](#Maintainers)

<div align= "justify">

## Introduction

RPG WaW is a Java project that simulates an RPG battle where the user creates a team made up of 5 characters (warriors, wizards, rogues and "The Chosen One") to fight another player as a one-to-one battle where the winner will be determinated. 
The user choose how to generate the party (randomly or from a CSV file). There will be 5 characters in each team. The user can choose the character he wants to fight and the duel will begin. Each character has skills that will make them stronger or weaker depending on his opponent. 

## Requierements

To execute the game, the user should install IntelliJ and "Faker" dependency.


## Description

This project is made up of 3 repositories: gameMenus, gameObjects and gameServices.
In gameObjects we find each classes used in the gameServices repository: "Character", "Attacker" (interface), "Warrior", "Wizard", "Rogue", "The Choosen One", "Monster" and "Weapon" where we can find the properties and skills of each character. Each character inherits the properties of the abstract class character and implements the interface Attacker where methods "doAttack", "recieveAttack" and "getsAlive" are in there. 

In gameMenus we can find the menus that write on the screen how the game runs, everything we want the player to read on the console and everything the game needs to know from the user to play the game like he wants.
  

In gameServices we find the classes that develop the battle: "Duel", "Battle", "Expedition" and "Game" that generates the game. Game class starts the game and asks to the user how he wants to generate the party. It allows to generate the party randomly or from CSV file, so this class needs a method "askSomethingToUser" that it allows to the computer got information to continue the game.  



## Configuration

There is no configuration. There have no modifiable settings. 

## User's guide

The game starts. The user has to answer some questions before the battle begins:

  - The user should answer with a "yes" or "no" if he wants to start the game. 
  - Then, the user will be asked how he wants to create the parties. 
  - The game will need a user's name and a team's name too. 
  - Does each player want to go to an expedition to get powerful weapons?
  - The battle begins. 

## Troubleshooting

If the menu does not display, check the following:

  - Is the CSV file in the right format?

## Maintainers

Current maintainers: 

- Pablo Martínez
- Luís Sanfelices
- Jose Luís López
- Elisabet Aguilar

</div>
