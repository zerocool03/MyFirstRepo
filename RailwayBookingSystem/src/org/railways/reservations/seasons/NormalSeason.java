package org.railways.reservations.seasons;

public class NormalSeason implements Season {


	private int sizeOfQueue;

	public NormalSeason() {
		this.sizeOfQueue = 10;
	}

	public int getSizeOfQueue() {
		return sizeOfQueue;
	}

}
