package co.edu.icesi.ketal.test.miscTest;
import java.net.URL;
import java.util.List;

import org.jgroups.Address;
import org.jgroups.protocols.TransportedVectorTime;

import co.edu.icesi.ketal.core.Event;


public class TransactionEvent implements Event {

	
	/*
	 * Constructor.
	 */
	public TransactionEvent(String event)
	{}
	
	@Override
	public boolean equals(Event e) {
		// No need this method
		return false;
	}

	@Override
	public Address getLocalization() {
		// No need this method
		return null;
	}

	@Override
	public boolean setLocalization(Address url) {
		// No need this method
		return false;
	}

	@Override
	public List<Address> getTargetLocalization() {
		// No need this method
		return null;
	}

	@Override
	public boolean setTargetLocalization(List<Address> url) {
		// No need this method
		return false;
	}

	@Override
	public TransportedVectorTime getTransportedVectorTime() {
		// No need this method
		return null;
	}

	@Override
	public boolean setTransportedVectorTime(TransportedVectorTime tvt) {
		// No need this method
		return false;
	}

}
