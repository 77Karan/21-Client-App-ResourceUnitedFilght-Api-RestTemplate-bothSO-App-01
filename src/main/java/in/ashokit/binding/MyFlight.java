package in.ashokit.binding;
import java.util.List;

import lombok.Data;
public class MyFlight 
{
	private List<FlightInfo> flights;

	public List<FlightInfo> getFlights() {
		return flights;
	}



	public void setFlights(List<FlightInfo> flights) {
		this.flights = flights;
	}



	
	

	@Override
	public String toString() {
		return "MyFlight [flights=" + flights + "]";
	}
	
	

}
