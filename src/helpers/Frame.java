package helpers;

public class Frame implements Comparable<Frame>{
	private int stationNumber;
	private int startTime;
	private int endingTime;
	public Frame(int stationNumber, int startTime, int endingTime) {
		this.stationNumber = stationNumber;
		this.startTime = startTime;
		this.endingTime = endingTime;
	}
	public int getStationNumber() {
		return stationNumber;
	}
	public void setStationNumber(int stationNumber) {
		this.stationNumber = stationNumber;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndingTime() {
		return endingTime;
	}
	public void setEndingTime(int endingTime) {
		this.endingTime = endingTime;
	}
	@Override
	public int compareTo(Frame rhs) {
		return this.startTime - rhs.startTime;
	}
	public String toString() {
		return "{ stationNumber: " + this.stationNumber + " ," + this.startTime + " ," + this.endingTime + " }";
	}
	
}
