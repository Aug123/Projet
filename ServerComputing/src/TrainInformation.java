
public class TrainInformation {

	private int position;
	private int line;
	
	public TrainInformation(int pos, int line) {
		position=pos;
		this.line=line;
	}
	
	public int getLine() {
		return line;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void nextStation() {
		position++;
	}
	
	public void todayLine(int num) {
		line=num;
	}
	
}
