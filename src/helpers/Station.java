package helpers;

public class Station {
	private int stationNumber;
	private Channel channel;
	public Station(int stationNumber, Channel channel) {
		this.stationNumber = stationNumber;
		this.channel = channel;
	}
	public int getStationNumber() {
		return this.stationNumber;
	}
	public int putFrame(int minTime,int maxTime, int frameTime) {
		int startTime = (int)(Math.random() * (maxTime - minTime + 1) + minTime);
		channel.addFrame(new Frame (this.getStationNumber(), startTime, startTime + frameTime));
		return startTime + frameTime;
	}
}
