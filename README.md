# Projet
Description:  
We want to realise a system to fluidize the traffic inside the MTR by giving in real time the optimal
direction to go in order to find some space in the next train.
This system will simplify the traffic and have people win time, especially at the rush hour. It is made
avoid the situation where you cannot get in the train but there is still space in another car.

# First Step:
(04/04/2018)  
Devlopment of 3 fonctions in python to display the directionnal arrow on the sense hat of the raspberry py

direction_right(sense, color)
direction_left(sense, color)
direction_down(sense, color)

result of direction_right is an arrow pointed on the right

We put as an argument the sense hat and the color of the arrow that we want.

Next step:
Determining the values of the tuple for the color green, orange and red
then create a function to say what to print in each case (empty to full = green to red, + good direction)

# Step Two
(05/04/2018)  

Etablishing the function which prints the rigth direction with this logic: 

|Left|Down|Right|  
|----|----|-----|
|-1|0|1|

I found the good tuple for the colors and put them in a class: colour

Next Step :
Creating the server on my laptop and a client on the display system.
Try to send data an print the good color with the good direction.
