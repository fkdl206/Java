package M1;

public class Television {
	int channel;
	int volume;
	boolean onoff;
	Television(int channel, int volume,boolean onoff){
		this.channel = channel;
		this.volume = volume;
		this.onoff = onoff;
			
	}
	void print() {
		System.out.println("ä��:"+channel+"����:"+volume+"�״�:"+onoff);
	}
}
