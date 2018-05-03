'''
Created on 4 avr. 2018

@author: laptop
'''
from sense_hat import SenseHat
import directions
import colour
import time

sense=SenseHat()

while True:
	directions.direction_right(sense, colour.RED)
	time.sleep(1)
	sense.stick.wait_for_event()
	sense.stick.wait_for_event()
	directions.direction_left(sense, colour.ORANGE)
	time.sleep(1)
	sense.stick.wait_for_event()
	sense.stick.wait_for_event()
	directions.direction_down(sense, (0,200,0))
	time.sleep(1)
	sense.stick.wait_for_event()
	sense.stick.wait_for_event()
