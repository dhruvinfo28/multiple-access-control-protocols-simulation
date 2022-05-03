package helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Channel {
	private List<Frame> channelData;
	public Channel() {
		this.channelData = new ArrayList<>();
	}
	public List<List<Frame>> getCollisions() {
		Collections.sort(channelData);
		List<List<Frame>> collidingFrames = new ArrayList<>();
		int i = 0;
		while(i < channelData.size()) {
			int j = i;
			while(j < channelData.size()-1 && channelData.get(j+1).getStartTime() < channelData.get(j).getEndingTime()) {
				j++;
			}
			ArrayList<Frame> curr = new ArrayList<>();
			for(int counter = i; counter <= j ; counter++) {
				curr.add(channelData.get(counter));
			}
			if(curr.size()!=1) {
				collidingFrames.add(curr);
			}
			i = j+1;
		}
		return collidingFrames;
	}
	public void addFrame(Frame frame) {
		this.channelData.add(frame);
	}
}
