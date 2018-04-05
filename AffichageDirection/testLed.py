'''
Created on 4 avr. 2018

@author: laptop
'''
from sense_hat import SenseHat
import time
import directions

sense=SenseHat()

directions.direction_right(sense, (255,255,255))
time.sleep(5)
directions.direction_left(sense, (255,255,255))
time.sleep(5)
directions.direction_down(sense, (255,255,255))
