package edu.kis.vh.nursery;
//alt + strzałka przemieszcza miedzy plikami
public class HanoiRhymer extends DefaultCountingOutRhymer {

int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
		totalRejected++;
	else
		super.countIn(in);
	}
}
