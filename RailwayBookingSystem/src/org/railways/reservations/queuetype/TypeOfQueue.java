package org.railways.reservations.queuetype;

import java.util.Queue;

import org.railways.reservations.beans.Passenger;

public interface TypeOfQueue {

	Queue<Passenger> getQueue();
}
