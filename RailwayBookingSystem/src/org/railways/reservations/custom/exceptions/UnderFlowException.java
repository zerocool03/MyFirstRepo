package org.railways.reservations.custom.exceptions;

public class UnderFlowException extends MyException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Queue is Empty";
	}
}
