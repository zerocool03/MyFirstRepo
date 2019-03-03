package org.railways.reservations.service;

import org.railways.reservations.beans.Passenger;
import org.railways.reservations.queuetype.FIFOQueue;
import org.railways.reservations.queuetype.TypeOfQueue;
import org.railways.reservations.seasons.NormalSeason;
import org.railways.reservations.seasons.Season;

public class App {
	public static void main(String[] args) {

		Season season = new NormalSeason();
		TypeOfQueue type = new FIFOQueue(season);
		
	
		for (int i = 0; i < 10; i++) {
			Passenger p1 = new Passenger();
			type.getQueue().add(p1);
		}
		
		Passenger p1 = new Passenger();
		type.getQueue().add(p1);
	}
}
