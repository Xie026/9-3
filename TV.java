
public class TV {
	int channel=1;
	int volumeLevel=1;
	boolean on =false;
	public TV() {
	}
	public void turn0n() {
		on=true;
	}
	public void turn0ff() {
		on=false;
	}
	public void setChannel(int newChannel) {
		if (on&&newChannel>=1&&newChannel<=120)
			channel=newChannel;
	}
	public void setvolume(int newvolumeLevel) {
		if (on&&newvolumeLevel>=1&&newvolumeLevel<=7)
			volumeLevel=newvolumeLevel;
	}
	public void channnelUp() {
		if (on&&channel<120)
			channel++;
	}
	public void channelDown() {
		if (on&&channel>1)
			channel--;
	}
	public void volumeUp() {
		if (on&&volumeLevel<7)
			volumeLevel++;
	}
	public void volumeDown() {
		if (on&&volumeLevel>1)
			volumeLevel--;
	}
}
