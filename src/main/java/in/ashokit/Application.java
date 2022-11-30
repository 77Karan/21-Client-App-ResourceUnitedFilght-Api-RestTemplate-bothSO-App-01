package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.response.FlightClientObject;
import in.ashokit.response.FlightClientString;
import in.ashokit.response.FlightServiceHeaders;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		/*FlightClientString fcs = context.getBean(FlightClientString.class);
		System.out.println(fcs.getResponseInString());*/
		
		/*FlightClientObject fco = context.getBean(FlightClientObject.class);
	      fco.getResponseInObject();*/
		
		FlightServiceHeaders fsh = context.getBean(FlightServiceHeaders.class);
		fsh.getResponse();
		
		
	}

}
