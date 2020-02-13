package webser;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT)
public class TestService {
	
	@WebMethod
	public String sayHello(String msg) {
		
			return "Hello "+msg;
	}
	public static void main(String[] args) {
		System.out.println("Start");
		Endpoint.publish("http://localhost:7858/testWS", new TestService());
		System.out.println("End");
	}
}
