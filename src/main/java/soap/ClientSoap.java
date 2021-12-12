package soap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class ClientSoap {
		private static String URL = "http://localhost:8080/ola?wsdl";

	public static void main(String[] args) throws MalformedURLException {

		QName qName = new QName("http://soap/", "HelloService" );
		Service ws = Service.create(new URL(URL),  qName);
		Hellos port =  ws.getPort(Hellos.class);
		System.out.println(port.nome());

	}

}
