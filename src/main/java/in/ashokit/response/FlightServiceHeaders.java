package in.ashokit.response;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.FlightInfo;
import in.ashokit.binding.MyFlight;

@Service
public class FlightServiceHeaders //Sending Headers from Client in RestTemplate Concept
{
	public void getResponse()
	{
		RestTemplate rt = new RestTemplate();
		String url = "http://mu.mulesoft-training.com/essentials/united/flights/";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept","application/json");
		HttpEntity entity = new HttpEntity(headers);
		ResponseEntity<MyFlight> responseEntity = rt.exchange(url,HttpMethod.GET,entity,MyFlight.class);
		MyFlight mf = responseEntity.getBody();
        List<FlightInfo> flightInfos =mf.getFlights();
                 
               for(FlightInfo flightInfo : flightInfos)
                 {
                	 System.out.println(flightInfo);
                 }
		
		
	}

}
