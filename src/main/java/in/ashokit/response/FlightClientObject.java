package in.ashokit.response;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.FlightInfo;
import in.ashokit.binding.MyFlight;

import java.util.*;
@Service
public class FlightClientObject
{
	public void getResponseInObject()
	{
		RestTemplate rt = new RestTemplate();
		String url = "http://mu.mulesoft-training.com/essentials/united/flights/";
		ResponseEntity<MyFlight> getForEntity = rt.getForEntity(url,MyFlight.class);
		MyFlight mf = getForEntity.getBody();
		List<FlightInfo> flightInfos =mf.getFlights();
		for(FlightInfo flight : flightInfos)
		{
			System.out.println(flight);
		}
		
	}

}
