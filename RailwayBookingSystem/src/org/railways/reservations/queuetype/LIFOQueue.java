package org.railways.reservations.queuetype;

import java.util.ArrayDeque;
import java.util.Deque;

import org.railways.reservations.beans.Passenger;
import org.railways.reservations.operations.Operate;
import org.railways.reservations.seasons.Season;

public class LIFOQueue implements TypeOfQueue, Operate {

	Deque<Passenger> queue;

	public LIFOQueue(Season season) {
		queue = new ArrayDeque<Passenger>(season.getSizeOfQueue());
	}

	@Override
	public Deque<Passenger> getQueue() {
		// TODO Auto-generated method stub
		return this.queue;
	}

	@Override
	public int addPassenger(Passenger passenger) {
		this.queue.add(passenger);
		return 0;
	}

	@Override
	public int removePasenger(Passenger passenger) {
		this.queue.removeLast();
		return 0;
	}

}
