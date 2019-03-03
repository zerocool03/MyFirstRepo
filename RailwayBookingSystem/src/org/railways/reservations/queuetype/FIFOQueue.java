package org.railways.reservations.queuetype;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import org.railways.reservations.beans.Passenger;
import org.railways.reservations.operations.Operate;
import org.railways.reservations.seasons.Season;

public class FIFOQueue implements TypeOfQueue, Operate {

	Queue<Passenger> queue;

	public FIFOQueue(Season season) {
		queue = new ArrayBlockingQueue<Passenger>(season.getSizeOfQueue());
	}

	@Override
	public Queue<Passenger> getQueue() {
		// TODO Auto-generated method stub
		
		return this.queue;
	}

	@Override
	public int addPassenger(Passenger passenger) {
		datecheck(passenger.getDateOfTravel());
		this.queue.add(passenger);
		return 0;
	}

	@Override
	public int removePasenger(Passenger passenger) {
		this.queue.remove();
		return 0;
	}

}
