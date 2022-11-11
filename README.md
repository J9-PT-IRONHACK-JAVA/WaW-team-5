## WIZARDS AND WARRIORS - README.md


*[Introduction](#introduction)

*[Requierements](#requierements)

*[Description](#description)

*[Configuration](#configuration)

*[User's guide](#users-guide)

*[Troubleshooting](#troubleshooting)

*[Maintainers](#Maintainers)


## Introduction

RPG WaW is a project made with IntelliJ whose goal is to simulate an RPG battle where the user will create a team made up of 5 characters (warriors, wizards, rogues and "The Chosen One") to fight another player as a one-to-one battle where the winner will be determinated. 
The user will choose how to generate the party (randomly or from a CSV file). There will be 5 characters in each team. The user can choose the character he wants to fight and the duel will begin. Each character has skills which will make them stronger or weaker depending on his opponent. 

## Requierements




## Description

This project is made up of 3 repositories: gameMenus, gameObjects and gameServices.
In gameObjects we find each classes used in the gameServices repository: "Character", "Warrior", "Wizard" ESCRIURE-LES where we can find the properties and skills of each one. 

In gameServices we find the classes that develop the battle: the duel, the battle, the expedition and the game that generates the game.
In gameMenus we find the menus that write on the screen how the game runs, everything we want the player to read on the console.


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
  - You should answer in a lowercase string.

## Maintainers

Current maintainers: 

- Pablo Martínez
- Luís Sanfelices
- Jose Luís López
- Elisabet Aguilar


