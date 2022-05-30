package edu.kis.vh.nursery;
//alt + strzałka przemieszcza miedzy plikami
public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
		totalRejected++;
	else
		super.countIn(in);
	}
}
