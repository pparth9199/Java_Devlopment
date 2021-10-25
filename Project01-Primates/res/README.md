# Primates 
## About
The jungle primates provides a permanent home and high-quality sanctuary care for New World primates who have been cast-off from the pet trade, retired from research, or confiscated by authorities. They are seeking to replace all of their paper records with computer records where they can keep track of the individual animals that are in their care. Your task in this assignment is to design and implement such a system that can satisfy their needs:
	•	The Sanctuary consists of two different types of housing:
	◦	Isolation is used to keep monkeys when they first arrive at the sanctuary and anytime they are receiving medical attention. Isolation consists of a series of cages each of which can house a single animal.
	◦	Enclosures are much larger and can host a single troop (i.e., a group) of monkeys. Each troop consists of a single species that is found in the New World (some of which are pictured below): drill, guereza, howler, mangabey, saki, spider, squirrel, and tamarin. 
	•	Enclosures are initially configured to house a particular species of monkeys but can be repurposed for a different species if they are empty.
	•	The capacity of an enclosure is dependent upon the size of the enclosure and the size of the monkeys in the enclosure. Small monkeys (<10 cm) require 1 square meter each, medium monkeys (10 to 20 cm) require 5 square meters, and large monkeys (>20 cm) require 10 square meters.
	•	Monkeys that are received by the sanctuary must go into isolation where they are assessed and given medical attention. At this time, each individual monkey is given a name, a species designation, a sex, a size, a weight, an approximate age, and a favorite food. The choices of favorite food include eggs, fruits, insects, leaves, nuts, seeds, and tree sap.
	•	Monkeys that have received medical attention may be moved to an available enclosure if there is room. The Jungle Friends Primate Sanctuary also has exchange agreements with several other primate sanctuaries that can take healthy monkeys and often uses these agreements to find the best suitable home for monkeys it receives but cannot house.
## List of Features
1. The program gives a list of all the monkeys that are there in enclosure and isolation.
2. The program offers a list of species in the sanctuary in alphabetical order.
3. The program returns a list of all the troop of mokeys in the enclosure with their species.
4. The program displays a sign board for the enclosures.

## Output
The complete list of animals in Sanctuary is :
Monkey id: 1 Name:Pale-headed Saki Troop: Pithecia Sex: Male Weight: 1 Size: 20 food: eggs age: 2 Healthy:true inIsolation: false
Monkey id: 5 Name:Pale-headed Saki Troop: Pithecia Sex: Male Weight: 1 Size: 40 food: Sap age: 2 Healthy:true inIsolation: false
Monkey id: 4 Name:Guereza Troop: Colobus guereza Sex: Male Weight: 1 Size: 15 food: nuts age: 2 Healthy:true inIsolation: false
Monkey id: 3 Name:Black and gold howler Troop: Alouatta Caraya Sex: Male Weight: 1 Size: 17 food: Leaves age: 2 Healthy:true inIsolation: false
Monkey id: 2 Name:Cotton-Top Tamarin Troop: Sagnius oedipus Sex: Male Weight: 1 Size: 22 food: apple age: 2 Healthy:true inIsolation: false

The Species that are present in Sanctuary Sorted Alphabeticaly are: 
[Alouatta Caraya, Colobus guereza, Pithecia, Pithecia, Sagnius oedipus]

The species present in enclosure are:
Colobus guereza
Pithecia
Alouatta Caraya
Sagnius oedipus

The enclosure board details are: 
The Monkey's name is Pale-headed Saki and is of the sex Male. The monkey likes to eat Sap.
The Monkey's name is Guereza and is of the sex Male. The monkey likes to eat nuts.
The Monkey's name is Black and gold howler and is of the sex Male. The monkey likes to eat Leaves.
The Monkey's name is Cotton-Top Tamarin and is of the sex Male. The monkey likes to eat apple.
The Monkey's name is Pale-headed Saki and is of the sex Male. The monkey likes to eat eggs.

## Limitations
1. Implementation of the function to return the shopping list has not been implemented.
2. The method for the transfer of monkey is not yet implemented.



