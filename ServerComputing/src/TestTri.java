import java.util.ArrayList;


public class TestTri {

	public static void main(String[] args) {
	
		MyRandom rnd=new MyRandom();
		
		ArrayList<CarInformation> list=new ArrayList<CarInformation>();
		
		for (int i=0; i<10; i++) {
			CarInformation c=new CarInformation(i+1);
			c.setPassengers(rnd.nextInt(30));
			list.add(c);
		}

		Tri result=new Tri();
		result.directions(list);
		
		
	}
}
