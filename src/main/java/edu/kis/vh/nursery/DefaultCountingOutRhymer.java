package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.RhymersFactory;

public class DefaultCountingOutRhymer{

	private static final int INITIAL = -1;
	private static final int RETURN_VALUE = -1;
	private static final int ARRAY_CAPACITY = 12;

	private int total = INITIAL;

	private final int[] numbers = new int[ARRAY_CAPACITY];

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == RETURN_VALUE;
	}

	public boolean isFull() {
		return total == ARRAY_CAPACITY-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return RETURN_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return RETURN_VALUE;
		return numbers[total--];
	}
}
