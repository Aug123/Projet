'''
Created on 4 avr. 2018

@author: laptop
'''
from sense_hat import SenseHat
import time
import Directions

sense=SenseHat()

Directions.direction_right(sense, (255,255,255))
time.sleep(5)
Directions.direction_left(sense, (255,255,255))
time.sleep(5)
Directions.direction_down(sense, (255,255,255))
