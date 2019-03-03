package org.railways.reservations.seasons;

/**
 * @author krishna
 *
 */
public class FestivSeason implements Season {

	private int sizeOfQueue;

	/**
	 * 
	 */
	public FestivSeason() {
		this.sizeOfQueue = 20;
	}

	public int getSizeOfQueue() {
		return sizeOfQueue;
	}


}
