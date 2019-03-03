package org.railways.reservations.custom.exceptions;

public class OverFlowException extends MyException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "I'm full. Try again after some time";
	}
}
