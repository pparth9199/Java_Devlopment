# Battle
## About
Lots of games pit one player against another either in the arena or on the field of battle. The winners of these battles tend to depend upon the abilities of the players, the gear that they have at their disposal, and, a little bit, on their luck. This is exemplified in role-playing games (Links to an external site.) in which players battle using a turn-based system.
## List of Features
1. The program Describes all the players and their abilities
2. The program lets players enter the arena
3. The program lets the players to equip gears
4. The program lets the players have weapons and changes the things simultaneously
5. The program lets the player battle based on their abilities and weapons
6. The program declares winner and lets to run the game again

## Output
# case 1: Player 2 wins.
Welcome to the game Parth,
your basic abilities are [12, 14, 18, 13],
your initial health is 57, 
your strength is 12,
constitution is 18,
dexterity is 14,
charisma is 13,
gear in your bag are [[DIAMONDHAT], [BLACKBULL, ENERGYWATER, GATORADE, GATORADEBLUE, GATORADEGREEN, GATORADERED, GATORADEYELLOW, REDBULL, REDBULLYELLOW], [BRONZELARGE, GLASSLARGE, GLASSMEDIUM, GLASSSMALL, GYPSUMLARGE, GYPSUMSMALL, IRONSMALL, TUNGSTENLARGE, TUNGSTENSMALL], [SPORTSHOES]],
assigned Weapon that you have right now is Bare hands]
----------------------------------------------------------
Welcome to the game Riddhi,
your basic abilities are [14, 14, 10, 11],
your initial health is 49, 
your strength is 14,
constitution is 10,
dexterity is 14,
charisma is 11,
gear in your bag are [[PLASTICHAT], [ENERGYCOLA, ENERGYWATER, GATORADEBLUE, GATORADEPEACH, GATORADERED, GATORADEYELLOW, POWERADE, POWEUP, REDBULLYELLOW], [BRONZELARGE, IRONLARGE, IRONMEDIUM, IRONSMALL, TITANIUMLARGE, TITANIUMMEDIUM, TITANIUMSMALL, TUNGSTENMEDIUM, TUNGSTENSMALL], [SPORTSHOES]],
assigned Weapon that you have right now is Bare hands]
----------------------------------------------------------
The players entered in the arena are : Parth, Riddhi

Gear Selection in progress...
The abilities of Parth after gear selection and weapon selection are: 
Strength :10
Constitution :20
Dexterity :25
Charisma :13
The advanced abilities of Parth are :
Striking power : 17
Avoidance Ability : 23
Potential Striking Damage : 0

The abilities of Riddhi after gear selection and weapon selection are: 
Strength :27
Constitution :20
Dexterity :6
Charisma :11
The advanced abilities of Riddhi are :
Striking power : 29
Avoidance Ability : 21
Potential Striking Damage : 0
----------------------------------------------------------
With higher charisma Parth will take the first turn.
Stats for Round : 1
Health of : Parth is 68
Health of : Riddhi is 64

Stats for Round : 2
Health of : Parth is 58
Health of : Riddhi is 64

Stats for Round : 3
Health of : Parth is 46
Health of : Riddhi is 56

Stats for Round : 4
Health of : Parth is 38
Health of : Riddhi is 46

Stats for Round : 5
Health of : Parth is 28
Health of : Riddhi is 46

Stats for Round : 6
Health of : Parth is 18
Health of : Riddhi is 38

Stats for Round : 7
Health of : Parth is 7
Health of : Riddhi is 28

Riddhi wins the game!!! Congratulations Riddhi
Enter y to start again and n to quit: 

# Case 2 : Player 1 wins
Welcome to the game Parth,
your basic abilities are [14, 10, 10, 17],
your initial health is 51, 
your strength is 14,
constitution is 10,
dexterity is 10,
charisma is 17,
gear in your bag are [[WOODHAT], [BLACKBULL, ENERGYCOLA, ENERGYWATER, GATORADEBLACK, GATORADEGREEN, GATORADEPINK, GATORADEYELLOW, POWERADE, POWEUP], [GLASSLARGE, GLASSMEDIUM, GLASSSMALL, GYPSUMLARGE, GYPSUMSMALL, IRONLARGE, IRONSMALL, TUNGSTENMEDIUM, TUNGSTENSMALL], [SANDALS]],
assigned Weapon that you have right now is Bare hands]
----------------------------------------------------------
Welcome to the game Riddhi,
your basic abilities are [12, 15, 13, 12],
your initial health is 52, 
your strength is 12,
constitution is 13,
dexterity is 15,
charisma is 12,
gear in your bag are [[HARDHAT], [BLACKBULL, ENERGYCOLA, GATORADE, GATORADEBLACK, GATORADEGREEN, GATORADEPEACH, POWEUP, REDBULL, REDBULLYELLOW], [BRONZELARGE, GLASSLARGE, GLASSMEDIUM, GLASSSMALL, GYPSUMLARGE, IRONMEDIUM, TITANIUMLARGE, TITANIUMMEDIUM, TITANIUMSMALL], [STILLETOES]],
assigned Weapon that you have right now is Bare hands]
----------------------------------------------------------
The players entered in the arena are : Parth, Riddhi

Gear Selection in progress...
The abilities of Parth after gear selection and weapon selection are: 
Strength :19
Constitution :27
Dexterity :9
Charisma :17
The advanced abilities of Parth are :
Striking power : 21
Avoidance Ability : 31
Potential Striking Damage : 0

The abilities of Riddhi after gear selection and weapon selection are: 
Strength :10
Constitution :16
Dexterity :16
Charisma :12
The advanced abilities of Riddhi are :
Striking power : 14
Avoidance Ability : 22
Potential Striking Damage : 0
----------------------------------------------------------
With higher charisma Parth will take the first turn.
Stats for Round : 1
Health of : Parth is 72
Health of : Riddhi is 54

Stats for Round : 2
Health of : Parth is 72
Health of : Riddhi is 39

Stats for Round : 3
Health of : Parth is 72
Health of : Riddhi is 24

Stats for Round : 4
Health of : Parth is 72
Health of : Riddhi is 9

Parth wins the game!!! Congratulations Parth
Enter y to start again and n to quit: 
## Description of output
The output shows that which player has won the output describes the players with their basic abilities and bare hands. The output further shows the abilities enhanced after selection of the abilities. Then the game takes place in rounds as displayed and the health after each round of both players is depicted. Finally winner is declared. The user is asked if he wants to quit or continue.

## How to run JAR file
1. open the JAR file
2. use command java -jar "filepath" to run the jar file
2. The game commences you can enter 'y' or 'Y' to restart or anything else to quit the game

## How to use?
The program requires the name on initialization and then needs the user to select the gear selecting or not same for weapons. Then the game commences based on the charisma chances are given. At the end after winner declaration if 'Y' or 'y' is entered the game commences again else it stops.
## Design Changes
1. Added interface for Gear 
2. Added interface for weapons
3. Changed enter arena responsibility to arena class
## Assumptions
1. The players are assigned by default a bag
2. The defence ability works as a shield to the player defending hence depricating the value
3. The values and the types of gears are fixed

## Limitations
1. The minimum of 25% negative items is not satisfied

## Citation
https://junit.org/junit4/javadoc/4.13/org/junit/Assert.html - used for assertTrue to check range of the random values.



