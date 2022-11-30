package in.ashokit.response;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FlightClientString 
{
	public String getResponseInString()
	{
		RestTemplate rt = new RestTemplate();
		String url = "http://mu.mulesoft-training.com/essentials/united/flights/";
		ResponseEntity<String> getForEntity = rt.getForEntity(url,String.class);
		String body = getForEntity.getBody();
		return body;
	}

}
