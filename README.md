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
Create the server on my laptop and a client on the display system.
Try to send data an print the good color with the good direction.

# Step Tree
(03/05/2018)

I did the hotspot wifi on one of my Raspberry and fiwed the IP adress. In fact I did't really enabled a router but i fixed the IP addresses on each pi. My hotspot wifi is working with a bridge so if the IP address is already taken then a free random address is given to the pi which is trying to connect. 
To prevent the addresses of my pi to be already taken I chose a middle range adresses
from 172.16.42.58 to 172.16.42.61 (the netmask is 255.255.0.0 for the network on the lab and there is minimum chances that these addresses will be reached one day)

# Step four
(04/05/2018)

Today I did the processing function of the server. The server will receive an array list of carInformation and process it to have as an output an array list of display Information. I use array list in the case that all the trains do not have the same length. However the train will always stop at the first door on the dock. In that way the system is working
