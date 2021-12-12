package soap;


import javax.xml.ws.Endpoint;

public class Starter {


	public static void main(String[] args) {


		Endpoint.publish("http://localhost:8080/ola", new Hello());


	}

}
