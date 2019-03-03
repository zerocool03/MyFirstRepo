package org.railways.reservations.operations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.railways.reservations.beans.Passenger;

public interface Operate {

	public int addPassenger(Passenger passenger);

	public int removePasenger(Passenger passenger);

	public default boolean datecheck(Date date) {

		String myFormatString = "dd/MM/yy";
		SimpleDateFormat df = new SimpleDateFormat(myFormatString);
		Date current;

		try {
			current = df.parse(myFormatString);
			Date givenDate = date;

			if (givenDate.after(current) || current.equals(givenDate)) {
				return true;
			}

		} catch (ParseException e1) {
			
			e1.printStackTrace();
		} catch (Exception e) {

		}
		return false;
	}

}