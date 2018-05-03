import java.util.ArrayList;

public class Tri {

	public ArrayList<DisplayInformation> result;
	
	public Tri() {
		result=new ArrayList<DisplayInformation>();
	}
	
	public void directions(ArrayList<CarInformation> list) {
		
		for (int i = 0; i < list.size(); i++) {
			DisplayInformation dInfo = new DisplayInformation(i);

			// For each position:
			dInfo.setPosition(i+1);

			// First, we set the color depending on the number of people in the car
			// The car can contain 30 people
			// 0<GREEN<10<ORANGE<20<RED<30
			int n=list.get(i).getPassengers();
				if (n < 10)
					dInfo.color.setGreen();
				else if (n > 20)
					dInfo.color.setRed();
				else
					dInfo.color.setOrange();

			// Then we determine the direction for each door of the train as an
			// integer:-1=left, 0=down, 1=right
			if (i == 0) {
				if (list.get(i).getPassengers() < list.get(i + 1).getPassengers())
					dInfo.setDirection(0);
				else
					dInfo.setDirection(1);
			} else if (i == list.size() - 1) {
				if (list.get(i).getPassengers() < list.get(i - 1).getPassengers())
					dInfo.setDirection(0);
				else
					dInfo.setDirection(-1);

			} else {
				if (list.get(i - 1).getPassengers() > list.get(i).getPassengers()
						&& list.get(i).getPassengers() < list.get(i + 1).getPassengers()) {
					dInfo.setDirection(0);
					
				} else if (list.get(i - 1).getPassengers() > list.get(i).getPassengers()
						&& list.get(i).getPassengers() > list.get(i + 1).getPassengers()) {
					dInfo.setDirection(1);
					
				} else if (list.get(i - 1).getPassengers() < list.get(i).getPassengers()
						&& list.get(i).getPassengers() < list.get(i + 1).getPassengers()) {
					dInfo.setDirection(-1);
					
				} else if (list.get(i - 1).getPassengers() < list.get(i).getPassengers()
						&& list.get(i).getPassengers() > list.get(i + 1).getPassengers()) {
					if (list.get(i - 1).getPassengers() < list.get(i + 1).getPassengers())
						dInfo.setDirection(-1);
					else
						dInfo.setDirection(1);
				}
			}
			result.add(dInfo);
		}
	}
}
