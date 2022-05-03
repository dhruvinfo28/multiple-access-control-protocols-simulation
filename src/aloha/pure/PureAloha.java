package aloha.pure;

import java.util.List;

import helpers.Channel;
import helpers.Frame;
import helpers.Station;

public class PureAloha {

	public static void main(String[] args) {
		
		//Initializing a common channel
		Channel c1 = new Channel();
		
		//Initializing stations on that common channel
		Station station1 = new Station(1,c1);
		Station station2 = new Station(2,c1);
		Station station3 = new Station(3,c1);
		
		//Let the frame time be 2 seconds
		int frameTime = 2; 
		
		//In pure aloha, any station can transmit at any time
		//Making every channel transmit 0-5 frames at random times
		
		int minTime = 0;
		int maxTime = 1000;
		for(int i=0;i<5;i++) {
			minTime = station1.putFrame(minTime,maxTime,frameTime);
			if(minTime >= maxTime) break;
		}
		
		minTime = 0;
		for(int i=0;i<5;i++) {
			minTime = station2.putFrame(minTime,200,frameTime);
			if(minTime >= maxTime) break;
		}
		
		minTime = 0;
		for(int i=0;i<5;i++) {
			minTime = station3.putFrame(minTime,200,frameTime);
			if(minTime >= maxTime) break;
		}
		
		//Seeing how many frames collided
		List<List<Frame>> collidingFrames = c1.getCollisions();
		for(List<Frame> curr: collidingFrames) {
			for(Frame frame: curr) {
				System.out.print(frame+ " ");
			}
			System.out.println();
		}
	} 

}
