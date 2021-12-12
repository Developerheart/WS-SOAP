package soap;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "soap.Hellos")
public class  Hello implements Hellos {

	@WebMethod
	public String nome() {
		return "PORRA DE WEBSERVICE SOAP BIXO";
	}
}
